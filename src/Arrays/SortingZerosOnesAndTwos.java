package Arrays;

public class SortingZerosOnesAndTwos {



    public static void solution1(int[] arr){

        int n = arr.length;

        int zerosCount = 0;
        int onesCount = 0;
        int twosCount = 0;

        // TC: O(N) + O(N^2) 
        for(int i = 0;i<n;i++){
            if(arr[i] == 0) zerosCount++;
            else if(arr[i] == 1) onesCount++;
            else if(arr[i] == 2) twosCount++;
        }
        

        for(int i =0;i<n;i++){
            while(zerosCount > 0){
                arr[i] = 0;
                zerosCount--;
            }

            while(onesCount > 0){
                arr[i] = 1;
                onesCount--;
            }

            while(twosCount > 0){
                arr[i] = 2;
                twosCount--;
            }
        }
    }
    

    public static void solution2(int[] arr){
        int n = arr.length;

        int low = 0;
        int high = n - 1;
        int mid = 0;

        // TC: O(N)
        while(mid < high){

            // case 1:
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }



    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();


        solution2(arr);

        ArraysIO.display(arr);
    }
}
