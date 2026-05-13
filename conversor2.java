import java.util.Scanner;

public class conversor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Importante lembrar que no sistema decimal, vai do 0 ao 9
        // 10 = A, 11 = B, 12 = C, 13 = D, 14 = E, 15 = F

        System.out.println("Digite um numero hexadecimal: ");
        String hexadecimal = sc.next().toUpperCase(); // transforma letra minuscula em maiscula

        int decimal = 0;
        boolean entradaValida = true;

        for (int i = 0; i < hexadecimal.length(); i++) { // retorna o tamanho da String
            char digito = hexadecimal.charAt(i); // pegar os caracteres que estao na posicao i
            int valor;

            if (digito >= '0' && digito <= '9') { // verifica se o caractere é um numero de 0 até 9
                valor = digito - '0'; // transforma caractere em numero
            } else if (digito >= 'A' && digito <= 'F') { // verifica se é uma letra hexadecimal (A - F)
                valor = digito - 'A' + 10; // transforma letra hexa em decimal
            } else {
                entradaValida = false; // caso insirir algo a mais depois do F 
                break; // para o for 
            }

            decimal = decimal * 16 + valor; // monta o numero decimal e 
            // decide o que vai imprimir
        }

        if (entradaValida) { // if padrao que decide mostrar a mensagem valida caso tudo ocorra normal no for
            System.out.println("Decimal: " + decimal);
        } else {
            System.out.println("Numero hexadecimal invalido."); // errado caso tenha alguma errada 
        }

        sc.close();
    }
}
