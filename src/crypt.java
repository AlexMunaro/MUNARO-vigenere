public class crypt{
    private char[] messaggio;

    public crypt(String Messaggio){
        this.messaggio = Messaggio.toCharArray();
    }

    public void cripta(int[] chiave){
        int k = 0;
        int l = chiave.length;
        for (int i = 0; i < messaggio.length; i++) {
            messaggio[i] = ((char) ((int) messaggio[i] + chiave[k]));
            k = (k + 1) % l;
        }
    }

    public void cambia_messaggio(String Messaggio){
        this.messaggio = Messaggio.toCharArray();
    }

    public String get_messaggio(){
        String output = "";
        for(char c : messaggio){
            output += c;
        }
        return output;
    }
}
