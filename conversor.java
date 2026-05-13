import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0; // guarda numero decimal digitado
        int resto = 0; // guarda o resto da divisao por 16
        String hexaDecimal = ""; // comeca vazio para receber o resultado no final

        // Declaramos as variaveis inicializando-as

        System.out.println("Digite um numero decimal: ");
        numero = sc.nextInt();

        // O leitor recebe o numero
        // Enquanto o numero for maior que zero, ele vai compilar
        // Caso esse numero seja negativo, ele para a execucao

        while (numero > 0) {
            resto = numero % 16;

            if (resto == 10) {
                hexaDecimal = "A" + hexaDecimal; // resto for 10 coloca A
            } else if (resto == 11) {
                hexaDecimal = "B" + hexaDecimal; // resto for 11 coloca B
            } else if (resto == 12) {
                hexaDecimal = "C" + hexaDecimal; // resto for 12 coloca C
            } else if (resto == 13) {
                hexaDecimal = "D" + hexaDecimal; // resto for 13 coloca D
            } else if (resto == 14) {
                hexaDecimal = "E" + hexaDecimal; // resto for 14 coloca E
            } else if (resto == 15) {
                hexaDecimal = "F" + hexaDecimal; // resto for 15 coloca F
            } else {
                hexaDecimal = resto + hexaDecimal; // resto for de 0 a 9 cai aqui
            }

            numero = numero / 16; // depois de calcular o resto ele faz isso
        }

        System.out.println("Hexadecimal: " + hexaDecimal); // resultado 

        sc.close();
    }
}
