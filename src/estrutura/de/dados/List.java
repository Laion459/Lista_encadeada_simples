package estrutura.de.dados;

public class List {
    private Node head;
    private int counter;

    public void criateList(){
        head = null;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    // Métodos Públicos

    // Verifica se está vazia a lista
    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    // Adiciona elemento na lista
    public void addElement(Object element){
        Node newNode = new Node();
        newNode.setElement(element);
        newNode.setNext(head);
        head = newNode;
        counter++;
    }

    // Percorre e imprime a lista
    public void showList(){
        for (Node node = head; node != null; node = node.getNext()){
            System.out.println(node.getElement());
        }
    }

    // Procura um elementos da lista
    public Object search(Object element){
        for (Node node = head; node != null; node = node.getNext()){
            if(node.getElement() == element){
                System.out.println("Elemento SIM existe na lista! ");
                return node.getElement();
            }
        }
        System.out.println("Elemento NÃO existe na lista! ");
        return null; /* nao achou o elemento*/
    }

    // Recupera numero de elementos da lista
    public int recuperaNumeroDeElementosDaLista(){
        return getCounter();
    }

    // remove um elemnto da lista
    public void removeElementList(Object element){
        //objeto para o elemento anterior
        Node anterior = null;
        //objeto para percorrer a lista
        Node p = head;

        //procura elemento na lista, guardando anterior
        while(p != null && p.getElement() != element){
            anterior = p;
            p = p.getNext();
        }

        //verifica se achou elemento
        if(p == null){
            /*nao achou: mantem primeiro da forma como esta*/
            return;
        }

        //retira elemento
        if(anterior == null){
            //retira elemento do inicio
            head = p.getNext();
        }else{
            //retira elemento do meio da lista
            anterior.setNext(p.getNext());
        }
    }

    public void removeElement(Object element){

    }
}
