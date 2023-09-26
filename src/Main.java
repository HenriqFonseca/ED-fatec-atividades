public class Main {


    //Questão 11
    static void retirarBase(){
        Pilha pilha = new Pilha();
        Pilha pilha2 = new Pilha();
        pilha.empilhar("F");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("E");
        pilha.empilhar("A");
        while(!pilha.estaVazia()){
            pilha2.empilhar(pilha.desempilhar());
            System.out.println("Topo pilha2: "+pilha2.topo());
        }
        pilha2.desempilhar();
        while(!pilha2.estaVazia()){
            pilha.empilhar(pilha2.desempilhar());
            System.out.println("Topo pilha: "+pilha.topo());
        }
    }

    private static boolean Misterio(String x){
        Pilha p = new Pilha();
        for (int i = 0; i < x.length(); i++) {
            p.empilhar(x.charAt(i));
        }
        String y = "";
        while (!p.estaVazia()){
            y += p.desempilhar();
        }

        return x.equals(y);
    }

    static int n = 5;
    static int i = 0;
    static int limite=5;
    public static void escadinha(){
        while (i < limite) {
            n = 0;
            while (n <= i) {
                System.out.print("*");
                n++;
            }
            System.out.println(" ");
            i++;
        }

        //        for (i=0; i<5; i++){
//            n = 0;
//
//            while(n<=i){
//                System.out.print("*");
//                n++;
//            }
//            System.out.println(" ");
//        }
    }

    public static int misterioTotal(int n){
        if(n==0){
            return 1;
        }else{
            return n*misterioTotal(n-1);
        }


    }

    public static void main(String[] args) {

//        escadinha();
//
//        int resultado = misterioTotal(5);
//        System.out.println(resultado+"");


//        String nomeCompleto = "Ricardo Molinari dos Prazertes";
//        String[] misterio = nomeCompleto.split(" ");
//        System.out.println(misterio[1].substring(0,6));

        Pilha pilha = new Pilha();
        Pilha pilha2 = new Pilha();
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
//        while (pilha.desempilhar()!=null){
//            System.out.println("topo: " +pilha.topo());
//            System.out.println(pilha.desempilhar());
//        }

        retirarBase();


    }
}