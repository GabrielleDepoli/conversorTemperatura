import java.util.Scanner;

public class Conversor{
    public static void main(String[] args) {
        //Declaração de variáveis
        double cel, fah; //cel - temperatura em graus celsius; fah - temperatura em graus fahrenheit
        int op; 

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa
        System.out.println("\n\t\t\t -- Conversor --\n");

        //Menu
        System.out.println("1. ºC para ºF");
        System.out.println("2. ºF para ºC");
        System.out.println("3. Sair");

        //Opição de usuário
        System.out.println("/nOpsão");
        op = entrada.nextInt();

        if op == 1;{
            //Entradas
            System.out.print("Informe a temperatura em ºC: ");
            cel = entrada.nextDouble();

            //Processamento
            fah = cel * 9 / 5 + 32;

            //Saída
            System.out.println("\n" + cel + "ºC = " + fah + "ºF\n");

        }else if (op = 2){
            //Convensão para fahrenheit
        }else if (op = 3){
            System.out.println("Forte abraço!!!");
        }else{
            System.out.println("Opção" + op + "incorreta");
        }
    }
}