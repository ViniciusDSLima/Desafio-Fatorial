import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();
        // como foi feita a logica: resultado e o numero final de todo o fatorial;
        // com isso o number e o numero que e pego do cliente;
        // e o i e o numero que tem de ser multiplicado pelo numero ate chegar nele.
        //ou seja: number = 5, i comeca com 2 e multiplica o resultado ate chegar o valor do numero digitado.

        int resultado = 1;
        for(int i = 2; i <=number; i++){
            resultado *=i;
        }
        System.out.println(resultado);
    }


    //exemplo de fatorial: 5! = 5.4.3.2.1 = 120;
}