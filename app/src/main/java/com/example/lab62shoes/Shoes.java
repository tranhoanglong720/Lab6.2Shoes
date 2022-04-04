package com.example.lab62shoes;

public class Shoes {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    private  int id;
    private  String ten;
    private String gia;
    public Shoes(int id, String ten, String gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }


}
