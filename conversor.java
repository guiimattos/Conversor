import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero decimal: ");
        int decimal = sc.nextInt();

        String hexadecimal = "";
        int numero = decimal;

        if (numero == 0) {
            hexadecimal = "0";
        }

        while (numero > 0) {
            int resto = numero % 16;
            char digito;

            if (resto < 10) {
                digito = (char) ('0' + resto);
            } else {
                digito = (char) ('A' + (resto - 10));
            }

            hexadecimal = digito + hexadecimal;
            numero = numero / 16;
        }

        System.out.println("Hexadecimal: " + hexadecimal);

        sc.close();
    }
}
