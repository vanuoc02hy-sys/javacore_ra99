import excercise.Exercise1;
import modal.Account;
import modal.Department;
import modal.Group;

public class RunProgram {
    public static void main(String[] args) {
//        ----------------------- INSERT GROUP
        Group group1 = new Group();
        group1.groupName = "NHóm 1";
        Group group2 = new Group();
        Group group3 = new Group();

//        ----------------------- INSERT DEPARTMENT
        Department department1 = new Department();
        department1.departmentName = "DEV";
        Department department2 = new Department();
        department2.departmentName = "Tester";

        Department department3 = new Department();
        department3.departmentName = "SM";

        Group[] ds1 = {group1, group2, group3, group1};

        Account account1 = new Account();
        account1.email = "user01@vti.com";
        account1.fullName = "Nguyễn Văn A";
        account1.accountID = 1;
        account1.department = department1;
        account1.groups = ds1;

        Account account2 = new Account();
        Account account3 = new Account();

        Account[] ds_account = {account1, account2};
        group1.accounts = ds_account;

//        ------------ BÀI TẬP
//        Exercise1.question_01(account2);
        Exercise1.question_08(ds_account);
    }
}
