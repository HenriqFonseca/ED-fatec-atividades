public class Pilha {
    private No topo;
    private int tamanho;

    public Pilha(){
        topo = null;
        tamanho =0;
    }

    public boolean estaVazia(){
        return tamanho ==0;
    }

    public void empilhar(Object info){
        No no = new No(info);

        if(!estaVazia()){
            no.proximo = topo;
        }

        topo = no;
        tamanho++;

    }

    public Object topo(){
        if(estaVazia()){
            return null;
        }
        return topo.info;
    }

    public Object desempilhar(){
        if(estaVazia()){
            return null;
        }
        Object info = topo.info;
        topo = topo.proximo;
        tamanho--;
        return info;
    }


}
