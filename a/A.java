package BIT.Reflex.a;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-16
 * Time:19:36
 */
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        int index = s.indexOf("10");
        System.out.println(index);
        int mid = 2;
        for(int i = index+2;i<s.length()-2;i++){
            if(s.substring(i,i+2).equals("10")){
                mid += 2;
            }else if(s.substring(i,i+1).equals("1")){
                mid += 1;
            }else{
                mid = 0;
            }
            max = Math.max(mid,max);
        }
        System.out.println(max);
    }
    public static void code1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<3)return;
        long[] arr = new long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        long a = arr[n-1]*arr[n-2]*arr[n-3];
        long b = arr[0]*arr[1]*arr[n-1];
        long p = a>b?a:b;
        System.out.println(p);
        /*String s1 = "ookvnorsiwwddjkpqasgbqjqrgsyriuxsruxidwprr" +
                "xagjxzbwwgztsgndyfoelcgfzqzxzximtdwjlkhouxqrdzdguhx" +
                "weqkvqabcltywygpbgeprmhbltnhkhynvpuszoqdrspwldgecrbvzsiywkfzphczpxyeyzhdhnegmodldikwnjhlwer";

        String s2 = "ookvnorsiwwddjkpqasgbqjqrgsyriuxsruxidwprrxagjxzbwwgztsgndyfoelcgfzqzxzximtdwjlkhouxqrdzdguhxwe" +
                "qkvqabcltywygpbgeprmhbltnhkhynvpuszoqdrspwldgecrbvzs" +
                "iywkfzphczpxyeyzhdhnegmodldikwnjhlwer";
        System.out.println(s1.equals(s2));
        System.out.println(getNum(15,4));*/
    }

    public static int getNum(int m,int n){
        if(n<=1 || m <= 1){
            return -1;
        }
        int z = 0;
        for(int i = 1;i<=m;i++){
            z = (z+n)%i;
        }
        return z++;
    }

    public static int getNum1(int n,int m){
        if(n<=1||m<=1){
            return -1;
        }
        if(n==2){
            if(m%2 == 0){
                return 1;
            }else{
                return 2;
            }
        }else{
            return (getNum1(n-1,m)+m-1) % n + 1;
        }
    }
}
