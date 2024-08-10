/* Pseudocode:
Define class Queue
Initialize a linked list to store queue elements
Enqueue to add elements to the end of the queue
Dequeue to remove and return elements from the front of the queue
*/

package DataStructures;
import java.util.LinkedList;
public class Queue { // Queue Class following FIFO.
    // Linked list for queue elements
    private LinkedList<String> list = new LinkedList<>();

    public void Enqueue(String item) {
        list.addLast(item); // Adds item to end of list
    }

    public String Dequeue() {
        return list.removeFirst(); // Removes and returns first item of list
    }
}
