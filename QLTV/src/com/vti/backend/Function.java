package com.vti.backend;

import com.vti.entity.Document;
import com.vti.ultils.ScannerUtils;

import java.util.List;

public class Function implements IFunction {
    @Override
    public void addDocument(List<Document> data) {
        // Muốn thêm mới loại tài liệu nào
        // Để làm đơn giản, làm việc với đối tượng Document thôi!
        String type = "";
        System.out.println("Mời bạn chọn loại tài liệu muốn thêm mới:");
        System.out.println("1. BOOK");
        System.out.println("2. MAGAZINE");
        System.out.println("3. NEWSPAPER");
        int choose = ScannerUtils.inputNumber(1, 3);
        switch (choose) {
            case 1:
                type = "BOOK";
                break;
            case 2:
                type = "MAGAZINE";
                break;
            case 3:
                type = "NEWSPAPER";
                break;
        }

        // Thêm mã
        System.out.println("Mời bạn nhập vào mã của tài liệu:");
        String code = ScannerUtils.inputString();

        // Nhà xuất bản
        System.out.println("Mời bạn nhập vào nhà xuất bản:");
        String nxb = ScannerUtils.inputString();

        // Số lượng phát hành
        System.out.println("Mời bạn nhập vào số lượng phát hành:");
        int sl = ScannerUtils.inputNumber();

        Document document = new Document();
        document.setCode(code);
        document.setNxb(nxb);
        document.setSl(sl);
        document.setType(type);

        data.add(document);

        System.out.println("Đã thêm mới tài liệu thành công");
    }

    @Override
    public void viewAllDocument(List<Document> data) {
        System.out.println(data);
    }
}
