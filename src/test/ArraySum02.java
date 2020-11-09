package test;

/**
 * @Author zhouzhou
 * @program: assignment-06
 * @create: 2020-11-09 15:02
 * @description
 * 递归的方法计算数组的和
 */
public class ArraySum02 {

    public static int F(int[] array){
            if(array.length == 1){
                return array[0];
            }

            //拿到比我少一位的数字
            int[] arrayt = new int[array.length-1];
            for(int i =1;i<array.length;i++){
                arrayt[i-1] = array[i];
            }

            return array[0]+F(arrayt);
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, -5};
        System.out.println(F(testArray));
    }
}
