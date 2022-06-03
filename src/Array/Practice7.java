package Array;
//2차원 배열 arr을 시계방향 90도 회전시킨 결과를 출력하시오
public class Practice7 {
    static void printArr(int[][] arr){
        for(int[] item1D : arr){
            for(int item : item1D){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int[][] arr90 = new int[arr[0].length][arr.length];

        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                int r = arr.length -1 -i;
                arr90[j][r] = arr[i][j];
            }
        }

        printArr(arr);
        System.out.println("==");
        printArr(arr90);
    }
}
