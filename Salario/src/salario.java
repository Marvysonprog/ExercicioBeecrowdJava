import java.util.Scanner; 

public class salario
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);		;
        
        int numeroFuncionario, numeroHoras;
        double valorHora;
        
        numeroFuncionario = teclado.nextInt();
        numeroHoras = teclado.nextInt();
        valorHora = teclado.nextDouble();
        
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", (numeroHoras * valorHora));
        
	}
}