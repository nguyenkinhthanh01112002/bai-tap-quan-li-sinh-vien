/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapcoban;

import java.util.Scanner;

/**
 *
 * @author KINHTHANH
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiSinhVien quanLiSinhVien = new QuanLiSinhVien();
        while(true)
        {
            System.out.println(".............UNG DUNG QUAN LI SINH VIEN................");
            System.out.println("1.Them sinh vien vao danh muc can quan li");
            System.out.println("2.Hien thi danh sach sinh vien can quan li");
            System.out.println("3.Hien thi danh sinh sinh vien theo diem tang dan");
            System.out.println("4.Tim kiem sinh vien theo ten");
            System.out.println("0.Thoat chuong trinh");
            String button = scanner.nextLine();
            switch(button)
            {
                case "1":
                {
                    System.out.print("MOI BAN NHAP SO LUONG SINH VIEN MUON THEM VAO: ");
                    int n = scanner.nextInt();
           
                    for(int i=0;i<n;i++)
                    {
                        scanner.nextLine();
                        System.out.print("nhap vao ten cua sinh vien: ");
                        String ten = scanner.nextLine();
                        System.out.print("nhap vao id cua sinh vien: ");
                        String id = scanner.nextLine();
                        System.out.print("nhap vao diem trung binh cua sinh vien: ");
                        double diemTB = scanner.nextDouble();
                        //scanner.nextLine();
                        SinhVien sinhVien = new SinhVien(ten, id, diemTB);
                        quanLiSinhVien.themSinhVien(sinhVien);

                    }
                    /*System.out.print("nhap vao ten cua sinh vien: ");
                    String ten = scanner.nextLine();
                    System.out.print("nhap vao id cua sinh vien: ");
                    String id = scanner.nextLine();
                    System.out.print("nhap vao diem trung binh cua sinh vien: ");
                    double diemTB = scanner.nextDouble();
                    scanner.nextLine();
                    SinhVien sinhVien = new SinhVien(ten, id, diemTB);
                    quanLiSinhVien.themSinhVien(sinhVien);*/
                    scanner.nextLine();
                    break;
                }
                case "2":
                {
                    quanLiSinhVien.hienThiSinhVien();
                    break;
                }
                case "3":
                {
                    quanLiSinhVien.sapXep();
                    quanLiSinhVien.hienThiSinhVien();
                    break;
                }
                case "4":
                {
                    System.out.print("nhap vao ten cua sinh vien can tim kiem: ");
                    String tenCanTim = scanner.nextLine();
                    quanLiSinhVien.timKiem(tenCanTim);
                    break;
                }
                default:
                {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
        }
    }
    
}
