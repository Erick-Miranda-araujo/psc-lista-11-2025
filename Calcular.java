
import java.util.Scanner;

public class Calcular {

public static void conta(){
Calculadora calculadora = new Calculadora();
Scanner scanner = new Scanner(System.in);
String opcao = "";
while (!opcao.equals("Q")) {
System.out.println("Digite A para adição, B para subtração, C para multiplicação, D para Divisão, E para raiz quadrada ou F para potencia");
System.out.println("Se quiser finalizar digite Q");
opcao = scanner.nextLine();
switch (opcao) {
    case "A":
    calculadora.adicao();
        break;
    case "B":
    calculadora.subtracao();
    break;
    case "C":
    calculadora.multiplicacao();
    break;
    case "D":
    calculadora.divisao();
    break;
    case "E": 
    calculadora.raizQuadrada();
    break;
    case "F":
    calculadora.Potencia();
    case "Q":
    break;
    default:
    break;
} 
}
}
}