import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Mazlicek> mazlicek = new ArrayList<>();
        SpravaMazlicku spravaMazlicku = new SpravaMazlicku();
        /*/Mazlicek pes = new Mazlicek();
        mazlicek.add(pes);
        Mazlicek kocka = new Mazlicek();
        mazlicek.add(kocka);
        for (int i = 0; i < mazlicek.size(); i++) {
            System.out.println(mazlicek.get(i).toString());
        }*/
        int cislo = 1;
        System.out.println("Vitej v menu");
        while(cislo == 1){
            System.out.println("1) Chci pridat mazlicka");
            System.out.println("2) Chci vypsat mazlicky");
            System.out.println("3) Prumerny vek");
            System.out.println("4) Prumerna vaha");
            System.out.println("5) Hledani podle jmena");
            System.out.println("6) Hledani podle druhu");
            int n = sc.nextInt();
            sc.nextLine();
            if (n > 2||n < 1){
                System.err.println("Invalid input");
                break;
            }
            switch(n){
                case 1:
                    Mazlicek m = new Mazlicek();
                    mazlicek.add(m);
                    break;
                case 2:
                    for (int i = 0; i < mazlicek.size(); i++) {
                        System.out.println(mazlicek.get(i).toString());
                    }
                    break;
                case 3:
                    spravaMazlicku.vypocetPrumernehoVeku(mazlicek);
                    break;
                case 4:
                    spravaMazlicku.vypocetPrumerneVahy(mazlicek);
                    break;
                case 5:
                    System.out.println("Jakeho mazlicka chcete najit?");
                    String name = sc.nextLine();
                    spravaMazlicku.najdiMazlickaPodleJmena(name, mazlicek);
                    break;
                case 6:
                    System.out.println("Jakeho mazlicka chcete najit?");
                    String dru = sc.nextLine();
                    spravaMazlicku.najdiMazlickaPodleDruhu(dru, mazlicek);
                    break;

            }
        }

    }
}