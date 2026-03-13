package com.vti.entity;

public class Document {
    //    Mã tài liệu(Mã tài liệu là duy nhất), Tên nhà xuất bản, số bản phát hành.
    private String code;
    private String nxb;
    private int sl; // Số bản phát hành
    private String type; // BOOK; MAGAZINE; NEWSPAPER

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code='" + code + '\'' +
                ", nxb='" + nxb + '\'' +
                ", sl=" + sl +
                ", type='" + type + '\'' +
                '}';
    }
}
