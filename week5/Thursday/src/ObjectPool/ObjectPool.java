package ObjectPool;

import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private long expriationTime;

    private Hashtable<T, Long> locked, unlocked;

    public ObjectPool(){
        expriationTime = 3000;
        locked = new Hashtable<T, Long>();
        unlocked = new Hashtable<T, Long>();
    }

    protected abstract T create() throws SQLException;
    public abstract boolean validate(T o);
    public abstract void expire(T o);
    public synchronized T checkOut() throws SQLException {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expriationTime) {
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    } else {
                        t = null;
                    }
                }
            }
        }
        t = create();
        locked.put(t, now);
        return (t);

    }
    public synchronized void checkIn(T t){
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}
