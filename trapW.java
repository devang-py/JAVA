public class trapW{

    public static void Trappedwater( int arr[]){
        int n = arr.length;
        //calc left max biundry
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1 ;i<n ;i++){
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }

        //calc right max
        int rightMax[] = new int[n];
        rightMax[n-1]= arr[n-1];
        for(int i=n-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        //loop 
        int sumofTW =0;
        for(int i=0 ; i<n ; i++){
            sumofTW +=  (Math.min(leftMax[i] , rightMax[i]) - arr[i]);
            System.out.println(leftMax[i]+ "," +rightMax[i]);
        }

        System.out.println("trapped water is :" + sumofTW);
        //waterlevel = min of left and right 
        //treapped water = min -barlevel *width
    }


    public static void main(String[] args) {
        int num[] = {4, 2, 0, 6, 3, 2, 5};
        Trappedwater(num);

    }
}