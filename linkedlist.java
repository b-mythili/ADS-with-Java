//package linkedlist;
import java.util.*;
public class linkedlist{

    
    public static void main(String args[]) {
        
        
    LinkedList<String> ll=new LinkedList<String>();
    ll.addFirst("hi");
    ll.add("hello");
    ll.add("welcome");
    ll.addLast("good mrng");
    System.out.println(ll);
    ll.remove("welcome");
    ll.removeFirst();
    ll.removeLast();
    System.out.println(ll);        

    }
    
    
}
