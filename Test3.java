import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe a ");
        Integer a = scan.nextInt();
        System.out.print("Podaj liczbe b ");
        Integer b = scan.nextInt();
        if (a==b) {
            System.out.println("a jest równe b");
        }
        else {
            if (a > b) {
                System.out.println("a jest wieksze od b");
            } else {
                System.out.println("b jest wieksze od a");
            }
        }
    }
}
