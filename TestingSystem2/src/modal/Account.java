package modal;

import java.time.LocalDateTime;

public class Account {
    public int accountID;
    public String email;
    public String userName;
    public String fullName;
    public Department department;
    public Position positionID;
    public LocalDateTime createDate;
    public Group[] groups;

    @Override
    public String toString() {
        String departmentName = department != null ? department.departmentName : "";
        return "Email: " + email + "\n" +
                "FullName: " + fullName + "\n" +
                "Phòng ban: " + departmentName;
    }
}
