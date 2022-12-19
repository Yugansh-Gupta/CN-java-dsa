package linked_list;

public class RemoveDuplicates {
    static Node<Integer> removeDuplicate(Node<Integer> head){
//        Node<Integer> temp = head;
//        while(temp!=null){
//            if (temp.next!=null && temp.data == temp.next.data){
//                temp.next = temp.next.next;
//            }else{
//                temp = temp.next;
//            }
//        }
        Node<Integer> t1 = head;
        if (t1==null || t1.next==null){
            return head;
        }
        Node<Integer> t2 = head.next;
        while(t2!=null){
            if (!(t1.data.equals(t2.data))) {
                t1.next = t2;
                t1 = t1.next;
            }
            t2 = t2.next;
        }
        t1.next=t2;
        return head;
    }
}
