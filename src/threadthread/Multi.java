package threadthread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multi {
    public static void main(String[] args) {
        Integer a = -129;
        Integer b = -129;
        System.out.println(a == b);
    }

    public static List<Integer> fun(TreeNode root){
        List<Integer> list = new ArrayList<>();
        //base case
        if(root == null){
            return list;
        }

        if(root.left == null && root.right == null){
            list.add(root.val);
            return list;
        }

        //recursive case
        List<Integer> arr1 =fun(root.right);
        List<Integer> arr2 =fun(root.left);

        list.addAll(arr1);
        list.addAll(arr2);

        return list;
    }
}


