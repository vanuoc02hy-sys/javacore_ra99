package exercise;

public class Exercise3 {
    public static void question_01() {
        Integer luong = 5000;
        float luong_f = luong.floatValue();
    }

    //    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int
    public static void question_02() {
        String value = "1234567p";
        int number = Integer.parseInt(value);
        System.out.println(number);
    }

    //    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int
    public static void question_03() {
        Integer numberObject = new Integer("1234567");
        int numberNt = numberObject.intValue();
    }

}
