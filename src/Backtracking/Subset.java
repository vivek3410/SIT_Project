package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subset{

    static void helper(int[] arr,int index,List<Integer> list){
        if(index == arr.length){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        helper(arr, index+1, list); // includeing the next elemnt

        list.remove(list.size() - 1);
        helper(arr, index+1, list);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();

        helper(arr, 0, list);   
    }
}