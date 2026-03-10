package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Position;

import java.time.LocalDateTime;

public class Exercise1 {
    public static void main(String[] args) {
//        Khởi tạo 1 Object với mỗi constructor ở trên
//        VD:
        // a)
        Account account1 = new Account();
        // b?
        Account account2 = new Account(2, "user2@gmail.com", "VuongNN",
                "Nguyễn", "Ngọc Vương");

        // c)
        Position position3 = new Position();
        // set giá trị cho các thuộc tính của com.vti.entity.Position.
        Account account3 = new Account(3, "user3@gmail.com", "VuongNN3",
                "Nguyễn", "Ngọc Vương", position3);

        // d)
        LocalDateTime createDate = LocalDateTime.of(2026,3,8,19,20);
        Account account4 = new Account(3, "user3@gmail.com", "VuongNN3",
                "Nguyễn", "Ngọc Vương", position3, createDate);
    }
}
