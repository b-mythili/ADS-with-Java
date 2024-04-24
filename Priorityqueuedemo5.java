package priorityqueuedemo5;
import java.util.PriorityQueue;
public class PriorityQueueDemo5 {
public static void main(String[] args) {
PriorityQueue queue = new PriorityQueue();
queue.offer(1);
queue.offer(3);
queue.offer(4);
queue.offer(5);
queue.offer(2);
System.out.println(queue);
//[1, 2, 4, 5, 3]
while(!queue.isEmpty())
{
System.out.println(queue.remove());
}
}
}
//o/p
//1
//2
//3
//4
//5