package Array;

import java.util.Arrays;

//중복 값을 제거한 새 배열을 만드시오
public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] newArr = new int[arr.length];
        boolean[] flag = new boolean[arr.length];
        int index = 0;
        for(int i=0; i < arr.length; i++){
            if(!flag[arr[i]]){
                flag[arr[i]] = true;
                newArr[index++] = arr[i];
            }
        }


        for(int i=0; i <index; i++){
            System.out.print(newArr[i] + " ");
        }
        //System.out.println(Arrays.toString(newArr));
    }
}
