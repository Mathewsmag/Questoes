import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(final String[] args) {
		do {
			uiImprimeMenu();
			final int opcao = coletarOpcaoDesejada();
			switch (opcao) {
				case 1:// adicionar
					uiAdicionar();

					break;

				case 2:// remover

					break;

				case 3:// listar

					break;
				case 4: // alterar

					break;

				case 0:
					System.exit(0);
				default:
					break;
			}
		} while (true);
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	private static void uiImprimeMenu() {
		System.out.println("\n::: TODO App :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar:");
		System.out.println(":2: Remover:");
		System.out.println(":3: Listar:");
		System.out.println(":4: Alterar:");
		System.out.println(":0: Sair do programa :");
	}

	private static void uiAdicionar() {
		System.out.println(":::- PESSOA -:::");
		System.out.println(":::- 1 - Pessoa Fisica -:::");
		System.out.println(":::- 2 - Pessoa Juridica -:::");
		switch (opcao) {
			case 1:// PF
				System.out.println(":::- Adicionar -:::");
				System.out.println(":::::::::::::::::::");
				System.out.println("Nome:");
				System.out.println("Telefone:");
				System.out.println("Endereço:");
				System.out.println("Documento:");
			break;
			case 2://PJ
				break;
			default:
				break;
	}

}
