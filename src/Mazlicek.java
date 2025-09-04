import java.util.Scanner;

public class Mazlicek {
    static Scanner sc = new Scanner(System.in);
    private String jmeno;
    private String druh;
    private int vek;
    private double vaha;
    Mazlicek() {
        System.out.println("Jak se jmenuje vas mazlicek?");
        jmeno = sc.nextLine();
        System.out.println("Jaky druh zvirete je vas mazlicek?");
        druh = sc.nextLine();
        System.out.println("Klolik let je vasemu mazlickovi?");
        vek = sc.nextInt();
        sc.nextLine();
        System.out.println("Klolik vazi vas mazlicek?");
        vaha = sc.nextDouble();
        sc.nextLine();
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public int getVek() {
        return vek;
    }

    public double getVaha() {
        return vaha;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    @Override
    public String toString() {
        return "Jmeno vaseho mazlicka je "+getJmeno()+". Druh vaseho mazlicka je "+getDruh()+". Vek vaseho mazlicka je "+getVek()+" let. Vaha vaseho mazlicka je "+getVaha()+" kg";
    }
}
