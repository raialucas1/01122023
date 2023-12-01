package TRYCATCH;

import java.util.Scanner;

public class trycatch4 {
    public static void main(String[] args) {
        try {
            Scanner scnQuantia=new Scanner(System.in);
            System.out.println("Digite o valor da quantia que deseja depositar:");
            long quantia=scnQuantia.nextLong();

            if(quantia>1500000000000000000L){
                System.out.println("Valor muito alto para depósito! Tente outro valor menor");
            }else{
                System.out.println("Valor depositado com sucesso!");
            }
            scnQuantia.close();
        } catch (Exception e) {
            System.out.println("ops! Ocorreu um erro"+e);
        }
    }
}
