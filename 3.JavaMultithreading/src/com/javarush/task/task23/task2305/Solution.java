package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution sol1=new Solution();
        InnerClass inner1=new InnerClass();
        InnerClass inner2=new InnerClass();
        sol1.innerClasses[0]=inner1;
        sol1.innerClasses[1]=inner2;
        Solution sol2=new Solution();
        InnerClass inner3=new InnerClass();
        InnerClass inner4=new InnerClass();
        sol2.innerClasses[0]=inner3;
        sol2.innerClasses[1]=inner4;
        Solution[] solArray=new Solution[2];
        solArray[0]=sol1;
        solArray[1]=sol2;

        return solArray ;
    }

    public static void main(String[] args) {

    }
}
