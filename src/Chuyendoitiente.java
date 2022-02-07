import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Moi ban nhap so tien USD:");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Gia tri VND:" + quydoi);
    }
}
