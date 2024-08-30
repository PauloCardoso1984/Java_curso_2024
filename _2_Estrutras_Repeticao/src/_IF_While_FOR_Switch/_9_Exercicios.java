package _IF_While_FOR_Switch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _9_Exercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// EXERCICIO 1
		System.out.println("1 - Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par");
		System.out.print("Digite o número: ");
		byte numero = sc.nextByte();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Número PAR\n");
			} else {
				System.out.println("Número IMPAR\n");
			} 
		} else {
			System.out.println("Número fora do enunciado...\n");
		}
		
		
		// EXERCICIO 2
		System.out.println("2 - Criar um programa informa se o ano atual é um ano bissexto");
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		
		
		// EXERCICIO 3
		System.out.println("\nCriar um programa que receba duas notas parciais, calcular a média final. \n"
				+ "Se a nota do aluno for maior ou igual a 7.0 imprime no console Aprovado, se a nota \n"
				+ "for menor que 7.0 e maior do que 4.0 imprime no console Recuperação, caso contrário \n"
				+ "imprime no console Reprovado.");
		System.out.print("Digite a 1a nota: ");
		String valor1 = sc.next().replace(",", "."); // Caeita a digitação de , ou .
		System.out.print("Digite a 2a nota: ");
		String valor2 = sc.next().replace(",", "."); // Caeita a digitação de , ou .
		
		double nota1 = Double.parseDouble(valor1); 
		double nota2 = Double.parseDouble(valor2); 
		
		double media = (nota1 + nota2) / 2;
		if(media >= 7) {
			System.out.println("Média: " + media + " → Aluno APROVADO");
		} else if(media <= 7 && media >= 4) {
			System.out.println("Média: " + media + " → Aluno em RECUPERAÇÃO");
		} else if (media < 4) {
			System.out.println("Média: " + media + " → Aluno REPROVADO");
		} else {
			System.out.println("Nota não encontrada...");
		}
		
		
		// EXERCICIO 4 
		System.out.println("\nCriar um programa que receba um número e diga se ele é um número primo.");
		int contadorDeDivisores = 0;

		System.out.print("Digite um numero para verificar se é primo: ");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores == 0) {
			System.out.println("O numero " + num + " é primo.");
		} else {
			System.out.println("O numero " + num + " não é primo.");
		}
		
		
		// EXERCICIO 5
		System.out.println("\nRefatorar o exercício 04, utilizando a estrutura switch.");
		int contadorDivisores = 0;

		System.out.print("Digite um numero para verificar se é primo: ");
		int nro = sc.nextInt();

		for (int i = 2; i < nro; i++) {
			if (nro % i == 0) {
				contadorDivisores++;
			}
		}
		switch (contadorDivisores) {
		case 0:
			System.out.println("O numero " + nro + " é um numero primo.");
			break;
		default:
			System.out.println("O numero " + nro + "  não é um numero primo.");
		}
		
		
		// EXERCICIO 6
		System.out.println("\nJogo da adivinhação: Tentar adivinhar um número entre 0 - 100. \n"
				+ "Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas \n"
				+ "para adivinhar o número gerado. Ao final de cada tentativa, imprima a \n"
				+ "quantidade de tentativas restantes, e imprima se o número inserido é maior \n"
				+ "ou menor do que o número armazenado.\n");
		
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativasRestantes = 10;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println(numeroSecreto); // TIRAR DO SISTEMA ORIGINAL
        System.out.println("Tente adivinhar um número entre 0 e 100. Você tem " + tentativasRestantes + " tentativas.");
        
        while (tentativasRestantes > 0 && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = sc.nextInt();
            tentativasRestantes--;

            if (palpite < 0 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 0 e 100.");
                tentativasRestantes++; // Não conta como tentativa válida
                continue; // Continua para a próxima iteração do loop
            }
            if (palpite == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns! Você adivinhou o número secreto: " + numeroSecreto);
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior que " + palpite + "\n");
            } else {
                System.out.println("O número secreto é menor que " + palpite + "\n");
            }

            if (tentativasRestantes > 0) {
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            } else {
                System.out.println("Você não tem mais tentativas! O número secreto era: " + numeroSecreto);
            }
        }
        
        
        // EXERCICIO 7 - FORMA MAIS SIMPLES
        System.out.println("\nExemplo 1 - Criar um programa que enquanto estiver recebendo números positivos, \n"
        		+ "imprime no console a soma dos números inseridos, caso receba um número negativo, \n"
        		+ "encerre o programa. Tente utilizar a estrutura do while.");
      
        int soma = 0;
        int number;

        // Loop que continua enquanto o número inserido for positivo
        do {
            System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
            number = sc.nextInt();

            if (number >= 0) {
                soma += number; // Adiciona o número à soma se for positivo
                
                System.out.println("Soma atual: " + soma + "\n");
            } else {
                System.out.println("Número negativo recebido. Encerrando o programa.");
            }
        } while (number >= 0);    
        
        
     // EXERCICIO 7 - FORMA MAIS COMPLETA
        System.out.println("\nExemplo 2 - Criar um programa que enquanto estiver recebendo números positivos, \n"
        		+ "imprime no console a soma dos números inseridos, caso receba um número negativo, \n"
        		+ "encerre o programa. Tente utilizar a estrutura do while.");
      
        List<Integer> numeros1 = new ArrayList<>();
        int soma1 = 0;
        int quantidade = 0;

        System.out.println("Digite números positivos para somá-los. Para encerrar, digite um número negativo: ");

        while (true) {
        	System.out.print("Digite o número: ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                break; // Encerra o loop se o número for negativo
            }
            soma += num1; // Adiciona o número à soma
            numeros1.add(num1); // Armazena o número na lista
            quantidade++; // Aumenta a contagem de números
        }
       // Resultado
        System.out.println("Soma dos números positivos: " + soma1);
        System.out.println("Quantidade de números digitados: " + quantidade);
        System.out.println("Números digitados: " + numeros1);
    
    
        // EXERCICIO 8 - Forma 1
        System.out.println("\nExemplo 1 - Criar um programa que receba uma palavra e imprime no console letra por letra.");
        System.out.print("Digite uma palavra: ");
        sc.nextLine();
        String palavra = sc.nextLine();

        System.out.println("Imprimindo letra por letra:");

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }
        
        
     // EXERCICIO 8 - Forma 2
        System.out.println("\nExemplo 2 - Criar um programa que receba uma palavra e imprime no console letra por letra.");
        // Solicitar ao usuário que digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra2 = sc.nextLine();

        // Imprimir letra por letra com espaço
        for (int i = 0; i < palavra2.length(); i++) {
            System.out.print(palavra2.charAt(i) + " ");
        }
       
        
        // EXERCICIO 9 - Forma 1
        System.out.println("\nCrie um programa que recebe 10 valores e ao final imprima o maior número.");
        int maior = Integer.MIN_VALUE; // Inicializa o maior número com o menor valor possível

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero5 = sc.nextInt(); // Lê o número digitado pelo usuário

            // Atualiza o maior número se o número atual for maior
            if (numero5 > maior) {
                maior = numero5;
            }
        }
        // Imprime o maior número encontrado
        System.out.println("O maior número é: " + maior);
    
        
     // EXERCICIO 9 - Forma 2
        System.out.println("\nCrie um programa que recebe 10 valores e ao final imprima o maior número.");

        int[] numeros6 = new int[10];
        int maiorNumero = Integer.MIN_VALUE;

        // Loop para receber 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros6[i] = sc.nextInt();

            // Verifica se o número digitado é maior que o maior encontrado até agora
            if (numeros6[i] > maiorNumero) {
                maiorNumero = numeros6[i];
            }
        }
        // Exibe os números digitados
        System.out.println("\nOs números digitados foram:");
        for (int numero6 : numeros6) {
            System.out.print(numero6 + " ");
        }
        // Exibe o maior número
        System.out.println("\nO maior número digitado é: " + maiorNumero);
      
        
        // EXERCICIO 9 - Forma 3
        System.out.println("\nCrie um programa que recebe 10 valores e ao final imprima o maior número.");
        List<Double> numerosA = new ArrayList<>();
        int count = 0;

        while (count < 10) {
            System.out.print("Digite um número (ou 'sair'/'fim' para encerrar): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("sair") || input.equalsIgnoreCase("fim")) {
                break;
            }
            try {
                double numeroA = Double.parseDouble(input);
                numerosA.add(numeroA);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número ou 'sair'/'fim'.");
            }
        }
        if (numerosA.isEmpty()) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double maiorNumeroA = numerosA.get(0);
            for (double numeroA : numerosA) {
                if (numeroA > maiorNumeroA) {
                    maiorNumeroA = numeroA;
                }
            }
            System.out.println("Números digitados: " + numerosA);
            System.out.println("O maior número digitado: " + maiorNumeroA);
        }        
		sc.close();
	}
}
