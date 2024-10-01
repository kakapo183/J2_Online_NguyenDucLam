/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;

import models.coder;
import models.person;

/**
 * @author Admin
 */
public class oop_test {
    public static void khoiTao(coder[] coder1, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            coder1[i] = new coder();
            System.out.println("****");
            System.out.println("nhap du lieu coder so " + (i + 1));
            System.out.print("nhap ten : ");
            String name = sc.next();
            coder1[i].setName(name);
            System.out.print("nhap tuoi : ");
            int age = sc.nextInt();
            coder1[i].setAge(age);
            while (coder1[i].getAge() == 0) {

                age = sc.nextInt();
                coder1[i].setAge(age);
            }
            coder1[i].setAge(age);
            System.out.print("nhap so dien thoai : ");
            String phone = sc.next();
            coder1[i].setPhone(phone);
            coder1[i].setProgramming_Language();
            while (coder1[i].getProgramming_Language() == null) {
                System.out.println("chi duoc chon 1 trong 4 ! ");
                coder1[i].setProgramming_Language();
            }
            //System.out.println("name : " + coder1[i].getName() + "\nage : " + coder1[i].getAge()
            //       + "\nsdt " + coder1[i].getPhone() + " " + "\nlanguage : " + coder1[i].getProgramming_Language());

        }
    }

    public static void main(String[] args) {
        // parameter : tham so  // phuong thuc thongBao(String bao cao)
        // argument : o ham main hay phuong thuc  // thongBao("hom nay duoc nghi " )

        /* tu khoa this phân biệt biến biến instane với
             - biến cục bộ - parameter cùng tên
         */
 /*instanceof() -> trả về true false
            toán từ íntanceof() dùng để
            kiểm tra đối tượng có thuộc 1 kiểu dữ liệu cụ thể nào đó hay không

         */
        Scanner sc = new Scanner(System.in);

        coder[] coder = new coder[4];
        khoiTao(coder, 4);
        for (int i = 0; i < 4; i++) {
            System.out.println("du lieu cua nguoi " + (i + 1) + " la : ");
            System.out.println("name : " + coder[i].getName() + "\nage : " + coder[i].getAge()
                    + "\nsdt " + coder[i].getPhone() + " " + "\nlanguage : "
                    + coder[i].getProgramming_Language());
            System.out.println("*********");
        }

    }
}


