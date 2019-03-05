import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        double[] a = new double[]{1, 2, 3, 4, 5};
        double[][] x = new double[][]{{1,2},{3,4}};
        double[][] y = new double[][]{{1,2},{3,4}};
//        找最大值
        System.out.println("最大值为 " + findMax(a));
//        找平均值
        System.out.println("平均值为 " + findMean(a));
//        复制数组
        System.out.println("复制数组到b " + Arrays.toString(copyArray(a)));

        System.out.println("颠倒数组为 " + Arrays.toString(reverseArray(a)));

        System.out.println("方阵乘法为 " + Arrays.deepToString(multiMatrix(x, y)));
    }

    public static double findMax(double[] a) {
        if (a.length == 0) {
            return -1;
        } else {
            double max = a[0];
            for (double v : a) {
                if (v > max) {
                    max = v;
                }
            }
            return max;
        }
    }

    //    找平均值
    public static double findMean(double[] a) {
        int len = a.length;
        double sum = 0;
        for (double v : a) {
            sum += v;
        }
        return sum / len;
    }

    //    复制成一个新数组
    public static double[] copyArray(double[] a) {
        int len = a.length;
        double[] b = new double[len];
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }
        return b;
    }

    //    颠倒元素的顺序
    public static double[] reverseArray(double[] a) {
        int len = a.length;
        for (int i = 0; i < len / 2; i++) {
            double temp = a[i];
            a[i] = a[len - i - 1];
            a[len - i - 1] = temp;

        }
        return a;
    }

    //    方阵乘法
    public static double[][] multiMatrix(double a[][], double b[][]) {
        int len = a.length;
        double[][] c = new double[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
