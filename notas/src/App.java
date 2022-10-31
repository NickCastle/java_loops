import java.util.Scanner;


//Faça um programa que peça uma nota, entre zero a dez
//Mostre uma mensagem caso o valor seja inválido e continue pedindo
//até que o usuário informe um valor válido.


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota");
        nota = scan.nextInt();

        while(nota > 10 || nota < 0){
            System.out.println("Digite uma nota válida: ");
            nota = scan.nextInt();
        }

        scan.close();
        
        System.out.println("Fim do Programa");

    }
}
