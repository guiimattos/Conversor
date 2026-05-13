import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int resto = 0;
        String hexaDecimal = "";

        // Declaramos as variaveis inicializando-as

        System.out.println("Digite um numero decimal: ");
        numero = sc.nextInt();

        // O leitor recebe o numero
        // Enquanto o numero for maior que zero, ele vai compilar
        // Caso esse numero seja negativo, ele para a execucao

        while (numero > 0) {
            resto = numero % 16;

            if (resto == 10) {
                hexaDecimal = "A" + hexaDecimal;
            } else if (resto == 11) {
                hexaDecimal = "B" + hexaDecimal;
            } else if (resto == 12) {
                hexaDecimal = "C" + hexaDecimal;
            } else if (resto == 13) {
                hexaDecimal = "D" + hexaDecimal;
            } else if (resto == 14) {
                hexaDecimal = "E" + hexaDecimal;
            } else if (resto == 15) {
                hexaDecimal = "F" + hexaDecimal;
            } else {
                hexaDecimal = resto + hexaDecimal;
            }

            numero = numero / 16;
        }

        System.out.println("Hexadecimal: " + hexaDecimal);

        sc.close();
    }
}
