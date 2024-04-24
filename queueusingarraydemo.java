/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueusingarray;

/**
 *
 * @author LENOVO T480
 */
public class queueusingarraydemo {
    
public static void main(String[] args) {
ArrayQueue queue = new ArrayQueue(5);
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);
System.out.println(queue);
//[10, 20, 30, 0, 0]
System.out.println(queue.dequeue());
//10
System.out.println(queue);
//[0, 20, 30, 0, 0]
System.out.println(queue.dequeue());
//20
System.out.println(queue);
//[0, 0, 30, 0, 0]
queue.enqueue(40);
queue.enqueue(50);
System.out.println(queue);
//[0, 0, 30, 40, 50]
queue.enqueue(60);
}
}
