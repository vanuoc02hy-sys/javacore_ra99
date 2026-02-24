import java.util.Scanner;

public class ThuatToan2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ThuatToan2.question_06();
    }

    public static void question_06() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
//        int max = Math.max(a, b);
        // B1: Tìm ra giá trị lớn hơn giữa a và b
        int max = a > b ? a : b;
        // B2: Tạo biến và gán giá trị ban đầu cho BCNN
        int bcnn = 0;
        // B3: Cộng thêm từng đơn vị để tìm kiếm giá trị BCNN
        for (int i = max; ; i++) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }
        // B4: In kết quả
        System.out.println("BCNN là: " + bcnn);
    }

    public static void question7() {
        System.out.println("Please input a string: ");
        String s = scanner.nextLine();
        System.out.println(s);
        boolean check = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                check = false;
                break;
            }
        }
        System.out.println(check == true ? "Chuỗi đối xứng" : "Chuỗi ko đối xứng");
    }

    public static void question7_v2() {
        System.out.println("Please input a string: ");
        String s = scanner.nextLine();
        String s_nguoc = new StringBuilder(s).reverse().toString();
        boolean check = s.equals(s_nguoc);
        System.out.println(check == true ? "Chuỗi đối xứng" : "Chuỗi ko đối xứng");
    }

    public static void question_11(int min, int max) {
        if (min > max) {
            System.out.println("Số min và max ko hợp lệ");
            return;
        }
        System.out.println("Mời bạn nhập vào 1 số: ");
        int number = scanner.nextInt();
        // Kiểm tra: number có thoả mãn min và max ko, nếu ko yêu cầu nhập lại
        while (number < min || number > max) { // ĐK: Number ko thoả mãn
            // Yêu cầu nhập lại
            System.out.println("Số nhập vào ko hợp lệ, mời nhập lại");
            number = scanner.nextInt();
        }
        // In ra số nhập đã thoả mãn
        System.out.println("Số thoả mãn là: " + number);
    }


}
