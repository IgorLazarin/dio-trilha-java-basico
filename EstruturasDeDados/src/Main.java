public class Main {
    public static void main(String[] args){

        //Criando uma lista encadeada do tipo String
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        //Criando uma lista duplamente encadeada do tipo String
        //ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        //Criando uma lista circular do tipo String
        //ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        //Utilização da lista encadeada
        minhaListaEncadeada.add("Pessoa1");
        minhaListaEncadeada.add("Pessoa2");
        minhaListaEncadeada.add("Pessoa3");
        minhaListaEncadeada.add("Pessoa4");
        minhaListaEncadeada.add("Pessoa5");

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.remove(1);

        System.out.println(minhaListaEncadeada);
    }
}
