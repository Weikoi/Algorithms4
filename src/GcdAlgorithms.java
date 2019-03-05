/*
 * 求最大公约数的欧几里得算法
 * */

public class GcdAlgorithms {
    public static void main(String[] args) {
        int result = gcd2(100, 10);
        System.out.println(result);
    }
//    非递归实现，循环
    private static int gcd(int m, int n) {
        while (n != 0) {
            int rem = m % n;
            m = n;
            n = rem;
        }
        return m;

    }
//    递归实现
    private static int gcd2(int m, int n) {
        if(n==0){
            return m;
        }
        int p = m%n;
        return gcd2(n, p);
    }
}
