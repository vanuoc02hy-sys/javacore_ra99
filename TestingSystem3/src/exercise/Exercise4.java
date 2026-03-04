package exercise;

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
            result+=" "+ upperFirstChar(str_pt);
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
}
