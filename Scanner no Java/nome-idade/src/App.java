//Uso da Classe Scanner no Java:

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String str;

        System.out.println("Digita seu nome ai: ");
        str = scan.nextLine();
        System.out.println("seu nome é " + str);

        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        System.out.println("O numero digitado foi " + numero);

        scan.close();


    }
}
