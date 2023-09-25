package MetodosDeString;

import javax.swing.JOptionPane;

public class ContadorDePalavras {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que permita ao usuário inserir uma frase e, em
		 * seguida, execute diversas operações de contagem de palavras e caracteres.
		 */

		int contagem = 0;

		int quantidade = 0;

		String userInput;

		int userChoice = 0;

		do {

			try {

				userInput = JOptionPane.showInputDialog(null,

						"Digite uma frase, o programa irá apresentar algumas funcionalidades");

				userInput = userInput.toLowerCase();

				userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Faça sua escolha \n1-Exibe o total de Caracteres(conta Espaço)\n2-Exibe o total de "
								+ "Caracteres(Não conta Espaço)\n3-Divida a frase em palavras e exiba o número total de palavras."
								+ "\n4-Pesquise por uma palavra e exiba quantas vezes essa palavra aparece na frase. "
								+ "\n5-Substitua uma palavra específica na frase por outra palavra fornecida pelo usuário e exiba a "
								+ "frase resultante."));

			} catch (NumberFormatException | NullPointerException e) {

				JOptionPane.showMessageDialog(null,

						"O programa foi fechado de maneira incorreta, ou ocorreu outro erro inesperado!");

				break;

			}

			switch (userChoice) {

			case 1:

				quantidade = userInput.length();

				userInput = userInput.toUpperCase();

				JOptionPane.showMessageDialog(null, "A frase selecionada " + userInput + " tem " + quantidade
						+ " de caracteres" + " contando os espaços como mencionado no ínicio da aplicação");

				break;

			case 2:

				userInput = userInput.replace(" ", "");

				quantidade = userInput.length();

				userInput = userInput.toLowerCase();

				JOptionPane.showMessageDialog(null, "A frase selecionada " + userInput + " tem " + quantidade
						+ " de caracteres" + " sem contar os espaços como mencionado no ínicio da aplicação");

				break;

			case 3:

				String[] palavraSeparadas = new String[100];

				palavraSeparadas = userInput.split(" ");

				userInput = userInput.toLowerCase();

				for (int i = 0; i < palavraSeparadas.length; i++) {

					System.out.println(palavraSeparadas[i]);

					System.out.println();

				}

				JOptionPane.showMessageDialog(null, " A frase recebida " + userInput + " foi separada e retorna "
						+ palavraSeparadas.length + " palavras ");

				break;

			case 4:

				String buscaPalavra;

				String[] palavrasSeparadas = new String[100];

				palavrasSeparadas = userInput.split(" ");

				buscaPalavra = JOptionPane.showInputDialog(null, " Digite uma palavra que deseja efetuar a busca");

				// Padroniza as Strings , deixando todos em letras minusculas.

				buscaPalavra = buscaPalavra.toLowerCase();

				for (int i = 0; i < palavrasSeparadas.length; i++) {

					// Equals é melhor que == pois o operador de comparação aponta para o espaço na
					// memória, enquanto o equals verifica se as duas Strings são semelhantes de
					// fato

					if (palavrasSeparadas[i].equals(buscaPalavra)) {

						contagem++;

					}

				}

				if (contagem > 0) {

					JOptionPane.showMessageDialog(null,
							" A palavra foi encontrada e teve uma ocorrência de " + contagem + " vezes");

				} else {
					JOptionPane.showMessageDialog(null, "A palavra não foi encontrada");
					break;
				}

				break;

			case 5:

				String trocaPalavra;

				trocaPalavra = JOptionPane.showInputDialog(null,

						"Escolha uma palavra, o programa irá inserir essa palavra na frase selecionada anteriormente");

				// Substitui a frase fornecida por uma frase fornecida posteriormente.

				userInput = userInput.replace(" ", "").replace("", trocaPalavra);

				JOptionPane.showMessageDialog(null, "A frase selecionada foi alterada para " + userInput);

				break;

			default:
				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhuma opção, portanto a aplicação foi encerrada");

				break;

			}

		} while (userInput != null);

	}

}
