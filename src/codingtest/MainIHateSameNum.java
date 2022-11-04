package codingtest;

public class MainIHateSameNum {
    public static void main(String[] args) {
        IHateSameNum iHateSameNum = new IHateSameNum();
       int[] arr = new int[]{1,1,0,3,3,4,4};
        int[] arr2 = new int[]{1,0,1,3,4,4};
        System.out.println(iHateSameNum.solution(arr));

    }
}
