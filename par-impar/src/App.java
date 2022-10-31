import java.util.Scanner;

//Faça um programa que peça N números inteiros 
//Calcule e mostre a quantidade de números pares
//e a quantidade de números impares

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numeros = 0;
        int count = 0;
        int impares = 0;
        int pares = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("Números: ");
            numeros = scan.nextInt();
            
            if(numeros % 2 == 0) pares++;
            else impares++;
            
            count++;
        } while(count < quantNumeros);
         
        scan.close();

        System.out.println("Quantidade Par: " + pares);
        System.out.println("Qunatidade Impares: " + impares);
    }
}
