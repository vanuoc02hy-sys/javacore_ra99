package demo;

import modal.Group;

import java.util.Date;

public class DemoConstructor {
    public static void main(String[] args) {
        Group group = new Group(5, 9, "Nhóm 1");
        // new Group(): Đang gọi vào hàm khởi tạo không tham số. Trường hợp hiện tại
        // đây là hàm khởi tạo default

        System.out.println(group);

        Group group2 = new Group(6, "Nhóm 2", 1, new Date());
        System.out.println(group2);

//        group.setGroupID(1);
        System.out.println(group.getGroupID());
        group.setGroupName(" ");
    }
}
