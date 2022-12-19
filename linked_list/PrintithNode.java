package linked_list;

public class PrintithNode {
    static void printithNode(Node<Integer> head, int i){
        int k= 0;
        Node<Integer> temp = head;
        while(k!=i && temp!=null){
            temp=temp.next;
            k=k+1;
        }
        if(temp==null){
            return;
        }
        System.out.println(temp.data);
    }
}
