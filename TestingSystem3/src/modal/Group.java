package modal;

import java.util.Date;

public class Group {
    private int groupID;

    private String groupName;
    private int creator;
    private Date createDate;
    private String pass;

    public Group() { // Hàm khởi tạo không tham số
        System.out.println("Chạy vào hàm khởi tạo ko tham số");
        this.groupID = 1;
    }

    public Group(int groupID, int creator, String groupName) {
        this.groupID = groupID;
        this.creator = creator;
        this.groupName = groupName;
    }

     public Group(int groupID, String groupName, int creator, Date createDate) {
          this.groupID = groupID;
          this.groupName = groupName;
          this.creator = creator;
          this.createDate = createDate;
     }

     // Lấy giá trị groupId
    //-> Tạo 1 method chuyên để lấy ra giá trị groypId
    // -> Hàm getter
    public int getGroupID(){
        return this.groupID;
    }

    // Muốn thay đổi giá trị 1 thuộc tính
    // -> Tạo hàm setter
//    public void setGroupID(int groupId){
//        this.groupID = groupId;
//    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }
}
