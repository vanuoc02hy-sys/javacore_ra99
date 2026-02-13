public class DemoMethod {
    public static void main(String[] args) {
//        DemoMethod demoMethod = new DemoMethod();
        int result = DemoMethod.sum(3, 4);
        System.out.println("Kết quả là: " + result);
    }

    public static int sum(int number1, int number2){
        System.out.println("Có vào đây");
        return number1 + number2;
    }
}
