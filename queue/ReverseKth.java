package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKth{
    static void reverse(Queue<Integer> input) {
        //Your code goes here
        int i ;
        if (!input.isEmpty()) {
            i = input.remove();
            reverse(input);
            input.add(i);
        }
    }
    static Queue<Integer> revreseKElelements(Queue<Integer> input, int k ){
        if(k==0){
            return input;
        }
        Queue<Integer> aux = new LinkedList<Integer>();
        while(k!=0){
            aux.add(input.remove());
            k--;
        }
        reverse(aux);
        while(!input.isEmpty()){
            aux.add(input.remove());
        }
        return aux;
    }
}