import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
//        int[] numberArray = {1,2,3,4,5};
//        System.out.println(Arrays.toString(numberArray));
//        numberArray[1] = 99;
//        System.out.println(Arrays.toString(numberArray));
//        numberArray[4] = 11;
//        System.out.println(Arrays.toString(numberArray));


        // Khai báo 1 array rỗng
        int[] numberArray2 = new int[6];
        numberArray2[2] = 10;
        System.out.println(Arrays.toString(numberArray2));

        int length = numberArray2.length;
        System.out.println("Số phần tử trong mảng là: " + length);
    }
}
