import java.util.Scanner;

//Faça um programa que leia 5 numeros
//informe o maior número
//média desses números

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        
        do {
             System.out.println("Numero: ");;
            numero = scan.nextInt();
            soma = soma + numero;

            ++count;
            if(numero>maior)maior=numero;
            System.out.println("o maior é "+ maior);
            
        } while(count<5);

        soma = soma / 5;

        System.out.println("a média dos numeros inseridos é: " + soma);

        scan.close();
    }
}
