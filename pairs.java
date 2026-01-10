public class pairs{

    public static void MaxSubArrays(int arr[]){
        int curSum;
        int maxSum = Integer.MIN_VALUE;
        //start lopp
        for(int i =0 ; i < arr.length ; i++){
            //end loops
            
            for(int j=i ; j<arr.length ; j++){
                //loop which will print
                curSum = 0;
                for(int k=i ; k<=j ; k++){
                    curSum += arr[k];
                }
                System.out.println(curSum);
                if(maxSum < curSum){
                    maxSum = curSum;
                } 
            }
        }

        System.out.println("the maximum sum f possible element sin arr is :" + maxSum);

    }

    public static void prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        int curSum;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];

        for(int i=1 ; i<arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //start lopp
        for(int i =0 ; i < arr.length ; i++){
            //end loops
            for(int j=i ; j<arr.length ; j++){
                //loop which will print
                curSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(curSum>maxSum){
                    maxSum = curSum;
                }
                
            }
    }

        System.out.println("the maximum sum f possible element sin arr is :" + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8};
        prefixSum(arr);
        
        

    }
}