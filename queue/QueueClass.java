package queue;

public class QueueClass<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueClass(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public void enqueue(T data){
        if(isEmpty()){
            rear = new Node<T>(data);
            front = rear;
        }else{
            Node<T> newNode = new Node<T>(data);
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }else if(front==rear){
            Node<T> delNode = new Node<T>(front.data);
            front = null;
            rear = null;
            size--;
            return delNode.data;
        }else{
            Node<T> delNode = new Node<T>(front.data);
            front = front.next;
            size--;
            return delNode.data;

        }
    }

    public T front(){
        if(isEmpty()){
            return null;
        }else{
            return front.data;
        }
    }

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }
}
