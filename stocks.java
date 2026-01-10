public class stocks{
    public static int eqipoint(int arr[]){
        int n = arr.length;
        int Leftsum =0;
        int Rightsum =0;
        for(int i=1 ; i<n ; i++){
            //for left sum
            for(int j=i-1 ; j>=0 ; j++){
                Leftsum += arr[j];
            }
            //for right sum
            for(int k=i+1 ; k<=n ; k++){
                Rightsum += arr[k];
            }
            if(Leftsum == Rightsum){
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,3};
        int result = eqipoint(arr);
        System.out.println(result);
    }
}