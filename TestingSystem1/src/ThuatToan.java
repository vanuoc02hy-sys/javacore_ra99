import java.util.Scanner;

public class ThuatToan {
    static Scanner scanner = new Scanner(System.in);

    //    Bài 1: Tìm ra 1 số lớn nhất trong 1 mảng
    public static void question_1() {
        System.out.println("------ Bài 1 ---------");
        int[] daySo = {1, 5, 9, 22, 4, 77, 3};
        int max = 0;
        for (int i = 0; i < daySo.length; i++) {
            if (daySo[i] > max) {
                max = daySo[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    //    Bài 2: Tạo 1 method có 1 tham số int truyền vào, kiểm tra
//    số đó có phải là số nguyên tố hay không?
    public static void question_2() {
        System.out.println("Mời bạn nhập vào số muốn kiểm tra: ");
        int number = scanner.nextInt();
        boolean check = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "Là số nguyên tố" : "Ko phải số nguyên tố");
    }

    //    Bài 3: Viết chương trình nhập vào 1 chuỗi sau đó in ra 1 chuỗi đảo ngược của nó
    public static void question_3() {
        System.out.println("Mời bạn nhập vào chuỗi: ");
        String s = scanner.nextLine();
        // abc -> cba
        String result = "";
        // C1:
//        for (int i = s.length() - 1; i >= 0; i--) {
//            result = result + s.charAt(i);
//        }

        // C2: Tách chuỗi s thành 1 mảng các chữ cái
//        String[] arrayString = s.split("");
//        for (int i = arrayString.length - 1; i >= 0 ; i--) {
//            result = result.concat(arrayString[i]);
//        }

        // C3: Sử dụng 1 đối tượng cũng lưu trữ dạng chuỗi và có method đảo ngược chữ
        StringBuffer stringBuffer = new StringBuffer(s);
        result = stringBuffer.reverse().toString();

        System.out.println(result);
    }

    //    Bài 4: Tạo 1 method có 1 tham số int truyền vào, tính tổng các số từ 1 tới n
    public static void question_4() {
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
//            sum+=i;
            sum = sum + i;
        }
        System.out.println("Kết quả là: " + sum);
    }

    //    Bài 5: Tạo 1 method có 2 tham số truyền vào đều có kiểu dữ liệu là int,
//    tìm ước chung lớn nhất của 2 số đó
    public static void question_5() {

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            System.out.println("UCLN là: " + number1);
            return;
        }
        int a, b;

        int UCLN = 1;
        a = number1 > number2 ? number1 : number2; // Gán số lớn hơn cho a
        b = number1 < number2 ? number1 : number2; // Gán số nhỏ hơn cho b

        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0 && i > UCLN) {
                UCLN = i;
            }
        }
        System.out.println("UCLN của 2 số là: " + UCLN);

    }

    //    Bài 6: Tạo 1 method có 2 tham số truyền vào đều có kiểu dữ liệu là int,
//    tìm bội chung nhỏ nhất của 2 số đó
    public static void question_6() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int max = Math.max(number1, number2);

        while (true) {
            if (max % number1 == 0 && max % number2 == 0) {
                break;
            }
            max++;
        }
        System.out.println("BCNN là: " + max);
    }

    //    Bài 7: Tạo 1 method có 1 tham số truyền vào có kiểu dữ liệu là String, kiểm tra xem
//    chuỗi đó có phải là chuỗi đối xứng hay không?
    public static void question_7() {
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("Đây là chuỗi đối xứng");
        }
    }

    public static void question_8() {
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        // Kiểm tra a có bằng 0 không
        if (a == 0) {
            System.out.println("Đây không phải phương trình bậc 2.");
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void question_9() {
        System.out.print("Nhập cạnh 1: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double c = scanner.nextDouble();
        // Kiểm tra điều kiện là tam giác (Tổng 2 cạnh sẽ lớn hơn 1 cạnh còn lại)
        double max = Math.max(a, Math.max(b, c));
        double sumOfSquares;
        if (max == a) {
            sumOfSquares = b * b + c * c;
        } else if (max == b) {
            sumOfSquares = a * a + c * c;
        } else {
            sumOfSquares = a * a + b * b;
        }
        if (max * max - sumOfSquares == 0) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây không phải tam giác vuông");
        }
    }

    //    Bài 10: Tạo 1 method đầu vào là 1 số n có kiểu dữ liệu là int, tổng hợp tất cả các số là
//    thừa số nguyên tố từ 1 tới n
    public static void question_10() {
        System.out.println("Nhập vào số: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố từ 1 tới " + number + " là : " + sum);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Bài này mục đích để tạo 1 hàm để dùng đi dùng lại nhiều lần, chỉ cần nhập vào số min
    // và max để yêu cầu người dùng nhập vào số trong khoảng đó, nếu nhập sai thì yêu cầu nhập lại
    public static int question_11(int min, int max) {
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

    //    Bài 12: Tạo method để yêu cầu người dùng nhập vào định dạng kiểu email (chứa ký tự @ trong chuỗi),
//    nếu nhập sai yêu cầu người dùng nhập lại.
    // Bài này cũng mục đích để tạo 1 hàm để dùng đi dùng lại nhiều lần, chỉ cần gọi hàm và
    // yêu cầu người dùng nhập vào email, nếu nhập sai thì yêu cầu nhập lại. Có thể đặt tên method là inputEmail
    public static String question_12() {
        String email;
        System.out.println("Nhập vào email (phải chứa ký tự @): ");
        do {
            email = scanner.nextLine();
            if (!email.contains("@")) {
                System.out.println("Email không hợp lệ, vui lòng nhập lại.");
            }
        } while (!email.contains("@"));
        return email;
    }

    //    Bài 13: Tạo method để yêu cầu người dùng nhập vào định dạng kiểu số điện thoại có số 0 ở đầu
//    và có tất cả 10 ký tự, nếu nhập sai yêu cầu người dùng nhập lại.
    public static String question_13() {
        String phoneNumber;
        System.out.println("Nhập vào số điện thoại (phải bắt đầu bằng số 0 và có 10 ký tự): ");
        do {
            phoneNumber = scanner.nextLine();
            if (!phoneNumber.matches("0\\d{9}")) {
                System.out.println("Số điện thoại không hợp lệ, vui lòng nhập lại.");
            }
        } while (!phoneNumber.matches("0\\d{9}"));
        return phoneNumber;
    }

    //    Bài 14: Viết chương trình để nhập vào từ màn hình 1 số, sau đó in ra kết quả tổng tất cả các chữ số của số đó.
    public static void question_14() {
        System.out.println("Nhập vào một số: ");
        String number = scanner.nextLine();
        int sum = 0;
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                sum += Character.getNumericValue(digit);
            }
        }
        System.out.println("Tổng các chữ số của số " + number + " là: " + sum);
    }

    //    Bài 15: Viết chương trình nhập vào số nguyên n, hãy in ra tất cả các số nguyên tố từ 1 tới n.
    public static void question_15() {
        System.out.println("Nhập vào số nguyên n: ");
        int n = scanner.nextInt();
        System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    //    Bài 16: Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ phải sang trái
//    số đó ta vẫn nhận được một số giống nhau. Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số
    public static void question_16() {
        System.out.println("Các số thuận nghịch độc có sáu chữ số là:");
        for (int i = 100000; i <= 999999; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    //    Bài 17: Ngân hàng thông báo lãi suất là X % mỗi năm. Với số tiền gửi vào là N. Sau mỗi năm, tiền lãi sẽ được cộng dồn.
//    Hỏi sau bao nhiêu năm thì số tiền đạt được ít nhất là M.
//    Yêu cầu: Viết chương trình để nhập vào 3 số thực (kiểu double) N, X và M.
//    Trong đó 0<N<M<100000 và trả về số năm để đạt được mục tiêu M
    public static void question_17() {
        System.out.println("Nhập vào số tiền gửi (N): ");
        double N = scanner.nextDouble();
        System.out.println("Nhập vào lãi suất hàng năm (X%): ");
        double X = scanner.nextDouble();
        System.out.println("Nhập vào số tiền mục tiêu (M): ");
        double M = scanner.nextDouble();

        int years = 0;
        double currentAmount = N;

        while (currentAmount < M) {
            currentAmount += currentAmount * (X / 100);
            years++;
        }

        System.out.println("Số năm để đạt được mục tiêu M là: " + years);
    }

    //    Bài 18: Một số được xem là số may mắn nếu chỉ có các chữ số 4 và 7. Cho số nguyên dương N không quá 200 chữ số.
//    Hãy kiểm tra xem N có phải số may mắn hay không.
    public static void question_18() {
        System.out.println("Nhập vào số nguyên dương N (không quá 200 chữ số): ");
        String N = scanner.nextLine();  // Nhập số dưới dạng chuỗi
        boolean isLucky = true;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if (c != '4' && c != '7') {
                isLucky = false;
                break;
            }
        }
        if (isLucky) {
            System.out.println("Đây là số may mắn");
        } else {
            System.out.println("Đây không phải số may mắn");
        }
    }

    //Bài 19: Viết chương trình nhập vào một xâu ký tự S có độ dài không quá 100 và chuyển xâu đã nhập thành chữ in hoa.
    public static void question_19() {
        System.out.println("Nhập vào một xâu ký tự S (độ dài không quá 100): ");
        String S = scanner.nextLine();
        while (S.length() > 100) {
            System.out.println("Xâu ký tự quá dài, vui lòng nhập lại.");
            S = scanner.nextLine();
        }
        String upperCaseS = S.toUpperCase();
        System.out.println("Xâu ký tự sau khi chuyển thành chữ in hoa: " + upperCaseS);
    }

    //    Bài 20: Cho một xâu ký tự chỉ bao gồm các ký tự chữ cái, độ dài không quá 100. Hãy thực hiện:
//    Biến đổi tất cả xâu thành viết thường, nếu số lượng chữ cái viết thường lớn hơn hoặc bằng số lượng chữ cái viết hoa.
//    Biến đổi tất cả xâu thành chữ hoa, nếu số lượng chữ cái viết hoa lớn hơn số lượng chữ cái viết thường.
    public static void question_20() {
        System.out.println("Nhập vào một xâu ký tự (chỉ bao gồm chữ cái, độ dài không quá 100): ");
        String input = scanner.nextLine();
        while (input.length() > 100) {
            System.out.println("Xâu ký tự quá dài, vui lòng nhập lại.");
            input = scanner.nextLine();
        }

        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }

        String result;
        if (lowerCaseCount >= upperCaseCount) {
            result = input.toLowerCase();
        } else {
            result = input.toUpperCase();
        }

        System.out.println("Xâu ký tự sau khi biến đổi: " + result);
    }

    //    Bài 21: Viết chương trình kiểm tra xem số nguyên dương N có thỏa mãn tính chất: nếu ta lấy hai chữ số đầu
//    và hai chữ số cuối của nó thì sẽ tạo ra số có hai chữ số giống nhau hay không?
//    Input: là 1 số nguyên dương N có ít nhất 4 chữ số, nhưng không quá 18 chữ số.
//    Output: Ghi ra YES hoặc NO
    public static void question_21() {
        System.out.println("Nhập vào số nguyên dương N (ít nhất 4 chữ số, không quá 18 chữ số): ");
        String N = scanner.nextLine();
        while (N.length() < 4 || N.length() > 18) {
            System.out.println("Số không hợp lệ, vui lòng nhập lại.");
            N = scanner.nextLine();
        }

        String firstTwoDigits = N.substring(0, 2);
        String lastTwoDigits = N.substring(N.length() - 2);

        if (firstTwoDigits.equals(lastTwoDigits)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //    Bài 22: Một số kết thúc bởi hai chữ số 86 được gọi là số phát lộc. Cho một số nguyên dương không
//        quá 500 chữ số, hãy kiểm tra số đó có phải số phát lộc hay không.
    public static void question_22() {
        System.out.println("Nhập vào một số nguyên dương (không quá 500 chữ số): ");
        String number = scanner.nextLine();
        while (number.length() > 500) {
            System.out.println("Số quá dài, vui lòng nhập lại.");
            number = scanner.nextLine();
        }

        if (number.endsWith("86")) {
            System.out.println("Đây là số phát lộc");
        } else {
            System.out.println("Đây không phải số phát lộc");
        }
    }

    //    Bài 23: Viết chương trình nhập vào 3 cạnh của tam giác, kiểm tra xem đây có phải làm tam giác vuông hay không.
//        (Áp dụng định lý pytago)
    public static void question_23() {
        System.out.println("Nhập vào 3 cạnh của tam giác (cách nhau bằng dấu cách): ");
        String[] input = scanner.nextLine().split(" ");
        while (input.length != 3) {
            System.out.println("Vui lòng nhập đúng 3 cạnh, cách nhau bằng dấu cách.");
            input = scanner.nextLine().split(" ");
        }

        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        // Sắp xếp các cạnh để đảm bảo cạnh lớn nhất là c
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        a = sides[0];
        b = sides[1];
        c = sides[2];

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây không phải là tam giác vuông");
        }
    }

    //    Bài 24: Viết một chương trình Java nhận vào một mảng các số nguyên và tính trung bình cộng của các số trong mảng.
    public static void question_24() {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / n;
        System.out.println("Trung bình cộng của các số trong mảng là: " + average);
    }

    //    Bài 25: Viết một chương trình Java nhận vào một chuỗi ký tự và đếm số lượng chữ cái (cả chữ viết hoa
//            và chữ viết thường) trong chuỗi đó.
    public static void question_25() {
        System.out.println("Nhập vào một chuỗi ký tự: ");
        String input = scanner.nextLine();

        int letterCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }

        System.out.println("Số lượng chữ cái trong chuỗi là: " + letterCount);
    }

    //    Bài 26: Viết một chương trình Java nhận vào một mảng số nguyên và tìm tất cả các số trong mảng đó chia hết cho 3.
//    In ra các số đó.
    public static void question_26() {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Các số chia hết cho 3 trong mảng là: ");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // In dòng mới sau khi in xong các số
    }

    //    Bài 27: Viết một chương trình Java nhận vào một chuỗi ký tự và một ký tự cụ thể. Đếm và in ra số lần ký tự đó xuất
//    hiện trong chuỗi.
//    Ví dụ:
//    Input: "banana", ký tự: 'a'
//    Output: 3 (Ký tự 'a' xuất hiện 3 lần trong chuỗi "banana")
    public static void question_27() {
        System.out.println("Nhập vào một chuỗi ký tự: ");
        String input = scanner.nextLine();
        System.out.println("Nhập vào một ký tự cụ thể: ");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == character) {
                count++;
            }
        }

        System.out.println("Ký tự '" + character + "' xuất hiện " + count + " lần trong chuỗi \"" + input + "\"");
    }

    //    Bài 28: Viết một chương trình Java nhận vào một chuỗi ký tự và tính tổng của tất cả các chữ số trong chuỗi đó.
//    Các ký tự không phải chữ số sẽ bị bỏ qua.
//    Ví dụ:
//    Input: "a1b2c3d4"
//    Output: 10 (Tổng của các chữ số 1, 2, 3, và 4 là 10)
    public static void question_28() {
        System.out.println("Nhập vào một chuỗi ký tự: ");
        String input = scanner.nextLine();

        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println("Tổng của tất cả các chữ số trong chuỗi là: " + sum);
    }

    //    Bài 29: Viết một chương trình Java nhận vào một mảng số nguyên và tính tổng của tất cả các số chẵn trong mảng.
//    Ví dụ:
//    Input: [3, 8, 2, 7, 10]
//    Output: 20 (Tổng của các số chẵn là 8 + 2 + 10 = 20)
    public static void question_29() {
        System.out.println("Nhập vào số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sumEven = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            }
        }

        System.out.println("Tổng của tất cả các số chẵn trong mảng là: " + sumEven);
    }

}
