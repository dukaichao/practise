package Collections.Map.dashuxiangcheng;

import java.io.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-06-11
 * Time:0:01
 */

public class Main{
    public String mul(String num1,String num2){
        int[] nums1 = new int[num1.length()],nums2=new int[num2.length()],res=new int[num1.length()+num2.length()];
        for(int i =num1.length()-1; i >=0;i --){
            nums1[i] = num1.charAt(num1.length()-1-i)-'0';
        }
        for(int i =num2.length()-1; i >=0;i --){
            nums2[i] = num2.charAt(num2.length()-1-i)-'0';
        }
        for(int i =0; i < num1.length(); i++){
            for(int j = 0;j <num2.length();j++){
                res[i+j] += nums1[i]*nums2[j];
            }
        }
        //进位和留位
        for(int i =1;i<res.length;i++){
            //进位
            res[i] += res[i-1]/10;
            //留位
            res[i-1] = res[i-1]%10;
        }
        StringBuffer buffer = new StringBuffer();
        boolean start = false;
        for(int i =res.length-1; i >=0; i--){
            if (!start &&res[i] == 0) continue;
            else start = true;
            buffer.append(res[i]);
        }
        return buffer.toString();
    }
    public static void main(String[] args) throws IOException{
        Main c = new Main();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] inputs = input.split(" ");
        String res = c.mul(inputs[0],inputs[1]);
        System.out.println(res);
    }
}
