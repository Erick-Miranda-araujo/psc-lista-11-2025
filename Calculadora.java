
public class Calculadora extends Operacoes {
 
@Override
public void adicao() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
System.out.println("Digite um número");
Double num2 = scanner.nextDouble();
Double soma = num1 + num2;
System.out.println("Resultado da adição: " + soma);

}
@Override
public void subtracao() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
System.out.println("Digite um número");
Double num2 = scanner.nextDouble();
Double subtrair = num1 - num2;
System.out.println("Resultado da subtração: " + subtrair);
}
@Override
public void divisao() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
System.out.println("Digite um número");
Double num2 = scanner.nextDouble();
if (num2 == 0) {
    System.out.println("Impossível dividir por 0");
}
else{
Double dividir = num1 / num2;
System.out.println("Resultado da divisão: " + dividir);
}
}
@Override
public void multiplicacao() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
System.out.println("Digite um número");
Double num2 = scanner.nextDouble();
Double multiplicar = num1 * num2;
System.out.println("Resultado da multiplicação: " + multiplicar);
}
@Override
public void raizQuadrada() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
if (num1 < 0) {
System.out.println("Não existe raiz de número negativo.");
}
else{ 
Double raiz = Math.sqrt(num1);
System.out.println("Resultado da raiz quadrada: " + raiz);
}
}
@Override
public void Potencia() {
System.out.println("Digite um número");
Double num1 = scanner.nextDouble();
System.out.println("Digite um número");
Double num2 = scanner.nextDouble();
Double elevar = Math.pow(num1, num2);
System.out.println("Resultado da potencia: " + elevar);
}
}
