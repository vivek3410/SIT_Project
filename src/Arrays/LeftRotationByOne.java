package Arrays;

public class LeftRotationByOne {

    public static void solution(int[] arr){

        int n = arr.length;

        // step 1: stronging first element
        int temp = arr[0];

        // step 2: moving all elemennts to its left
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }


        // step 3: updating last pos with temp
        arr[n-1] = temp;
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        // printing array before rotating by 1
        ArraysIO.display(arr);

        // logic for rotating by 1
        solution(arr);

        // printing array after rotating by 1
        ArraysIO.display(arr);
    }
}
