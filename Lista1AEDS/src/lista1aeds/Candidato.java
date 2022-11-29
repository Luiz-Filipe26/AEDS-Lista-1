package lista1aeds;

public class Candidato {
    private int chave;
    private double notaFinal;
    private int opcao[] = new int [3];

    public Candidato(int chave, double notaFinal) {
        this.chave = chave;
        this.notaFinal = notaFinal;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int[] getOpcao() {
        return opcao;
    }

    //mudar aqui
    public void setOpcao(int[] opcao) {
        this.opcao = opcao;
    }

    public String listarCursos(){
        String retorno = "";
        for(int i = 0; i<opcao.length; i++){
            retorno += opcao[i] + ", ";
        }
        return retorno;
    }
    
    @Override
    public String toString() {
        return "\nCandidado{" + "chave=" + chave + ", notaFinal=" + notaFinal + ", opcao=" + listarCursos() + '}';
    }

    
    
}
