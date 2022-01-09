package com.company;

import java.util.Scanner;

public class ThreeNPlusOneExample {
    static int Solution(int a){
        int count=1;
        while(a!=1)
        {
            if(a%2==0)
            {
                a=a/2;
            }
            else
            {
                a=a*3+1;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b)
        {
            int temp=a;
            a=b;
            b=temp;
        }

        int solution=0;
        for(int i=a;i<=b;i++)
        {
            int answer = ThreeNPlusOneExample.Solution(i);
            //System.out.println(i+"-------"+answer);//
            solution=(solution<answer)?answer:solution;
        }

        System.out.println("Output :-");
        System.out.println(a+" "+b+" "+solution);
    }
}
