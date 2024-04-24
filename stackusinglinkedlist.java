import java.util.LinkedList;
public class stackusinglinkedlist <T> {
   private LinkedList<T> list;
   public stackusinglinkedlist(){
       list =new LinkedList<>();
   }
   public void push( T element  ){
       list.addLast(element);
   }
   public T pop(){
       if (isEmpty()){
           return null;
       }
       return list.removeLast();
   }
   public T peek(){
       if (isEmpty()){
           return null;
       }
       return list.getLast();
   }
   public boolean isEmpty(){
       return list.isEmpty();
       
   }
   public int size(){
       return list.size();
   }
    @Override
    public String toString() {
        return "Stack elements: " + list.toString();
    }
}

