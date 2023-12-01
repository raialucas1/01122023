package TRYCATCH;
import java.util.*;
public class trycatch2 {
    public static void main(String[] args) {

        try {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite a altura:");
        double altura=scanner.nextDouble();
        System.out.println("Digite a largura:");
        double largura=scanner.nextLong();
        System.out.println("O metro quadrado é de:"+(largura*altura));
        scanner.close();
        } catch (Exception e) {
             System.out.println("erro"+e);
        }
       
    }
}
