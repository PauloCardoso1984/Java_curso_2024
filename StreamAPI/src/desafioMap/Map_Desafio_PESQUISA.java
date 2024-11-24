package desafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Map_Desafio_PESQUISA {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int numeroAlvo;
		String binario = null;
		String binarioInvertido = null;
		/*
		 * 1. Numero para String binária... 6 => "110"
		 * 2- Inverter a String... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		// 1. Numero para String binária... 6 => "110"
	    // Número que você quer procurar
		System.out.println("Qual numero deseja saber se é binário:");
		System.out.print("Numero: ");
		numeroAlvo = sc.nextInt();	    
        // Verifica se o número está na lista
        if (nums.contains(numeroAlvo)) {
        // Converte o número para binário
        binario = Integer.toBinaryString(numeroAlvo);
        System.out.println("O número " + numeroAlvo + " em binário é: " + binario);
        } else {
            System.out.println("O número " + numeroAlvo + " não está na lista.");
        }
	
		// 2- Inverter a String... "110" => "011"
        // Inverte a string binária
        if (nums.contains(numeroAlvo)) {
        binarioInvertido = new StringBuilder(binario).reverse().toString();
        System.out.println("O número " + numeroAlvo + " em binário é: " + binarioInvertido);
    	} else {
        System.out.println("O número " + numeroAlvo + " não está na lista.");
    	}        

		// 3. Converter de volta para inteiro => "011" => 3
        int numeroInteiro = Integer.parseInt(binarioInvertido, 2);
        
        System.out.println("O número binário " + binarioInvertido + " em inteiro é: " + numeroInteiro);
       
        
        sc.close();
	}
}
