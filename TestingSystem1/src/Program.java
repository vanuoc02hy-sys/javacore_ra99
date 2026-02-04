import java.util.Date;

public class Program {
    public static void main(String[] args) {
//        int number_1 = 1;
//        int number_2 = 1;
//        System.out.println(number_1 != number_2);

        // Khai báo đối tượng Group
        Group group_1 = new Group();
        group_1.groupID = 1;
        group_1.groupName = "Nhóm 1";
        group_1.createDate = new Date();// = ngày hiện tại

        Group group_2 = new Group();
        group_2.groupID = 2;
        group_2.groupName = "Nhóm 2";
        group_2.createDate = new Date();// = ngày hiện tại

        Group[] groupArray1 = {group_1, group_2};

        Account account1 = new Account();
        account1.accountID = 1;
        account1.groups = groupArray1;

        Account account2 = account1;
        account2.accountID = 2;

        System.out.println(account2.accountID);
//        System.out.println(account1 == account2);

        Account account3 = new Account();
        int numberX = 1;
        System.out.println();
    }
}
