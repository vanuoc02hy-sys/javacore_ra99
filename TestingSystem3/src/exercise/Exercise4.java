package exercise;

import modal.Group;
import utils.ScannerUtils;

public class Exercise4 {
    //    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );
    public static void question_01() {

    }

    public static void question_02() {
        String str1 = "123";
        String str2 = "456";

        // 456123
        System.out.println(str2 + str1);
        System.out.println(str2.concat(str1));
    }

    //    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa
//    chữ cái đầu thì viết hoa lên
    public static void question_03() {
        String str = "vu Van uoc"; // -> Vu Van Uoc
        String[] strArray = str.split(" "); //["vu", "Van", "uoc"]
        String result = "";
        for (String str_pt : strArray) {
            result += " " + upperFirstChar(str_pt);
        }
        System.out.println(result.trim());
    }

    public static String upperFirstChar(String str) {
        String result = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0) {
                char first = str.charAt(0);
                result += Character.toUpperCase(first);
            } else {
                char charAt = str.charAt(i);
                result += Character.toLowerCase(charAt);
            }
        }
        return result;
    }

    //    Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
//    VD:  Người dùng nhập vào "Nam", hệ thống sẽ in ra
//"Ký tự thứ 1 là: N"
//        "Ký tự thứ 2 là: A"
//        "Ký tự thứ 3 là: M"
    public static void question_04() {
        System.out.println("Mời nhập vào tên: ");
        String name = ScannerUtils.inputString();// N A M
        // C1:
//        char[] nameArr = name.toCharArray();
//        for (int i = 0; i < nameArr.length; i++) {
//            int stt = i + 1;
//            System.out.println("Ký tự thứ " + stt + " là: " + nameArr[i]);
//        }
        // C2:
        for (int j = 0; j < name.length(); j++) {
            int stt = j + 1;
            System.out.println("Ký tự thứ " + stt + " là: " + name.charAt(j));
        }
    }

    //    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên
//    và hệ thống sẽ in ra họ và tên đầy đủ
    public static void question_05() {
        System.out.println("Mời bạn nhập vào họ:");
        String ho = ScannerUtils.inputString();
        System.out.println("Mời bạn nhập vào tên:");
        String ten = ScannerUtils.inputString();

        String hoTen = ho.concat(" ").concat(ten);
        System.out.println("Họ tên đầy đủ là: " + hoTen);
    }

    //    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó
//    hệ thống sẽ tách ra họ, tên , tên đệm VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//	 	 	"Họ là: Nguyễn" // Từ đầu tiên
//                    "Tên đệm là: Văn" // Các từ ở giữa
//                    "Tên là: Nam" // Từ cuối cùng
    public static void question_06() {
        System.out.println("Mời bạn nhập vào họ và tên: ");
        String fullName = ScannerUtils.inputString();
        String[] mang = fullName.split(" ");
        String ho = mang[0];
        String ten = mang[mang.length - 1];
        String tenDem = "";
        for (int i = 1; i < mang.length - 1; i++) {
            tenDem += mang[i] + " ";
        }
        System.out.println("Họ là: " + ho);
        System.out.println("Tên đệm là: " + tenDem.trim());
        System.out.println("Tên là: " + ten);
    }

    //    Question 7: Câu a sử dụng trim(), câu b: tương tự question 3

//    Question 8:
//    In ra tất cả các group có chứa chữ "Java"
//    Question 9:
//    In ra tất cả các group "Java"
    public static void question_08_09(Group[] groups){
        for (Group gr: groups) {
            // 08
            if (gr != null && gr.groupName != null && gr.groupName.contains("Java")){
                System.out.println("Group có chứa chữ java là: " + gr.groupName );
            }
            // 09:
            String s1 = null;
            String s2 = "GT";
            if (gr != null && "Java".equals(gr.groupName)){
                System.out.println("Group Java là: ");
                System.out.println(gr);
            }
        }
    }

}
