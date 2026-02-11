public class DemoSwitchCase {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {
            case 1:
                System.out.print("A");
                break;
                // ngăn ko cho đi tiếp
            case 2:
                System.out.print("B");
                break;
            case 3:
                System.out.print("C");
                break;
            default:
                System.out.println("Không gì cả");
        }

    }
}
