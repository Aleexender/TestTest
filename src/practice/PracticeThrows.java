package practice;

public class PracticeThrows{



    public static void asd() {
        Integer a = null;
        try{
            if(a.equals("a")){
                System.out.println("not error");
            }
//            throw new Exception();

        } catch (NullPointerException npe){

            System.out.println("error");

        }
    }
