import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();

        for (int k = 0; k < qtd; k++) {

            int joao = 0, maria = 0;

            for (int i = 0; i < 3; i++) {
                int x = sc.nextInt();
                int d = sc.nextInt();
                joao += x * d;
            }

            for (int i = 0; i < 3; i++) {
                int x = sc.nextInt();
                int d = sc.nextInt();
                maria += x * d;
            }

            if (joao > maria) {
                System.out.println("JOAO");
            } else {
                System.out.println("MARIA");
            }
        }
        sc.close();
    }
}
