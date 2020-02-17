/* Faça o algoritmo que, dadas três dimensões (A, B e C), faça o seguinte:
a. Verifique se as três dimensões formam um triângulo. Caso não formem,
apresentar uma mensagem para o usuário.
Obs.: Três dimensões conseguem formar um triângulo, quando cada uma
dessas dimensões, individualmente, for menor que a soma das outras
duas dimensões.
b. Caso as dimensões formem um triângulo, apresentar qual tipo de
triângulo elas formam. Sabe-se que:
◦ Triângulo do tipo equilátero – possui os três lados iguais;
◦ Triângulo do tipo isósceles – possui dois lados iguais;
◦ Triângulo do tipo escaleno – possui os três lados diferentes.
*/
import java.util.Scanner;
public class SegundaQuestao {
    public static void main(String[] args) {
        System.out.println("Digite os valores de A, B e C: ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if(A + B > C && C + A > B && B + C > A){
            System.out.println("Forma um triangulo");
            if(A == B && A == C){
                System.out.println("Triangulo Equilatero");
            }
            if(A == C || A == B || B == C){
                if(A != B || A != B || B != C){
                    System.out.println("Triangulo Isosceles");
                }
            }else{
                System.out.println("Triangulo Escaleno");
            }
        }else{
            System.out.println("Não forma um triangulo");
        }
    }
}
