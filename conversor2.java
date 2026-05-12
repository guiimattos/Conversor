import java.util.Scanner;

public class conversor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero hexadecimal: ");
        String hexadecimal = sc.next().toUpperCase();

        int decimal = 0;

        for (int i = 0; i < hexadecimal.length(); i++) {
            char digito = hexadecimal.charAt(i);
            int valor;

            if (digito >= '0' && digito <= '9') {
                valor = digito - '0';
            } else {
                valor = digito - 'A' + 10;
            }

            decimal = decimal * 16 + valor;
        }

        System.out.println("Decimal: " + decimal);

        sc.close();
    }
}
