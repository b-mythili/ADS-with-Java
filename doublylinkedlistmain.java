/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO T480
 */
public class doublylinkedlistmain {
        public static void main(String[] args) {
            doublylinkedlist<Integer>  dll=new doublylinkedlist<>();
            dll.addLast(1);
            dll.addLast(2);
            dll.addLast(3);
                   
            System.out.println(dll);
              System.out.println("first elemnt in dll is:"+dll.getFirst());
              System.out.println("last elemnt in dll :"+dll.getLast());
              dll.removeLast();
              dll.addFirst(0);
              System.out.println("after insertion first pos elemnt is:"+dll.getFirst());
              System.out.println("after del last elemnt :"+dll.getLast());
    }
            
    
}
