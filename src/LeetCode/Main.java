package LeetCode;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
//    String s = "K1:F2";
//    char[] arr = s.toCharArray();
//        System.out.println(Arrays.toString(arr));
//    int n = arr[arr.length - 1];
//    char m = arr[0];
//    char q = arr[arr.length - 2];
//    int l = m;
//    int g = q;
//        System.out.println(l);
//        System.out.println(g);
//        for (int i = 0; i < q - l + 1; i++) {
//        for (int j = 0; j < n; j++) {
//
//        }
//    }


//    https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
    public List<String> cellsInRange(String s) {
        String[] str=s.split(":");
        int k=0, a=0, b=150;
        for (int i = 0; i < str.length; i++) {
            int x=Integer.parseInt(str[i]);
            if (k<x){
                k=x;
            }
            char con=str[i].charAt(0);
            if (a<con){

            }
        }
        return null;

    }
}
