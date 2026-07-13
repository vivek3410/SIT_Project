package Arrays;

public class MoveNegativeValues {
    

    public static void solution(int[] arr){
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while(left <= right){

            if(arr[left] < 0){
                left++;
            }else if(arr[right] >= 0) {
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);

        ArraysIO.display(arr);
    }
}
