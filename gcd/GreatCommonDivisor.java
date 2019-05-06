package duz.gcd;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-06
 * Time:20:23
 * 两数的最大公约数
 * 1.暴力法：时间复杂度为O(min(a,b))
 * 2.辗转相除法：时间复杂度不好计算，可以近似的看成O(log(max(a,b)))，取模性能较差
 * 3.更相减损术：避免取模运算，但是算法想能不稳定，最坏时间复杂度为O(max(a,b))
 * 4.更相减损术与移位相结合：不但避免了取模运算，而且算法性能稳定，时间复杂度为O(log(max(a,b)))
 */
public class GreatCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd4(10,14));
    }

    //暴力法
    public static int gcd1(int a,int b){
        int big = a>b?a:b;
        int small = a<b?a:b;
        if(big%small == 0){
            return small;
        }
        for(int i = small/2;i>1;i--){
            if(small%i == 0 && big % i == 0){
                return i;
            }
        }
        return 1;
    }

    /**
     * 辗转相除法
     *
     * 这条算法基于一条定理，两个正整数a，b(a>b),它们的最大公约数等于a除以b的余数c和b之间的最大公约数
     * 例如：10和25，25除以10商2余5，那么10和25的最大公约数等同于10和5的最大公约数。
     * 有了这条定理我们求最大公约数就变得简单。我们可以使用递归的方法把问题逐步简化
     * 首先，计算出a除以b的余数c，把问题简化成b和c的最大公约数；然后计算出b除以c的余数d，把问题转化成求c和d的最大公约数....
     * 以此类推，逐渐把两个较大整数之间的运算简化成两个较小整数之间的运算，直到两个数可以整除，或者其中一个数减小到1为止
     * @param a
     * @param b
     * @return
     */
    public static int gcd2(int a,int b){
        int big = a>b?a:b;
        int small = a<b?a:b;
        if(big%small == 0){
            return small;
        }
        return gcd2(big%small,small);
    }

    /**
     * 更相减损术
     *
     * 这条算法基于一条定理，两个正整数a，b(a>b),求它们的最大公约数等于a-b的差值c和b之间的最大公约数
     * 例如：10和25，25-10 = 15，那么10和25的最大公约数等同于10和15的最大公约数。
     * 有了这条定理我们求最大公约数就变得简单。我们可以使用递归的方法把问题逐步简化
     * 首先，计算出a-b的差值c，把问题简化成b和c的最大公约数；然后计算出b-c的差值d，把问题转化成求c和d的最大公约数....
     * 以此类推，逐渐把两个较大整数之间的运算简化成两个较小整数之间的运算，直到两个数相等，最大公约数就是最终两者相等的值
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd3(int a,int b){
        if(a == b) return a;
        int big = a>b?a:b;
        int small = a<b?a:b;

        return gcd2(big-small,small);
    }

    /**
     * 更相减损术与移位相结合
     *
     * 当a，b都为偶数时，gcd(a,b) =  2 * gcd(a/2,b/2) = 2 * gcd(a>>1,b>>1)
     * 当a为偶数，b为奇数时gcd(a,b) =  gcd(a/2,b) = gcd(a>>1,b)
     * 当a为奇数，b为偶数时gcd(a,b) =  gcd(a,b/2) = gcd(a,b>>1)
     * 当a，b都为奇数时(a>b)，先利用更相减损术运算一次gcd(a,b) = gcd(a-b,b),此时a-b必然是偶数，然后又可以利用移位运算
     * 例如计算10和25的最大公约数的步骤如下：
     * 1.整数10通过移位，可以转换成求5和25的最大公约数
     * 2.利用更相减损术，计算25-5 = 20，转换成求5和20的最大公约数
     * 3.整数20通过移位，可以转换成1求10和5的最大公约数
     * 4.整数10通过移位，可以转换成求5和5的最大公约数
     * 5.利用更相减损术，以为两数相等，所以最大公约数是5
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcd4(int a,int b){
        if(a == b) return a;
        if((a&1) == 0 && (b&1)==0){
            return gcd4(a>>1,b>>1)<<1;
        }else if((a&1) == 0 && (b&1)!=0){
            return gcd4(a>>1,b);
        }else if((a&1)!=0 && (b&1) == 0){
            return gcd4(a,b>>1);
        }else {
            int big = a>b?a:b;
            int small = a<b?a:b;
            return gcd2(big - small, small);
        }
    }
}
