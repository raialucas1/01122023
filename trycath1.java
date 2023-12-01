package TRYCATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycath1 {
    public static void main(String[] args) {
        try {       
            Scanner scnPeso=new Scanner(System.in);
            System.out.println("Digite seu peso:");
            double peso=scnPeso.nextDouble();

    
            System.out.println("Digite sua altura:");
            double altura=scnPeso.nextDouble();
            System.out.println("Seu IMC é de "+(peso/(altura*altura)));
            scnPeso.close();
         
        } catch (InputMismatchException e) {
            System.out.println("ocorreu um erro:"+e);
        }
    }
}
