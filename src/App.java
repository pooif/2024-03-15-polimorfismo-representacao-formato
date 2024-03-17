import java.util.Scanner;

class App {
  public static void main(String[] args) {
    
    Data d1 = new Data(15, 3, 2024);

    System.out.println(d1.getDia()); //   15
    System.out.println(d1.getMes()); //    3
    System.out.println(d1.getAno()); // 2024

    // Data d2 = new Data(35, 3, 2024);

    // DX = Developer eXperience
    try { // tente isso:
      Data d3 = new Data(1, 1, 1999);
    } catch (IllegalArgumentException e) { // capture:
      System.err.println(e.getMessage());
    }

    try {
      new Data(1, 13, 2000);
    } catch (IllegalArgumentException e) {
      System.err.println(e.getMessage());
    }

    String valor = "15/03/2024";

    Data d5 = new Data(valor);
    System.out.println(d5.getDia()); // 15
    System.out.println(d5.getMes()); // 3
    System.out.println(d5.getAno()); // 2024

    Data d6 = new Data();

    System.out.println(d6.getDia()); // 15
    System.out.println(d6.getMes()); // 4
    System.out.println(d6.getAno()); // 2000

    System.out.println(d6); // 15/4/2000
    System.out.println(d6.toString()); // 15/4/2000

  }
}