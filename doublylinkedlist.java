import java.util.LinkedList;
 class doublylinkedlist<T> {
     private LinkedList<T> list;
     public doublylinkedlist(){
         list=new LinkedList<>();
     }
     public void addFirst(T element){
         list.addFirst(element);
     }
     public void addLast(T element){
         list.addLast(element);
     }
    public T getFirst(){
        return  list.getFirst();
     }
    public T getLast(){
        return list.getLast();
    }
    public T removeFirst(){
       return   list.removeFirst();
     }
    public T removeLast(){
       return   list.removeLast();
     }
}
