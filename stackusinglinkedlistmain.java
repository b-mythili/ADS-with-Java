
public class stackusinglinkedlistmain {
    public static void main(String[] args) {
      stackusinglinkedlist<Integer> stack = new  stackusinglinkedlist<>();
    stack.push(3);
    stack.push(5);
    stack.push(3);
    
  
        System.out.println("stack element:"+stack);
        System.out.println("poped elemt:"+stack.pop());
        System.out.println("top elemnt:"+stack.peek());
        System.out.println("is stack empty:"+stack.isEmpty());
        System.out.println("stack size:"+stack.size());
    }
    
    
}
