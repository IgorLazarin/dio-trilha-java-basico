public class ListaEncadeada<T> {
    
    No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            refEntrada = novoNo;
        }
        else{
            No<T> noAux = refEntrada;
            for(int i = 0; i < this.size()-1; i++){
                noAux = noAux.getProximoNo();
            }
            noAux.setProximoNo(novoNo);
        }
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAux = refEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size() - 1; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);
        if(index == 0){
            refEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAux = refEntrada;
        while(refAux != null){
            tamanhoLista++;
            refAux = refAux.getProximoNo();
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        //Tratamento caso for requisitado um índice maior do que nós existentes
        if(index>=size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista vai até o índice " + ultimoIndice + '.');
        }
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }
    
    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAux = refEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo = " + noAux.getConteudo() + "}]--->";
            noAux = noAux.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
