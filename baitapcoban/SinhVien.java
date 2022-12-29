/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapcoban;

/**
 *
 * @author KINHTHANH
 */
public class SinhVien {
    private String ten;
    private String id;
    private double diemTB;

    public SinhVien(String ten, String id, double diemTB) {
        this.ten = ten;
        this.id = id;
        this.diemTB = diemTB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "{" + "ten=" + ten + ", id=" + id + ", diemTB=" + diemTB + '}';
    }
    
    
}
