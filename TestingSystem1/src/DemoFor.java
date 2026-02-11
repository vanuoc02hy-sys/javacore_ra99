public class DemoFor {
    public static void main(String[] args) {
        int[] arrayNumber = {1,3,4,6,7,8,9,99,999999};

        // Bài toán: In tất cả lần lượt các phần tử trong mảng trên
        // For i
//        for (int i = 0; i < arrayNumber.length; i++) {
//            int number = arrayNumber[i];
//            System.out.println(number);
//        }

        // For each
        for (int number: arrayNumber) {
            System.out.println(number);
        }

    }
}
