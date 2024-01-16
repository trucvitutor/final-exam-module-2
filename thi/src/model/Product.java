package model;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {
    public static final Long serialVersionUID = 1123L;
    private String Ma;
    private String ten;
    private Double gia;
    private int soLuong;
    private String moTa;

    public Product(String ma, String ten, Double gia, int soLuong, String moTa) {
        Ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }


    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Ma='" + Ma + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return (int) (this.getGia() - o.getGia());
    }
}
