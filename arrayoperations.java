import java.util.Arrays;
public class arrayoperations {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        Arrays.sort(array);
        System.out.println("sorted arr:"+Arrays.toString(array));
        String arrayAsString=Arrays.toString(array);
        
        System.out.println("array as string :"+arrayAsString);
        int index =Arrays.binarySearch(array,5);
        System.out.println("index of 5:"+index);
        int [] filledArray =new int[5];
        Arrays.fill(filledArray,10);
        System.out.println("filled array:"+Arrays.toString(filledArray));
                
    }
    
    
}
