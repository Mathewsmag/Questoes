package questao1;

public class Lampada {
  public static boolean ligada;

public static void liga(){
  ligada = true;

}
public static void desliga(){
  ligada = false;

}
public static String observa() {
  if (ligada == true){
    return "ligada";
  }
  else {
    return "desligada";
  }
}
}