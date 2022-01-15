package com.company;

import java.util.Scanner;

public class Controller {
    LogInService l = new LogInService();
    RegisterService r = new RegisterService();
    Scanner sc = new Scanner(System.in);


    public void Menu(){
        System.out.println(" 1 - Đăng nhập ");
        System.out.println("2 - Quên tài khoản");
        System.out.println("3 - Đăng ký");
        System.out.println("0 - Thoát");

    }
    public void mainMenu(){
        while (true){
            Menu();
            int a = Integer.parseInt(sc.nextLine());
            switch (a){
                case 1 :
                    l.logins();
                    break;
                case 2 :
                    l.account();
                    break;
                case 3 :
                    r.Register();
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("khong co lua chon nay");
                    break;
            }
        }
    }
}