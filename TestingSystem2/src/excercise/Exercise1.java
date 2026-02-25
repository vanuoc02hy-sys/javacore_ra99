package excercise;

import modal.Account;
import modal.Group;

public class Exercise1 {
    public static void question_01(Account account) {
        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.department.departmentName);
        }
    }

    public static void question_02(Account account) {
        int length = account == null || account.groups == null ? 0 : account.groups.length;

        if (length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (length == 1 || length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    // Sử dụng toán tử ternary để làm Question 1
    public static void question_03(Account account) {
        String mess = account.department == null ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.department.departmentName;
        System.out.println(mess);

        System.out.println(account.department == null ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.department.departmentName);
    }

    public static void question_05(Group group) {
        int size = group == null || group.accounts == null ? 0 : group.accounts.length;
        switch (size) {
            case 0:
                System.out.println("Nhóm không có thành viên");
                break;
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

}
