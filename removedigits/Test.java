package duz.removedigits;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定一个数字1，删除k个数字后，数字最小
 * User:Mr.Du
 * Date:2019-05-07
 * Time:23:05
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(removeKDigits2("3549",2));
    }
    public static String removeKDigits1(String s,int k){
        if(k == s.length()) return "";
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(i<s.length()-1&&k>0){
            int a = s.charAt(i) - '0';
            int b = s.charAt(i+1) - '0';
            if(a<b){
                sb.append(s.charAt(i));
            }else{
                k--;
            }
            i++;
        }
        if(i == s.length()-1) {
            sb.append(s.charAt(s.length() - 1));
        }else{
            sb.append(s.substring(i));
        }
        if(k>0){
            sb = new StringBuffer(sb.substring(0,sb.length()-k));
        }
        s = sb.charAt(0) == '0'?sb.substring(1):sb.toString();
        return s;
    }
    public static String removeKDigits2(String s,int k){
        String str = s;
        while(k>0){
            boolean b = false;
            for(int i = 0;i<str.length() - 1;i++){
                if(str.charAt(i)>str.charAt(i+1)) {
                    str = str.substring(0,i)+str.substring(i+1);
                    b = true;
                    break;
                }
            }
            if(!b){
                str = str.substring(0,str.length()-1);
            }
            str = str.charAt(0) == '0'?str.substring(1):str;
            k--;
        }
        if(str.length() == 0) return "0";
        return str;
    }
}
