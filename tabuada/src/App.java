import java.util.Scanner; 

//Desenvolva um gerador de tabuada
//capaz de gerar a tabuada de qualquer numero interio entre 1 a 10.
//o usuário deve informar de qual numero ele deseja ver a tabuada
//A saída deve ser conforme o exemplo abaixo:

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int i = 0;

        System.out.println("Informe número: ");
        numero = scan.nextInt();

        do{
            System.out.println(numero + " X " + count + " = " + numero*count);
            
            count++;
            i++;
        } while (i < 11);

        scan.close();
    }
}
