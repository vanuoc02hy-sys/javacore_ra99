package com.vti.backend;

import com.vti.entity.Document;

import java.util.List;

public interface IFunction {
    void addDocument(List<Document> data);

    void viewAllDocument(List<Document> data);
}
