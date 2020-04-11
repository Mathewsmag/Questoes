package br.com.somosicev.classes.lista04.q01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();

	public static void main(String[] args) {

		int idContato;
		do {
			imprimeMenu();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
				case 1: // adicionar
					Contato novoContato = criarContato();
					bd.adicionar(novoContato);
					break;

				case 2:// remover
					imprimeContatos();
					System.out.println("Você deve escolher uma das opções para remover");
					opcao = coletarOpcaoDesejada();
					bd.remover(opcao);
					break;

				case 3:// buscar
					System.out.println("Qual o nome do seu contato?");
					String nomeContato = sc.nextLine();
					bd.buscar(nomeContato);

					break;
				case 4: // alterar
					imprimeContatos();
					System.out.println("Qual o ID do contato que você quer alterar?");
					int id = coletarOpcaoDesejada();
					fazerAlteracoes(id);

					break;

				case 0:
					System.exit(0);
				default:
					break;
			}
		} while (true);

	}

	private static void imprimeContatos() {

		// StringBuilder sb = new StringBuilder();

		for (int posicao = 0; posicao < bd.contatos.length; posicao++) {
			if (bd.buscar(posicao) != null) {
				Contato tmp = bd.buscar(posicao);
				System.out.println(posicao + ": (" + tmp.getNome() + ", " + tmp.getTelefone() + ", " + tmp.getEndereco() + ")");
			}

		}

	}

	private static imprimeContato(int posicao) {
		Contato tmp = bd.buscar(posicao);
		System.out.println(posicao + ": (" + tmp.getNome() + ", " + tmp.getTelefone() + ", " + tmp.getEndereco() + ")");

	}

	private static Contato criarContato() {
		System.out.print("Digite o nome:");
		String novoNome = sc.nextLine();
		System.out.print("Digite o telefone:");
		String novoTelefone = sc.nextLine();
		System.out.print("Digite o endereco:");
		String novoEndereco = sc.nextLine();

		return new Contato(novoNome, novoTelefone, novoEndereco);
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	private static void fazerAlteracoes(int id) {
		System.out.print("Digite o novo nome:");
		String novoNome = sc.nextLine();
		System.out.print("Digite o novo telefone:");
		String novoTelefone = sc.nextLine();
		System.out.print("Digite o novo endereco:");
		String novoEndereco = sc.nextLine();
		bd.alterarNome(id, novoNome);
		bd.alterarEndereco(id, novoEndereco);
		bd.alterarTelefone(id, novoTelefone);

	}

	static void imprimeMenu() {
		System.out.println("\n::: Agenda :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar novo contato :");
		System.out.println(":2: Remover novo contato :");
		System.out.println(":3: Buscar contatos:");
		System.out.println(":4: Alterar contato :");
		System.out.println(":0: Sair do programa :");
	}

}
