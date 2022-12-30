package stack;

public class StackUsingLL {

//    data members
    private Node<Integer> top;
    private int size;
    public StackUsingLL(){
        top = null;
        size = 0;
    }
//    public function
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if (top==null){
            return true;
        }
        return false;
    }

    public void push(int ele){
        Node<Integer> newNode = new Node<Integer>(ele);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public int top(){
        if (isEmpty()){
            return -1;
        }
        return top.data;
    }
}
