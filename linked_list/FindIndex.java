package linked_list;

public class FindIndex {
    static int findNode(Node<Integer> head, int n){
        Node<Integer> temp = head;
        int k=0;
        while(temp!=null && temp.data != n){
            temp =temp.next;
            k=k+1;
        }
        if (temp==null){
            return -1;
        }
        return k;
    }
}
