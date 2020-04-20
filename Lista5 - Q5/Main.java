import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    do {
      clearScreen();
      System.out.println("::1:: Calcular Pagamento ");
      System.out.println("::0:: Sair ");
      int opcao = coletarOpcao();
      switch (opcao) {
        case 1:
          clearScreen();
          menuTrabalhador();
          opcao = coletarOpcao();
          switch (opcao) {
            case 1:
              Trabalhador.TrabalhadorAssalariado();
              System.out.println("Pressione qualquer tecla para continuar...");
              sc.nextLine();
              break;
            case 2:
              Trabalhador.TrabalhadorPorHora();
              System.out.println("Pressione qualquer tecla para continuar...");
              sc.nextLine();
            default:
              break;
          }
          break;

        case 0:
          System.exit(0);
          break;

        default:
          break;
      }
    } while (true);
  }

  private static int coletarOpcao() {
    System.out.print("Digite a sua opcao:");
    return Integer.valueOf(sc.nextLine());
  }

  static void menuTrabalhador() {
    System.out.println("::1:: Trabalhador assalariado");
    System.out.println("::2:: Trabalhador pago por hora");
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

}