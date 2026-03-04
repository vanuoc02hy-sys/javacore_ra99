package demo;

public class DemoWrapperClass {
    public static void main(String[] args) {
        // Ép kiểu: Boxing: Kiểu dữ liệu nguyên thuỷ -> wrapper class
        int number1nt = 10;
        Integer number1 = number1nt;

        // VD2: UnBoxing: wrapper class -> kiểu dữ liệu nguyên thuỷ
        Integer number2 = 100;
        int number2nt = Integer.valueOf(number2);
    }
}
