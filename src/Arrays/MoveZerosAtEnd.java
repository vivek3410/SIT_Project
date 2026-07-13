package Arrays;

public class MoveZerosAtEnd {

    public static void solution(int[] arr){
        int n = arr.length;
        int j = 0;

        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);

        ArraysIO.display(arr);
    }
}
