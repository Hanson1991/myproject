package com.tom.cart;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = Integer.MIN_VALUE;
        while (answer != 2) {
            System.out.println("請輸入想進行的選項:");
            System.out.println("1. 訂票");
            System.out.println("2. 退出");
            answer = input.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("請輸入需要購買的張數");
                    int numOfTicket = input.nextInt();
                    System.out.println("已經成功購買"+numOfTicket+"張票了");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("多謝使用我們的服務, 再見!");
                    break;
            }
        }
    }
}
