package Backtracking;

public class SubsetSum {

    static boolean helper(int[] arr,int index,int sum,int target){
        if(target == sum){
            return true;
        }

        if(index == arr.length) return false;

        // include current element
        if(helper(arr, index + 1, sum + arr[index], target)) return true;

        if(helper(arr, index + 1, sum, target)) return true;

        return false;
    }
    

    public static void main(String[] args) {
        int[] arr = {3,34,4,12,5};

        int target = 9;

        System.out.println(helper(arr,0,0,target));
    }
}
