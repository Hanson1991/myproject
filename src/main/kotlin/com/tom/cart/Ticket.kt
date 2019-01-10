package com.tom.cart

import java.util.*

fun main(args: Array<String>) {
    var answer = Int.MIN_VALUE;
    var input = Scanner(System.`in`);
    while (answer != 2) {
        println("請輸入想進行的選項:")
        println("1. 訂票")
        println("2. 退出")
        answer = input.nextInt();
        when (answer) {
            1 -> {
                println("請輸入需要購買的張數")
                val numOfTicket = input.nextInt()
                println("已經成功購買" + numOfTicket + "張票了")
                println()
            }
            2 -> println("多謝使用我們的服務, 再見!")
        }

    }

}