/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import java.util.Scanner;

public class coder extends person {
    Scanner sc = new Scanner(System.in);
    private String Programming_Language ;

    public coder() {
    }

    public coder(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }

    public coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language() {
        System.out.println("chon ngon ngu \n 1 : Java \n 2 : C \n 3 : C# \n 4 : Python");
        System.out.println("moi nhap lua chon ");
        int t = sc.nextInt();
        switch (t) {
            case 1:
                this.Programming_Language = "Java";
                break;
            case 2:
                this.Programming_Language = "C#";
                break;
            case 3:
                this.Programming_Language = "C";
                break;
            case 4:
                this.Programming_Language = "Python";
                break;
            default:

        }
    }

}


