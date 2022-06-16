import java.util.Scanner;

public class odev20 {
    public static void main(String[] args) {
        int a, b, c=1, d, i, n = 1, r = 1,k,t;

        Scanner input = new Scanner(System.in);

        System.out.println("Java ile kombinasyon hesaplayan program");
        System.out.println("n'in r'li kombinasyonu C(n,r)");
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        System.out.println("Lutfen Sayilari Giriniz");
        System.out.print("\nn Sayisini giriniz : ");
        a = input.nextInt();
        System.out.print("r Sayisini giriniz : ");
        b = input.nextInt();

        d=a-b;

        for (i = 1; i < a; i++) {
            n = n * i;
        }
        for (k = 1; k < b; k++) {
            r = r * k;
        }
        for (t = 1; t < d; t++) {
            c = c * t;
        }
        // System.out.println("n! : " + n); //test
        // System.out.println("r! : " + r); //test
        // System.out.println("(n-r)! : " + c); // test
        System.out.println("\nC(n,r) = n! / (r! * (n-r)!)");
        System.out.println("C(n,r) = " + n + "/" + "(" + r +"*"+"("+c+"))");
        System.out.println("\nC(n,r) = " + n/(r*c));
    }
}
