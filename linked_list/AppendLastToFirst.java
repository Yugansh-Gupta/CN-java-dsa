package linked_list;

public class AppendLastToFirst {
    static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        int k =0;
        Node<Integer> temp =head;
        if (temp==null){
            return head;
        }
        while(temp.next!=null){
            temp = temp.next;
            k=k+1;
        }
        k=k+1;
        int i = k-n;
        if(i<=0){
            return head;
        }
        temp.next = head;
        while((i-1)!=0){
            head = head.next;
            i=i-1;
        }
        Node<Integer> last = head;
        head = last.next;
        last.next = null;
        return head;
    }
}
