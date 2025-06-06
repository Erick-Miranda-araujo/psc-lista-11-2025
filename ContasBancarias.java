import java.util.Scanner;

public class ContasBancarias extends Inscrissao {
    Scanner scanner = new Scanner(System.in);
public ContasBancarias(String nome, int numeroConta, Double saldo) {
        super(nome, numeroConta, saldo);
Scanner scanner = new Scanner(System.in);
System.out.println("Digite seu nome");
nome = scanner.nextLine();
System.out.println("Digite seu saldo inicial");
saldo = scanner.nextDouble();
System.out.println("Digite o número da conta");
numeroConta = scanner.nextInt();  
System.out.println("Conta bancária criada com sucesso."); 
 
    }
Double novoSaldo = 0.0;
@Override
public void depositar() {
double deposito = 0;
System.out.println("Digite o valor que deseja depositar");
deposito = scanner.nextDouble();
System.out.println("Foi depositado um valor de: " + deposito);
 novoSaldo += deposito;
}

@Override
public void sacar() {
Double saque =0.0;
System.out.println("Digite o valor que deseja sacar");
saque = scanner.nextDouble();
if (saque > saldo) {
System.out.println("Valor indisponível na conta");    
}
else if (saque > 5000) {
System.out.println("Valor ultrapassa o limite diário");
}
else{
novoSaldo-=saque;
System.out.println("Saldo restante " + novoSaldo);
}
}

@Override
public void consultarSaldo() {
System.out.println("saldo disponível: " + novoSaldo);
}
}
