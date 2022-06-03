package Array;

import java.util.ArrayList;
import java.util.Arrays;

// 배열 arr의 데이터를 순서를 거꾸로 변경하세요.
public class Practice3 {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList(Arrays.asList(1, 3, 5, 7, 9));
        int[] arr = {1, 3, 5, 7, 9};

        for(int i=0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
