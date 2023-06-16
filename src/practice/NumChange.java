package practice;

public class NumChange {
    public static void main(String[] args) {
        String qwe = "10S";
        String changeNum = "";
        for(int i =0; i< qwe.length(); i++){
            if(!Character.isAlphabetic(qwe.charAt(i))){
                changeNum += qwe.charAt(i);
            }
        }
        Integer.parseInt(changeNum);


        System.out.println(changeNum);
    }


}
