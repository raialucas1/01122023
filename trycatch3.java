package TRYCATCH;

import java.util.Scanner;

public class trycatch3 {
    public static void main(String[] args) {
       
        try {
        Scanner scnIdade=new Scanner(System.in);
        System.out.println("Digite sua idade:");
        short idade=scnIdade.nextShort();

        if(idade>18){
            System.out.println("Parabéns! Você é maior de idade.");
        }else{
            System.out.println("Xii! Você é menor de idade.");
        }
        scnIdade.close();
        } catch (Exception e) {
           System.out.println("ops... ocorreu um erro:"+ e);
        }
    }
}
