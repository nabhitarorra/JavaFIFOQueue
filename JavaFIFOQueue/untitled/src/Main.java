import DataStructures.*;

/* Pseudocode:
Queue object
Enqueue First Item into queue
Enqueue Second into queue
Enqueue Third into queue
Enqueue Fourth into queue
Dequeue item from queue and print
Dequeue next item and print
Dequeu next item and print
Dequeue last item and print
*/

public class Main {
    public static void main(String[] args) {
        // Create a new instance of Queue
        Queue q = new Queue();

        // Adding items to the queue
        q.Enqueue("First Item"); // Adds "First Item" to the queue
        q.Enqueue("Second Item"); // Adds "Second Item" to the queue
        q.Enqueue("Third Item"); // Adds "Third Item" to the queue
        q.Enqueue("Fourth Item"); // Adds "Fourth Item" to the queue

        // Removing items from the queue and printing them
        System.out.println(q.Dequeue()); // Will print "First Item", which is the first enqueued
        System.out.println(q.Dequeue()); // Will print "Second Item", now at the front
        System.out.println(q.Dequeue()); // Will print "Third Item"
        System.out.println(q.Dequeue()); // Will print "Fourth Item", which is the last
    }
}

/*
First Item
Second Item
Third Item
Fourth Item

Process finished with exit code 0 */

