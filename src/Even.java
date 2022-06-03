import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num;
        System.out.print("Lutfen Sayiyi Giriniz : ");
        num = inp.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        if (num <= 0) {
            System.out.print("Yanlis Bir Deger Girdiniz ! ");
        }
    }
}