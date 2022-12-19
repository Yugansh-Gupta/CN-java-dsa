package linked_list;

public class ReverseLL {
    static void printReverse(Node<Integer> root){
        Node<Integer> nextptr = root;
        Node<Integer> prev = null;
        Node<Integer> curptr = root;
        while(curptr!=null){
            nextptr = curptr.next;
            curptr.next = prev;
            prev = curptr;
            curptr = nextptr;
        }
        root = prev;
        Node<Integer> temp = root;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
