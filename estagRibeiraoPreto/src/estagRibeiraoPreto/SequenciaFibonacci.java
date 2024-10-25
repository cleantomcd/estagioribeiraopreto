package estagRibeiraoPreto;

public class SequenciaFibonacci {
    public String verificaNumeroNaSequenciaFibonacci(int num) {
        int a = 0;
        int b = 1;
        int proximo = a + b;
        while (true) {
            proximo = a + b;
            if(proximo == num) return "O número está presente na sequência.";
            if(proximo > num) return "O número não está presente na sequência.";
            a = b;
            b = proximo;
        }
    }
}
