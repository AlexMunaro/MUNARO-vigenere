import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        char ris;
        int l;
        int[] key;
        int k;
        char[] output;
        do {
            System.out.println("Inserire il messaggio da cryptare");
            Scanner scanner = new Scanner(System.in);
            String messaggio = scanner.nextLine();
            try {
                System.out.println("Inserire la lunghezza della chiave");
                l = scanner.nextInt();
            } catch (Exception e) {
                throw new Exception("Valore inserito non valido");
            }

            key = new int[l];

            for (int i = 0; i < l; i++) {
                System.out.println("Chiave " + i + ":");
                try {
                    key[i] = scanner.nextInt();
                } catch (Exception e) {
                    throw new Exception("Valore inserito non valido");
                }
            }
            k = 0;
            output = messaggio.toCharArray();
            System.out.println("Messaggio cryptato: ");
            for (char s : output) {
                System.out.print((char) ((int) (s) + key[k]));
                k = (k + 1) % l;
            }
            System.out.println("Vuole continuare? Y/N");
            ris =  scanner.next().charAt(0);
        }while(ris=='Y');
    }
}