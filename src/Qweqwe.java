public class Qweqwe {
    public static void main(String[] args) {
            String a = "샤넬";
//            System.out.println("VALUES('"+a+"')");
        String age = "27";
        String job = "무직";
        String id = "404";

//        System.out.println("김정훈("+age+",'"+job+"')");
//        System.out.println("김정훈("+age+", +1 )");
//        System.out.println(("INSERT INTO member(id,count)\n" + "VALUES( '" + "id" + "', +1)"));

        System.out.println("INSERT INTO member (`id` , `count`)\n" + "VALUES ('"+id+"', 1 ) ON DUPLICATE KEY UPDATE `count`=  `count`+1;");
        System.out.println();
        System.out.println("INSERT INTO member (`id` , `count`)\n" + "VALUES (id, 1 ) ON DUPLICATE KEY UPDATE `count`=  `count`+1;");
    }
    }
