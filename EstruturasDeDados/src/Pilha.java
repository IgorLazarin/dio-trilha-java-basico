public class Pilha<T> {

    private No<T> refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No<T> novoNo){
        No<T> refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAuxiliar);
    }

    public No<T> pop(){
        if(!isEmpty()){
            No<T> noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo();
            return noPoped;
        }
        return null;
    }
    public No<T> top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        // Se refNoEntradaPilha for null, retorna true, senão retorna false
        return refNoEntradaPilha == null ? true : false;
    }
}
