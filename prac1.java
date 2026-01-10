import java.util.*;

public class prac1{

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int index =0;
        for(int i=0 ; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
                index = i;
            }
        }
        return largest;
        // return index+1;
    }
    public static void main(String[] args){
        int numbers[] = { 1,2,3,11,5,6,4};
        System.out.print("the index of largest number is :" + getLargest(numbers));
    }
}