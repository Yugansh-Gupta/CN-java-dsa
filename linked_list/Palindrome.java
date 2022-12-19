package linked_list;

public class Palindrome {
    static boolean isPalindrome(Node<Integer> head){
        Node<Integer> nextptr = head;
        Node<Integer> prev = null;
        Node<Integer> curptr = head;
        Node<Integer> newListHead = new Node<Integer>(0);
        Node<Integer> newListTemp = newListHead;
        while(curptr!=null){
            newListTemp.data = curptr.data;
            newListTemp.next = new Node<Integer>(0);
            newListTemp = newListTemp.next;
            nextptr = curptr.next;
            curptr.next = prev;
            prev = curptr;
            curptr = nextptr;
        }
        head= prev;
        Node<Integer> revTemp = head;
        Node<Integer> newTemp = newListHead;
        while(revTemp!=null && newTemp!=null){
            if (!(revTemp.data.equals(newTemp.data))){
                return false;
            }
            revTemp=revTemp.next;
            newTemp=newTemp.next;
        }
        return true;
    }
}
