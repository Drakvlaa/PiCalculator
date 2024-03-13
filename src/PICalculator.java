import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class PICalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj dokładność z jaką chcesz obliczyć liczbę PI:");
    int precyzja = scanner.nextInt(); // dokładność liczby PI
    scanner.close();
    MathContext mc = new MathContext(precyzja);

    BigDecimal suma = new BigDecimal(0, mc);

    int iloscIteracji = 10000; // ilosc wykonań pętli
    for (int i = 1; i <= iloscIteracji; i++) {
      BigDecimal wyraz = new BigDecimal(4, mc).divide(new BigDecimal(2 * i - 1, mc), mc);

      if (i % 2 == 0) {
        suma = suma.subtract(wyraz, mc);
      } else {
        suma = suma.add(wyraz, mc);
      }
    }

    // Wypisuje wartość liczby pi z podaną dokładnością obliczeń
    System.out.println("Wartość liczby pi z dokładnością do " + precyzja + " miejsc po przecinku: \n" + suma);
  }
}