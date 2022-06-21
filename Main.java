import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int run = 1;
    do{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lrand = random.nextInt(100) + 1;
        System.out.println("Wylosowano ci liczbę z zakresu 1 - 100, zgadnij jaką");

        int lread;
        int tries = 0;
        do {
            tries++;
            System.out.print("Podaj liczbę: ");
            lread = scanner.nextInt();

            if (lread < lrand) {
                System.out.println("Wylosowana liczba jest większa");
            } else if (lread > lrand) {
                System.out.println("Wylosowana liczba jest mniejsza");
            } else {
                System.out.println("Nieźle, odgadnięcie tej liczby zajęło ci tylko " + tries + " prób");
            }
        } while (lrand != lread);
System.out.println("Czy chcesz kontynuować? \n1-tak\n0-nie");
      Scanner running = new Scanner(System.in);
      run=running.nextInt();
    }while (run!=0);
System.out.println("Dziękujemy za grę!");  }
}