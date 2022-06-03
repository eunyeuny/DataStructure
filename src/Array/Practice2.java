package Array;
// 배열 arr 에서 target에 해당하는 값의 인덱스를 출력
// 여러개인 경우 가장 큰 인덱스 출력
public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int index = -1;


        for(int i=0; i < arr.length; i++){
            if(target == arr[i]){
                index = i;
            }
        }

        System.out.println(index);
    }
}
