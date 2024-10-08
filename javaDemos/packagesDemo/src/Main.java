//Built-in
import java.util.Scanner;

/*import matematik.DortIslem;
import matematik.Logaritma;*/
import matematik.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Merhaba, " + name + "!");

        DortIslem islem = new DortIslem();
        System.out.println("Toplam: " + islem.topla(1,2));

        Logaritma logaritma = new Logaritma();
    }
}