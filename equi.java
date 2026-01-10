public class equi{

    public static int equilibrium(int arr[]){
        int lsum =0;
        int rsum =0;
        int n = arr.length;
            for(int i=1 ; i<=n-2 ; i++){
                if(n == 1){
                    lsum = arr[0];
                }
                else{
                    for(int j=i-1; j<0 ; j-- ){
                        lsum+= arr[j];
                    }
                }
                //for rightsum
                if(n == n-2){
                    rsum = arr[n-1];
                }
                else{
                    for(int j=i+1;j<=n-1 ; j++ ){
                        rsum+= arr[j];
                    }
                }
                if(lsum == rsum){
                    return i;
                    // break outerLoop;
                }

                }
                return -1;
            }

    public static void main(String[] args) {
        int arr[] = {1,2,3,0,4,1,1};
        int result =equilibrium(arr);
        System.out.println(result);

    }
}