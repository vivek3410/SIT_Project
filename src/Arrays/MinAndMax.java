package Arrays;

public class MinAndMax {


    public static void solution1(int[] arr){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maxium: " + max + " Minimum: " + min);
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution1(arr);
    }
}
