import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);

        double Edad=0;
        
        System.out.println("ingrese su edad:");
        Edad= pt.nextDouble();

        if (Edad >= 18 && Edad <= 65) {
            System.out.println("Apto para donar");
        } else{
            System.out.println("No apto para donar");
        }
    }
}