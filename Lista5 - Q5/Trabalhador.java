import java.util.Scanner;

public class Trabalhador {
  static double salario;
  static double valorHora;
  static Scanner sc = new Scanner(System.in);
  
  public static void TrabalhadorPorHora() {
    String nome;
    System.out.println("::::::Trabalho por hora::::::");
    System.out.println(":::Nome do trabalhador:::");
    nome = sc.nextLine();
    System.out.println(":::Valor da hora de trabalho:::");
    valorHora = sc.nextDouble();
    System.out.println(":::Horas Trabalhadas:::");
    int horas = sc.nextInt();
    if (horas > 40) {
      double horaExtra = ((horas - 40)*1.5);
      double pagar = calcularPagamento(40) + calcularPagamento(horaExtra);
      System.out.println(nome + ":Deve receber R$" + pagar);
    } else {
      double pagar = calcularPagamento(horas);
      System.out.println(nome + ":Deve receber R$" + pagar);
    }
  }

  public static void TrabalhadorAssalariado() {
    String nome;
    System.out.println("::::::Trabalhador assalariado::::::");
    System.out.println(":::Nome do trabalhador:::");
    nome = sc.nextLine();
    System.out.println(":::Valor do salario:::");
    salario = sc.nextDouble();
    System.out.println(nome + ":Deve receber R$" + salario);

  }

  public static double calcularPagamento(double horas) {
    double pagamento;
    pagamento = horas * valorHora;
    return pagamento;
  }
}