import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha um número: ");
        int n = sc.nextInt();
        System.out.print("Número pertence a sequência de fibonacci: ");
        System.out.println(isFromFibSequence(n));
    }

    public static boolean isFromFibSequence(int n){
        if (n == 0) return true;

        int a = 0;
        int b = 1;
        int c;

        while (b < n){ //para assim que o chega no n ou passa.
            c = b; //armazena B, pois ele será perdido na próxima linha
            b = a + b; //soma o último com penúltimo para achar o próximo da sequência
            a = c; //substitui o penúltimo pelo último anterior
        }
        return b == n; // retorna se o número é igual ao número passado como argumento
    }
}
