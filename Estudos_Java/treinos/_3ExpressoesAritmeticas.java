public class _3ExpressoesAritmeticas {

    public static void main (String[] args){

        // Expressões Aritméticas

        double valor1 = 40;
        double valor2 = 30;

        double somaDeDoisValores = valor1 + valor2;
        double subtracaoDeDoisValores = valor1 - valor2;

        double multiplicacaoDeDoisValores = valor1 * valor2;
        double divisaoDeDoisValores = valor1 / valor2;
        double modRestoDeDivisaoInteira = valor1 % valor2;

        System.out.println("O resultado da soma do valor 1 + valor 2 é: " + somaDeDoisValores);
        System.out.println("O resultado da subração do valor2 menos o valor 1 é: " + subtracaoDeDoisValores);

        System.out.println("O resultado da multiplicação do valor 1 vezes o valor 2 é: " + multiplicacaoDeDoisValores);
        System.out.println("O resultado da divisão do valor 1 pelo valor 2 é: " + divisaoDeDoisValores);
        System.out.println("O resultado do mod(resto de divisão inteira) do valor 1 dividido pelo valor 2 é: " + modRestoDeDivisaoInteira);
    }
}

//  Operadores Aritméticos:
//  +  Soma
//  -  Subtração
//  *  Multiplicação
//  /  Divisão
//  %  Resto de divisão (mod)

//  Precedencia:
//  1°: * / %
//  2°: + -
//  Esquerda para direita ->
//  Primeiro entre parenteses (do mais interno pro externo)