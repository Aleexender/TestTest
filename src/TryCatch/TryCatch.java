package TryCatch;

public class TryCatch {

    public static void main(String[] args) {
        String a = null;

        try{
            System.out.println("not error");
            if("a".equals(a)){
                System.out.println("a=a");
            }
        }catch (Exception exception){
            System.out.println("error in ");
        }finally {
            System.out.println("sadasdasd");
        }
