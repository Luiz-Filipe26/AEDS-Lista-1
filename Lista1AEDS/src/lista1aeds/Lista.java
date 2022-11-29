package lista1aeds;

public class Lista {
    
    private static class Celula{
        //Object item;
        Candidato candidato;
        Celula prox;
    }
                                   
    private Celula primeiro, ultimo, pos;            
    
    //construtor que gera uma lista vazia
    public Lista(){
        this.primeiro = new Celula(); 
        this.pos = this.primeiro; 
        this.ultimo = this.primeiro; 
        this.primeiro.prox = null; 
    }
    
    public void insere (Candidato candidato){
        this.ultimo.prox = new Celula(); 
        this.ultimo = this.ultimo.prox; 
        this.ultimo.candidato = candidato; 
        this.ultimo.prox = null; 
    }
    
    public void imprime(){
        Celula aux = this.primeiro.prox;
        //tem que usar while porque não sabemos quantos elementos a lista tem
        while (aux != null) { //na hora de criar a celula o prox é null, quando achar prox com null significa que é o ultimo elemento 
            System.out.print(aux.candidato.toString()); 
            aux = aux.prox; //aux é uma célula, o prox é a próxima célula
        }
    }
    
    //verifica se a lista está vazia
    public boolean vazia(){
        //se primeiro e ultimo forem iguais (igual declado no construtor) a lista está vazia
        return (this.primeiro == this.ultimo);
    }
    
    //pesquisar um objeto dentro da lista e retornar true se encontrar
    public Object pesquisa(Object chave){
        //chamar o método para conferir se lista está vazia primeiro
        if (this.vazia() || chave == null) {
            //System.out.println("Erro! Lista vazia");
            return null;
        }
        
        Celula aux = this.primeiro; //célula auxiliar para ir caminhando pelas células da lista
        while (aux.prox != null) {            
            if(aux.prox.candidato.equals(chave)){
                return true; //encontrou o valor e saiu do método
            }
            aux = aux.prox; //atualizar célula auxiliar
        }
        /*
        Celula aux = this.primeiro.prox; //célula auxiliar para ir caminhando pelas células da lista
        while (aux != null) {            
            if(aux.item == chave){
                return true; //encontrou o valor e saiu do método
            }
            aux = aux.prox; //atualizar célula auxiliar
        }*/
        
        return false;
    }
    
    public Object retira(Object chave){
        if(vazia() || chave == null){
            System.out.println("Erro! Lista vazia ouu chave inválida");
            return null;
        }
        
        /*
        Celula aux = this.primeiro;
        while (aux.prox != null) {            
            if(aux.prox.item.equals(chave)){
                aux.prox = aux.prox.prox;
                return true;
            }
            aux = aux.prox;
        }
        return false;*/
        
        Celula aux = this.primeiro;
        while (aux.prox != null && !aux.prox.candidato.equals(chave)) {            
            aux = aux.prox;
        }
        
        if(aux.prox == null){
            return null; //chave não encontrada, chegou no final da lista e não achou
        }
        
        Celula q = aux.prox;
        Object item = q.candidato;
        aux.prox = q.prox;
        if(aux.prox == null){
            this.ultimo = aux;
        }
        return item;
    }
}
