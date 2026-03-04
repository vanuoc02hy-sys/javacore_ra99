package exercise;

import utils.ScannerUtils;

public class Exercise1 {
    public static void question_01() {
        float luong_1 = 5240.6f;
        float luong_2 = 10970.055f;

        int luong_1_convert = (int) luong_1;
        int luong_2_convert = (int) luong_2;
        System.out.println(luong_1_convert);
        System.out.println(luong_2_convert);
    }

    //    Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    // 123 -> 00123
    public static void question_02() {
        int number = ScannerUtils.inputNumber();
        // Convert -> String
        String numberString = String.valueOf(number);

        // Đếm số lượng số chữ số:
        int length = numberString.length();
        // Xác định chữ số 0 cần phải thêm:
        int number_0 = 5 - length;
        String numberStr0 = "";
        for (int i = 1; i <= number_0; i++) {
            numberStr0 += "0";
        }
        System.out.println(numberStr0 + numberString);
    }

}
