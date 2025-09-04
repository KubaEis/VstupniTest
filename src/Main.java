import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Mazlicek> mazlicek = new ArrayList<>();

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

            }
        }

    }
}