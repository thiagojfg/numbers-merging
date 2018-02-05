/**
 * Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:
 * - O primeiro número de C é o primeiro número de A;
 * - O segundo número de C é o primeiro número de B;
 * - O terceiro número de C é o segundo número de A;
 * - O quarto número de C é o segundo número de B;
 * Assim sucessivamente...
 * - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
 * dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
 * - Caso C seja maior que 1.000.000, retornar -1
 * Desenvolva um algoritmo que atenda a todos os requisitos acima.
 */
package br.com.thiagojfg.s2it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Thiago Luiz Alves
 */
public class NumberMerger {

    public static void main(String[] args) {

        NumberMerger numberMerger = new NumberMerger();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            System.out.print("Enter integer a: ");
            
            int a = Integer.parseInt(br.readLine());
            
            System.out.print("Enter integer b: ");
            
            int b = Integer.parseInt(br.readLine());
            
            System.out.println("Integer c: " + numberMerger.merge(a, b));
            
        } catch (IOException e) {
            
            System.err.println("Invalid Format!");
            
        }
    }

    public int merge(int a, int b) {

        StringBuilder numberBuilder = new StringBuilder();

        String numberA = String.valueOf(Math.abs(a));
        String numberB = String.valueOf(Math.abs(b));

        int len = numberA.length() > numberB.length() ? numberA.length() : numberB.length();

        for (int i = 0; i < len; i++) {

            if (i < numberA.length()) {
                numberBuilder.append(numberA.charAt(i));
            }

            if (i < numberB.length()) {
                numberBuilder.append(numberB.charAt(i));
            }
        }

        Integer result = new Integer(numberBuilder.toString());

        return result > 1000000 ? -1 : result;
    }
}
