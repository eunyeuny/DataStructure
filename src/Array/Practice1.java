package Array;
//배열 arr의 모든 데이터에 대하여 짝수데이터 평균과 홀수데이터 평균을 출력하세요
public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        float sum1 = 0;
        float sum2 = 0;
        int evenCnt = 0;
        int oddCnt = 0;

        for(int item : arr){
            if(item % 2 ==0){
                sum1 += item;
                oddCnt++;
            }
            else{
                sum2 += item;
                evenCnt++;
            }
        }

        System.out.println("짝수 평균 : " + sum1 / oddCnt);
        System.out.println("홀수 평균 : " + sum2 / evenCnt);


    }
}
