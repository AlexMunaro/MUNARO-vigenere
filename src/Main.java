import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        int l, scelta;
        int[] key;
        Scanner scanner = new Scanner(System.in);
        crypt cripta = null;
        String input;
        do {
            System.out.println("\nInserire le scelte sulla crittografia\n1-Inserisci messaggio\n2-Crittografa il messaggio\n3-Scrivi il messaggio");
            do {
                scelta = scanner.nextInt();
                scanner.nextLine();
            } while (scelta < 1 || scelta > 3);
            switch (scelta) {
                case 1:
                    System.out.println("Inserire il messaggio da cryptare");
                    input = scanner.nextLine();
                        if(cripta == null)
                            cripta = new crypt(input);
                        else
                            cripta.cambia_messaggio(input);
                    break;
                case 2:
                    if (cripta != null) {
                        try {
                            System.out.println("Inserire la lunghezza della chiave");
                            l = scanner.nextInt();
                        } catch (Exception e) {
                            throw new Exception("Valore inserito non valido");
                        }

                        key = new int[l];

                        for (int i = 0; i < l; i++) {
                            System.out.println("Chiave " + (i + 1) + ":");
                            try {
                                key[i] = scanner.nextInt();
                            } catch (Exception e) {
                                throw new Exception("Valore inserito non valido");
                            }
                        }
                        cripta.cripta(key);
                    } else {
                        System.out.println("Messaggio non ancora inserito");
                    }
                    break;
                case 3:
                    if (cripta != null) {
                        System.out.println("Messaggio cryptato: ");
                        System.out.println(cripta.get_messaggio());
                    } else
                        System.out.println("Messaggio non ancora inserito");
                    break;
            }
        } while (true);
    }
}