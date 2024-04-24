/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO T480
 */
public class stackusingarraymain {
    public static void main(String[] args) {
        stackusingarray<Integer> stack=new stackusingarray<>(5);
        stack.push(19);
        stack.push(89);
        stack.push(69);
        System.out.println("stack using arr:");
        System.out.println("element popped :"+stack.pop());
        System.out.println("is stack empty?"+stack.isEmpty());
        System.out.println("stack size:"+stack.size());
        
    }
    
}
