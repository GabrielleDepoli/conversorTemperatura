import java.util.Scanner;

public class Conversor{
    public static void main(String[] args) {
        //Declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit
        int op; //Opção do usuário 

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa
        System.out.println("\n\t\t\t -- Conversor --\n");

        //Menu
        System.out.println("1. ºC para ºF");
        System.out.println("2. ºF para ºC");
        System.out.println("3. Sair");

        //Opção de usuário
        System.out.println("\nOpção");
        op = entrada.nextInt();

        if (op == 1) {
            System.out.println("Conversão para Fahrenheit");

            //Entradas
            System.out.println("Informe a temperatura em ºC: ");
            cel = entrada.nextInt();

            //Processamento
            fah = cel * 9 / 5 + 32;

            //Saída
            System.out.println("\n" + cel + "ºC = " + fah + "ºF\n");

        } else if (op == 2) {
            //Converter Farenheit para Celsius
            System.out.println("Conversão para Celsius\n");

            //Entradas
            System.out.println("Informe a temperatura em ºF: ");
            fah = entrada.nextInt();

            //Processamento
            cel = (fah - 32) * 5 / 9;

            //Saída
            System.out.println("\n" + fah + "ºF = " + cel + "ºC\n");


        } else if (op == 3) {
            System.out.println("Forte abraço!!!");

        } else {
            System.out.println("Opção" + op + "incorreta");
        
        }while (op!=3);
    }
}