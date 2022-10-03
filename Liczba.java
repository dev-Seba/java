import java.util.Scanner;
public class Liczba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj liczbę ");
        Integer liczba1 = scan.nextInt();
        if (liczba1==0) {
            System.out.println("0 nie jest ani dodatnie ani ujemne");
        } else if(liczba1>0){
            System.out.println("liczba "+liczba1+" jest dodatnia");
        } else {
            System.out.println("Liczba "+liczba1+" jest ujemna");
        }
    }
}
