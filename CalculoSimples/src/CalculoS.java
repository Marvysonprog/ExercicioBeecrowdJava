/* 
Neste problema, deve-se ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. 
Em cada linha haverá 3 valores, 
respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto.
*/

import java.util.Scanner;

public class CalculoS {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int codigo1, codigo2, numero1, numero2;
        double valorUni1, valorUni2, valorFinal;

        codigo1 = teclado.nextInt();
        numero1 = teclado.nextInt();
        valorUni1 = teclado.nextDouble();

        codigo2 = teclado.nextInt();
        numero2 = teclado.nextInt();
        valorUni2 = teclado.nextDouble();

        valorFinal = (valorUni1 * numero1) + (valorUni2 * numero2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);

    }
}
