package demo;

public class DemoDataTypeCasting {
    public static void main(String[] args) {
        int number1 = 10;
        // VD: int -> byte : Ép kiểu thu hẹp (Explicit || Narrowing - Downcasting)
        byte numberByte = (byte) number1;

        // VD2: int -> long: Ép kiểu mở rộng (Implicit || Widening - Upcasting)
        long numberLong = number1;

    }
}
