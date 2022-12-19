package linked_list;

public class DeleteNodeInLL {
    static Node<Integer> deleteNode(Node<Integer> head,int pos){
        Node<Integer> temp = head;
        int k =0;
        if (pos==0){
            head = head.next;
            return head;
        }
        while(k!=pos-1 && temp!=null){
            temp=temp.next;
        }
        if (temp.next==null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}
