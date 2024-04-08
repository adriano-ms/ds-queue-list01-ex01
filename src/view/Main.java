package view;

import br.edu.fateczl.queue.Queue;
import br.edu.fateczl.stack.IntStack;

public class Main {

    public static void main(String[] args){

        Queue<Integer> queue = new Queue<>();

        queue.insert(18);
        queue.insert(39);
        queue.insert(12);
        queue.insert(73);
        queue.insert(90);
        queue.insert(61);

        System.out.print("Before: ");
        System.out.println(queue);

        try {
            invertQueue(queue);

            System.out.print("After: ");
            System.out.println(queue);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void invertQueue(Queue<Integer> queue) throws Exception {
        IntStack aux = new IntStack();

        while (!queue.isEmpty())
             aux.push(queue.remove());

        while (!aux.isEmpty())
            queue.insert(aux.pop());
    }

}
