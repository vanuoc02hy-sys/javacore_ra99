package com.vti.frontend;

import com.vti.backend.Function;
import com.vti.backend.IFunction;
import com.vti.entity.Document;
import com.vti.ultils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<Document> data = new ArrayList<>();

    public static void main(String[] args) {
        IFunction function = new Function();
        while (true) {
            System.out.println("----------- MENU -------------");
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
            System.out.println("2. Xoá tài liệu theo mã tài liệu");
            System.out.println("3. Hiện thị tất cả tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("5. Thoát");
            int number = ScannerUtils.inputNumber(1, 5);
            switch (number) {
                case 1:
                    function.addDocument(data);
                    break;
                case 2:
                    System.out.println("Chức năng 2");
                    break;
                case 3:
                    function.viewAllDocument(data);
                    break;
                case 4:
                    System.out.println("Chức năng 4");
                    break;
                case 5:
                    System.out.println("Đã thoát!!!");
                    return;
            }
        }
    }
}
