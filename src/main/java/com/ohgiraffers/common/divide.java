package com.ohgiraffers.common;

public class divide {

    public int divide (int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나눌수 없습니다.");
        }
        return num1 / num2;

    }




}
