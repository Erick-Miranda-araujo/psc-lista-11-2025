import java.util.Scanner;

public class Acoes {
 public static void navegar(){
    ContasBancarias conta = new ContasBancarias(null, 0, 0.0);
    Scanner scanner = new Scanner(System.in);
  String resposta = "";  
    while(!resposta.equals("não")){
System.out.println("Deseja executar outra ação?");
resposta= scanner.nextLine();
switch (resposta) {
    case "A":
    conta.depositar();    
        break;
    case "B":
    conta.sacar();
    case "C":
    conta.consultarSaldo();
    case "não":
    break;
    default:
        break;
}
 }
 }
}
