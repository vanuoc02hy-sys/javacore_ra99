public class DemoIfElse {
    public static void main(String[] args) {
        int number_1 = 1;
        int number_2 = 2;
        // Nếu số 1 lớn hơn số 2 thì in ra dòng chữ: Số 1 lớn hơn số 2
        // Còn lại thì in ra dòng chữ: Số 2 lớn hơn số 1

        // Khối if-else
//        if (number_1 > number_2){
//            System.out.println("Số 1 lớn hơn số 2");
//        } else {
//            System.out.println("Số 2 lớn hơn số 1");
//        }
         // Toán tử 3 ngôi tương ứng
        String text2 = number_1 > number_2 ? "Số 1 lớn hơn số 2" : "Trường hợp còn lại";
        System.out.println(text2);

        // KHối có sử dụng nhiều hơn 1 điều kiện
        String text = null;
        if (number_1 > number_2) {
//            System.out.println("Số 1 lớn hơn số 2");
            text = "Số 1 lớn hơn số 2";
        } else if (number_1 == number_2) {
//            System.out.println("Số 1 bằng số 2");
            text = "Số 1 bằng số 2";
        } else {
//            System.out.println("Số 1 nhỏ hơn số 2");
            text = "Số 1 nhỏ hơn số 2";
        }
//        System.out.println(text);
        // Toán tử 3 ngôi tương ứng
        String text3 = number_1 > number_2 ? "Số 1 lớn hơn số 2" : number_1 == number_2
                ? "Số 1 bằng số 2" : "Số 1 nhỏ hơn số 2";


    }
}
