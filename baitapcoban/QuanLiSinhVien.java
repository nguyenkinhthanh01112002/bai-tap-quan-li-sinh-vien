/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapcoban;

import java.util.ArrayList;

/**
 *
 * @author KINHTHANH
 */
public class QuanLiSinhVien {
    private ArrayList<SinhVien> students;
    public QuanLiSinhVien()
    {
        this.students = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sinhVien)
    {
        this.students.add(sinhVien);
    }
    public void hienThiSinhVien()
    {
        for(SinhVien o:students)
        {
            System.out.println(o.toString());
        }
    }
    public void sapXep()
    {
        for(int i=0;i<students.size()-1;i++)
        {
           int minPos = i;
           for(int j=i+1;j<students.size();j++)
           {
               if(students.get(minPos).getDiemTB()>students.get(j).getDiemTB())
               {
                   minPos = j;
               }
           }
           SinhVien temp = students.get(i);
           students.set(i, students.get(minPos));
           students.set(minPos, temp);
        }
    }
    public void timKiem(String tenCanTim)
    {
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getTen().equals(tenCanTim)==true)
            {
                System.out.println(students.get(i).toString());
            }
        }
    }
    
}
