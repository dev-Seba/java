public class Pory {
    public static void main(String[] args) {
        int m = 12;
        if (m>0 && m<4) {
            System.out.println("Jest wiosna");
        } else if (m>=4 && m<7) {
            System.out.println("Jest lato");
        } else if (m>=6 && m<10) {
            System.out.println("Jest jesien");
        } else if (m>=9 && m<=12) {
            System.out.println("Jest zima");
        } else {
            System.out.println("Nie ma takiego miesiąca");
        }
    }
}
