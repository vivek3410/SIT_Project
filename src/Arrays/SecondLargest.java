package Arrays;

public class SecondLargest {
    
    public static int solution1(int[] arr){

        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                sMax = max;
                max = arr[i];
            }else if(arr[i] > sMax && arr[i] < max){
                sMax = arr[i];
            }
        }

        return sMax;
    }

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        System.out.println(solution1(arr));
    }
}
