public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    // Esse daqui sempre vai adicionando no último nó
    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    // Esse aqui sempre vai adicionando no nó inicial
    public void adicionaInicio(T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    // Esse métod o aqui é o que a professora pediu, no qual é para adicionar o elemento
    // Em alguma posição especifica
    public void adiciona(int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        // Se começar do 0, é a posição inicial
        if (posicao == 0) {
            this.adicionaInicio(elemento);
        }
        // Se for do tamanho da lista(Último elemento), adiciona no final
        else if (posicao == this.tamanho) {
            this.adiciona(elemento);
        }
        // Se não for nenhum nem outro, adiciona no meio
        else {
            No<T> noAnterior = this.buscaNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }
    // Métod o para buscar o nó em si na posição especificada
    public No<T> buscaNo(int posicao) {
    	if(this.tamanho == 0) {
    		return null;
    	}
        if((posicao < 0 && posicao >= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No<T> atual = this.inicio;
        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        
        return atual;
    }
    
    /** @author Gigliarly
     * */
    public No<T> removerNo(int posicao) {
    	if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
    	No<T> aux;
        if (posicao == 0) {
        	aux = this.inicio;
            this.inicio = this.inicio.getProximo();
        }
        aux = this.buscaNo(posicao - 1);
        if (posicao == this.tamanho) {
        	this.ultimo = aux;
        	aux.setProximo(null);
        }
        else {
            aux.setProximo(aux.getProximo().getProximo());
        }
        
        this.tamanho--;
        return aux;
    }
    
    /** @author Pedro **/
    
    /** inverter lista **/
    
    public void inverter() {
    	No<T> anterior = null;
    	No<T> atual = this.inicio;
    	No<T> proximo = null;
    	
    	while(atual != null) {
    		proximo = atual.getProximo();
    		atual.setProximo(anterior);
    		anterior = atual;
    		atual = proximo;
    	}
    	this.inicio = anterior;
    }
    
    public int getTamanho() {
    	return this.tamanho;
    
    
    }

}