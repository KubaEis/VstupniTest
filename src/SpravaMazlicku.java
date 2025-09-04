import java.util.ArrayList;
import java.util.List;

public class SpravaMazlicku {
    public void vypocetPrumernehoVeku(List<Mazlicek> mazlicek){
        int prumer = 0;
        int pocet = 0;
        for(int x=0; x < mazlicek.size(); x++){
            prumer = prumer+mazlicek.get(x).getVek();
            pocet ++;
        }
        System.out.println("Prumer: " + prumer/pocet);
    }
    public void vypocetPrumerneVahy(List<Mazlicek> mazlicek){
        double prumer = 0;
        double pocet = 0;
        for(int x=0; x < mazlicek.size(); x++){
            prumer = prumer+mazlicek.get(x).getVaha();
            pocet ++;
        }
        System.out.println("Prumer: " + prumer/pocet);
    }
    public void najdiMazlickaPodleJmena(String jmeno, List<Mazlicek> mazlicek){
        for(int x=0; x < mazlicek.size(); x++){
            if (mazlicek.get(x).getJmeno().equals(jmeno)){
                System.out.println("Mazlicek se nasel:");
                System.out.println(mazlicek.get(x));
            }else{
                System.out.println("Mazlicek se nenasel");
            }
        }
    }
    public void najdiMazlickaPodleDruhu(String druh, List<Mazlicek> mazlicek){
        for(int x=0; x < mazlicek.size(); x++){
            if (mazlicek.get(x).getDruh().equals(druh)){
                System.out.println("Mazlicek se nasel:");
                System.out.println(mazlicek.get(x));
            }else{
                System.out.println("Mazlicek se nenasel");
            }
        }
    }
}
