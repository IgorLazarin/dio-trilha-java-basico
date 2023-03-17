public class Fila {

    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(primeiroNo.getRefNo() != null){
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAuxiliar.setRefNo(null);
            return primeiroNo;
        }
        return null;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
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
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            stringRetorno += "[No{objeto=" + noAuxiliar.getDado() + "}]--->";
            while(noAuxiliar.getRefNo() != null){
                noAuxiliar = noAuxiliar.getRefNo();
            }
            stringRetorno += "null";
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
