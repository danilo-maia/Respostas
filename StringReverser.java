import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s = sc.nextLine();
        System.out.print("String invertida: ");
        System.out.println(reverseString(s));
    }

    private static char[] reverseString(String s) {
        int aux = 0;
        char[] chars = s.toCharArray();
        char[] invertedChars = new char[s.length()];
        for (int i = s.length()-1; i >= 0; i--){
            invertedChars[aux] = chars[i];
            aux++;
        }
        return invertedChars;
    }
}
