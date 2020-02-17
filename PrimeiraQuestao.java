/*
As maçãs custam R$ 1,30 cada se forem compradas menos de uma
dúzia, e R$ 1,00 cada se forem compradas pelo menos uma dúzia. Escreva um
programa que leia o número de maçãs compradas, calcule e escreva o custo
total da compra.
*/
import java.util.Scanner;
public class PrimeiraQuestao{
    public static void main(String[] args) {
        System.out.println("Quantas maças?");
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        System.out.println(quant + " maças compradas");
        float maça = (float) 1.30;
            if(quant >= 12){
                maça = (float) 1.00;
            }
        float mult = (quant * maça);
        System.out.println("Custo da compra " + mult);
    }
}
