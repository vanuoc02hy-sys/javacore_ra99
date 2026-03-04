package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("----------- MENU -------------");
            System.out.println("1. Thêm mới account");
            System.out.println("2. Chỉnh sửa account");
            System.out.println("3. Xoá account");
            System.out.println("4. Danh sách account");
            System.out.println("5. Thoát");
            int number = ScannerUtils.inputNumber(1,5);
            switch (number){
                case 1:
                    System.out.println("Chức năng1");
                    break;
                case 2:
                    System.out.println("Chức năng 2");
                    break;
                case 3:
                    System.out.println("Chức năng 3");
                    break;
                case 4:
                    System.out.println("Chức năng 4");
                    break;
                case 5:
                    System.out.println("Đã thoát!!!");
                    return;
            }
        }
    }

    public static int inputNumber(int min, int max) {
        int number;
        System.out.println("Nhập vào số từ " + min + " đến " + max + ": ");
        do {
            number = scanner.nextInt();
            if (number < min || number > max) {
                System.out.println("Số không hợp lệ, vui lòng nhập lại.");
            }
        } while (number < min || number > max);
        return number;
    }

    public static String inputEmail(){
        String email = scanner.nextLine();
        return email;
    }

    public static String inputString(){
        return scanner.nextLine();
    }

    public static Date inputDate() throws ParseException {
        System.out.println("Nhập vào giá trị ngày có định dạng: dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String dateStr2 = ScannerUtils.inputString();
        return formatter2.parse(dateStr2);
    }

    public static int inputNumber(){
        return scanner.nextInt();
    }
}
