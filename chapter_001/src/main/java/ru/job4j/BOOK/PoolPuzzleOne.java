package ru.job4j.BOOK;

public class PoolPuzzleOne {
    public static void main (String[]args){
        int x = 0;
        while(x<4){
            System.out.print("a");
            if(x<1){
                System.out.print(" ");
            }
            x=x+1;
            if(x>0){
                System.out.println("noise");
            }
            if(x==1){
                System.out.println("annoys");
            }
            x=x+2;
            if(x<4){
                System.out.print("an ");
            }
            x=x-1;
            if(x>1){
                System.out.print("oyster");
            }
            break;
        }

    }
}
