public class DemoBreakContinueReturn {
    public static void main(String[] args) {
        // In ra các số từ 1->10
        // Chú ý: Ko in ra số 5
        for(int i = 0; i <= 10; i++){

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    return;
                }
                System.out.println("Gia trị của j: " + j);
            }
            // C2:
            System.out.println("Gia trị của i: " + i);
        }
        System.out.println("Có xuống đây");
    }
}
