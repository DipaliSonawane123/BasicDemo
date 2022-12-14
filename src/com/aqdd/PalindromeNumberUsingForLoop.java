package com.aqdd;


import java.util.*;
public class PalindromeNumberUsingForLoop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int rev=0, rem=0;
        Scanner n = new Scanner (System.in);
        System.out.print("Enter the Number = ");
        int num = n.nextInt();
        for (;num>0;num=num/10)
        {
            rem=num%10;
            rev=rev*10+rem;

        }
        System.out.print("Reverse of the Number is "+rev);}}
