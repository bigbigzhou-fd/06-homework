package test;

/**
 * @Author zhouzhou
 * @program: assignment-06
 * @create: 2020-11-09 14:45
 * @description
 */
public class Exponents01 {

    //求x的e次方
    public static float F(int x, int e) {
        if (x == 0) {
            return 0;
        } else if (e == 0) {//任何一个不为0的数的0次方
            return 1;
        } else if (e == 1) {
            return x;
        }

        if (e > 1) {
            return x * F(x, e - 1);
        }

        if (e < 0) {
            float t = F(x,-1*e);
            return 1/t;
        }

        return -1;
    }

    public static int F1(int x, int e) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(F(2, -2));
//        System.out.println(F(-2, 3));
//        System.out.println(F(-2, 5));
        System.out.println(F(2,-1));


    }
}
