import java.util.Scanner;

public class conversor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numHexa = new int[4];
        int soma = 0;

        // Importante lembrar que no sistema decimal, vai do 0 ao 9
        // 10 = A, 11 = B, 12 = C, 13 = D, 14 = E, 15 = F

        for (int i = 0; i < 4; i++) {
        System.out.println("Insira o primeiro valor conforme a relacao dos comentarios");
        numHexa[i] += sc.nextInt();
        }

        soma = (numHexa[0] * 16 * 16 * 16)
                + (numHexa[1] * 16 * 16)
                + (numHexa[2] * 16)
                + numHexa[3];

        System.out.println("Sua soma é: " + soma);

        sc.close();
    }
}
