import java.util.Scanner;

public class Exercicio3 {

    public static void main(String args[]) {

    // Requisitos: Faça um Programa que peça dois números e imprima a soma.
    System.out.println("Bem vindo ao programa de soma! Informe dois números: ");
    double numero1;
    double numero2;
    double resultado;
    
    // 1) Ação do usuário: digitar dois números 
    Scanner teclado = new Scanner(System.in);
    numero1 = teclado.nextDouble();
    numero2 = teclado.nextDouble();
    teclado.close();


    // 2) Tarefa do Programa: calcular a soma
    resultado = numero1 + numero2;

    // 3) Resposta do Programa: mostrar o resultado da soma 
    System.out.print("O resultado é: " );
    System.out.print(resultado);


 }
    
}
