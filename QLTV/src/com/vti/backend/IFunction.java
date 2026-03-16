package com.vti.backend;

import com.vti.entity.Document;

import java.util.List;

public interface IFunction {
    void addDocument(List<Document> data);

    void viewAllDocument(List<Document> data);

    // Xoá tài liệu ra khỏi danh sách theo mã
    boolean removeDocument(List<Document> data, String code);

    // Tìm kiếm danh sách TL theo loại
    List<Document> searchDocument(List<Document> data, String type);

}
