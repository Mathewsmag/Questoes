package questao1;
import java.util.Scanner;

public class Main{
public static void main(String [] args){
  int interruptor;
  Scanner input = new Scanner(System.in);
  System.out.println("Desligar = 0");
  System.out.println("Desligar = 1");
  
  interruptor = input.nextInt();
  
  if (interruptor == 1){
    Lampada.liga();
  }
  else {
    Lampada.desliga();
  }
  System.out.println(Lampada.observa());
  input.close();



  

  
}
}