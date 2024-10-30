package com.recursion.basic;

import java.util.Stack;

public class OneToN {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        printNumbers(12,stack);
        System.out.println(stack);
    }
    public static void printNumbers(int n,Stack<Integer> stack){
        if(n <=0)  return ;
      //  System.out.println("calling :::::"+ n);

        stack.push(n);
        printNumbers(n-1,stack);

        System.out.println(n);
    }
}
