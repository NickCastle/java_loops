import java.util.Scanner;

///Faça um programa que calcule o fatorial de numero interiro fornecido pelo o usuario.

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int mult = 1;

        System.out.println("Informe um numero: ");
        numero = scan.nextInt();


        for(count = numero;count >=1;count--){

            mult = mult * count;

        }

        System.out.println("resultado: "+ mult);

        scan.close();
    }
}
