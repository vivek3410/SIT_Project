package Arrays;

public class SumOfArray {
    
    public static int solution1(int[] arr){

        int sum = 0;

        for(int i= 0;i<arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();

        int result = solution1(arr);

        System.out.println(result);

    }

}
