package ObjectPool;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JDBCConnectionPool pool = new JDBCConnectionPool( "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");
        Connection con = pool.checkOut();

        pool.checkIn(con);
    }
}
