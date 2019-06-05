package calendar;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:实现一个日历，输入年月，打印当月日历，从0年开始计数
 * User:Mr.Du
 * Date:2019-06-05
 * Time:23:36
 */

public class Main {

    public static void main(String[] args) {
        print(2019,2);
    }

    //判断是否是闰年
    public static boolean isLeap(int y){
        return y%4 == 0 && y%100 != 0 || y%400 == 0;
    }
    //返回当月1号是礼拜几，公式，上月一号的礼拜几加上上月的天数mod7
    public static int weekday(int y){
        //用于计数，表示y-1年以前有多少个闰年
        int count = 0;
        for(int i = 1;i<y;i++){
            if(isLeap(i)){
                count++;
            }
        }
        return (365*(y-1)+count)%7+1;
    }

    public  static void print(int y,int m){
        int[] mon = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] monfirweek = new int[13];
        //获取该年一月一号是礼拜几
        monfirweek[1] = weekday(y);
        //判断输入的年是不是闰年，闰年二月29天
        if(isLeap(y)) mon[2]+=1;
        for(int i = 2;i<12;i++){
            monfirweek[i] = (monfirweek[i-1]+mon[i-1])%7;
            if(monfirweek[i] == 0){
                monfirweek[i] = 7;
            }
        }
        System.out.println("       "+y+" 年  "+m+" 月     ");
        System.out.println("日   一   二   三   四   五   六");
        int count = monfirweek[m]+1;
        int t = count;
        while(t>0){
            System.out.print("    ");
            t--;
        }
        for(int i = 1;i<=mon[m];i++){
            if((count)%7==0){
                if(i<10)
                    System.out.println("0"+i+"  ");
                else
                    System.out.println(i+"  ");
            }else{
                if(i<10)
                    System.out.print("0"+i+"   ");
                else
                    System.out.print(i+"   ");
            }
            count++;
        }
        System.out.println();

    }

}
