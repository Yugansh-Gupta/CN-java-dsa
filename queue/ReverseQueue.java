package queue;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
    static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
        int i ;
        if (!input.isEmpty()) {
            i = input.remove();
            reverseQueue(input);
            input.add(i);
        }
    }

}