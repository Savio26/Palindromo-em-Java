import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palíndromo ===");
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine().toLowerCase().replace(" ", "");

        boolean teste = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                teste = false;
                break;
            }
        }
        if (teste) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }scanner.close();
    }
}