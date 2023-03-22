public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }
    
    public void enqueue(No<T> novoNo){
        novoNo.setProximoNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No<T> dequeue(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while(primeiroNo.getProximoNo() != null){
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getProximoNo();
            }
            noAuxiliar.setProximoNo(null);
            return primeiroNo;
        }
        return null;
    }

    public No<T> first(){
        if(!this.isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while(primeiroNo.getProximoNo() != null){
                primeiroNo = primeiroNo.getProximoNo();
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        // Se refNoEntradaFila for null, retorna true, senão retorna false
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            stringRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}]--->";
            while(noAuxiliar.getProximoNo() != null){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            stringRetorno += "null";
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
