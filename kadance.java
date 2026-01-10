public class kadance{

    public static int kadanceP(int arr[]){
        int cs =0 ;
        int ms = Integer.MIN_VALUE ;
        for(int i=0 ; i<arr.length ; i++){
                cs = cs + arr[i];
                if(cs<0){
                    cs =0;
                }
                ms = Math.max(cs, ms);
        }
        return ms;
        // System.out.println();
        // System.out.println(ms);
    }

    public static int kadanceN(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        //only if rray is posititve
        int maxSum = kadanceP(nums);
        System.out.println(maxSum);
        //if array is negativee
        int num2[]={-1,-2,-3,-4};

        
        int negms = kadanceN(num2);
        System.out.println();
        System.out.print("the maximum sum of array is: " + negms);
        
        

    }

}
