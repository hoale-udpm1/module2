package Node;

public class Node {
    public int key;
    public Node next;
    public Node(int key){
        this.key = key;
        this.next = null;
    }
}
class MyLinkedListQuere{
    private Node head;
    private Node tail;
    public MyLinkedListQuere(){
        this.head = null;
        this.tail = null;
    }
}
