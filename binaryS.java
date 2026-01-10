public class binaryS {

    public static int BinarySearch(int arr[] , int key ) {
        int start = 0;
        int end = arr.length - 1;

        while( start <= end){
            int mid = start + ((end - start) / 2);

            if(arr[mid] == key){
                return mid;
            }if(arr[mid] > key){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        int result = BinarySearch(numbers, key);
        System.out.print("the number " + key + " is at this index : " + result );
        
    }
}
