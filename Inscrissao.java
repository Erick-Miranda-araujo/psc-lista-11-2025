public abstract class Inscrissao {
    
protected String nome;
protected int numeroConta;
protected Double saldo;

public Inscrissao (String nome,int numeroConta, Double saldo){
this.nome = nome;
this.numeroConta = numeroConta;
this.saldo = saldo;
}
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
public int getNumeroConta(){
    return numeroConta;
}
public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
}
public Double getSaldo(){
    return saldo;
}
public void setSaldo(Double saldo) {
    this.saldo = saldo;
}
abstract void depositar();
abstract void sacar();
abstract void consultarSaldo();

 } 

