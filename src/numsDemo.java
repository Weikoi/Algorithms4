import java.util.Random;

public class numsDemo {
    public static void main(String[] args) {

        System.out.println("生成的随机整数绝对值为" + abs(100));
        System.out.println("生成的随机浮点数绝对值为" + absDouble(100));
        System.out.println("生成的随机整数是否为素数？" + isPrime(100));
        System.out.println("生成的随机浮点数的完全平方根为" + sqrt(100));
        System.out.println("计算三角形斜边" + hypotenuse(3,4));
        System.out.println("计算调和级数" + Har(100));
    }

    public static int abs(int bound) {
        Random random = new Random();
        int x = random.nextInt(bound) - 50;
        if (x >= 0) {
            return x;
        } else return -x;
    }

    public static double absDouble(int bound) {
        Random random = new Random();
        double x = random.nextInt(100) + random.nextDouble() - 50;
        if (x >= 0) {
            return x;
        } else return -x;
    }

    public static boolean isPrime(int bound) {
        Random random = new Random();
        int x = random.nextInt(bound);
        if (x < 2) return false;
        else {
            for (int i = 2; i*i < x; i++) {
                if (x % i == 0) return false;
            }
            return true;
        }
    }
    public static double sqrt(int bound) {
        Random random = new Random();
        double c = random.nextInt(bound) + random.nextDouble();

        if (c < 0) {
            return Double.NaN;
        }

        double e = 1e-15;
        double x = c;
        double y = (x + c / x) / 2;
        while (Math.abs(x - y) > e) {
            x = y;
            y = (x + c / x) / 2;
        }
        return x;
    }
//直角三角形斜边
    public static double hypotenuse(double a, double b){
        return Math.sqrt(a*a+b*b);
    }
//调和级数
    public static double Har(int N){
        double sum = 0;
        for (double i = 1; i < N; i++) {
            sum += 1/i;
        }
        return sum;
    }
}
