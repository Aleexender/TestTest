package codingtest;

public class MainIHateSameNum {
    public static void main(String[] args) {
        IHateSameNum iHateSameNum = new IHateSameNum();
       int[] arr = new int[]{1,1,0,3,3,4,4}; //
        iHateSameNum.solution(arr);
        System.out.println(iHateSameNum.solution(arr));

    }
}
