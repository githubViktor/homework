package org.hw1;

public class Task5 {

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if(increment == true){
            System.out.println(initValue+=delta);
        }else{
            System.out.println(initValue-=delta);
        }
    }
    public static void main(String[] args) {
        addOrSubtractAndPrint(3,4,false);
    }
}
