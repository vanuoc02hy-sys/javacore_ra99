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
        return "modal.Account{" +
                "accountID=" + accountID +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentID=" + department +
                ", positionID=" + positionID +
                ", createDate=" + createDate +
                '}';
    }
}
