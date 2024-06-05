import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Insira dois valores - (O primeiro valor deve ser menor que o segundo!)");
        System.out.println("Primeiro valor: ");
        n1 = terminal.nextInt();
        System.out.println("Segundo valor: ");
        n2 = terminal.nextInt();

        try{
            contador(n1, n2);
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }

    public static void contador(int x, int y){
        if(x > y){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
        int contagem = y - x;
        for (int index = 1; index <= contagem; index++){
            System.out.println("Imprimindo o número: " + index);
        }
    }

}
