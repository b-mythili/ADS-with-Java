/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Arrays;
class ArrayQueue{
    private final int[] items;
      
       private int rear;
        private int front;
         private int count;
         
    public ArrayQueue(int capacity){
        items=new int[capacity];
                
    } 
    public void enqueue(int item){
        if(isFull()){
         throw new IllegalStateException();
        }
        items[rear]=item;
        rear=(rear+1)%items.length;
        count++;
    }
        public int dequeue(){
            if(isEmpty()){
                throw new IllegalStateException();
            }
            var item=items[front];
            items[front]=0;
            front=(front+1)%items.length;
            count--;
            return item;
        }
        public int peek(){
            if(isEmpty()){
                throw new IllegalStateException();
            }
            return items[front];
        }
         public boolean isFull(){
            return count==0;
        }
        public boolean isEmpty(){
            return count==items.length;
        }
        @Override
        public String toString(){
            return Arrays.toString(items);
        }
}
/**
 *
 * @author LENOVO T480
 */
public class Circularqueueusingarray {
public static void main(String[] args) {
        // TODO code application logic here
        ArrayQueue queue=new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue);
    }
    
}