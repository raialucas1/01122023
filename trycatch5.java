package TRYCATCH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch5 {
    public static boolean validarInteger(String erro) {
        boolean retornar=false;
        if(Integer.valueOf(erro)>2147483647){
            throw new InputMismatchException("Ops! Valor inteiro maior que o permitido. Favor digitar um valor menor.");
        }else if(Integer.valueOf(erro)<=2147483647){
          System.out.println("Processando...");
        }
        else{
              Integer [] numeros={0,1,2,3,4,5,6,7,8,9};
            boolean achouInteiro=false;
            boolean achouString=false;
            for (int n = 0; n < erro.length(); n++) {
                achouInteiro=false;
                for (int i = 0; i < numeros.length; i++) {
                    if(Integer.valueOf(numeros[i])==Integer.valueOf(erro.substring(n,n+1))){
                        achouInteiro=true;
                    }
                }
                if(achouInteiro==false){
                    achouString=true;
                    
                }else{
                    retornar=true;
                }
            }
            if(achouString==true){
                System.out.println("Ops! Contém algum caracter não númerico na digitação. Favor digitar apenas números");
            }
        }
        return retornar;
    }
    public static void main(String[] args) {
       try {
        boolean identificouValor=false;
        Scanner scnValor=new Scanner(System.in);
        System.out.print("Digite um valor:");
        int valor=scnValor.nextInt();
        while (identificouValor==false) {
            if(validarInteger(String.valueOf(valor))==true){
                identificouValor=true;
            }
        }
        scnValor.close();
       } catch (Exception e) {
         System.out.println("Ops! Ocorreu o erro:"+e);
       }
    }
}
