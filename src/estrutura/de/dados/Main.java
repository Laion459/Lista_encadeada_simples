package estrutura.de.dados;

public class Main {

    public static void main(String[] args) {
        List list = new List();
        list.criateList();
        list.addElement(22);
        list.addElement("Hola Bemvindo!");
        list.addElement(22.44f);
        list.addElement(1000);
        list.addElement("Winner!!");

        System.out.println("Verifica se lista 1 está vazia: " + list.isEmpty());
        list.isEmpty();
        List list1 = new List();
        System.out.println("Verifica se lista 2 está vazia: " + list1.isEmpty());
        System.out.println("-----------");

        System.out.println("Recuperar o número de elementos da lista: " + list.getCounter());
        System.out.println("Recuperar o número de elementos da lista: " + list.recuperaNumeroDeElementosDaLista());
        System.out.println("-----------");

        System.out.println("Verificar se um elemento existe na lista teste 1: " + list.search(22));
        System.out.println("Verificar se um elemento existe na lista teste 2: " + list.search(500));
        System.out.println("-----------");

        System.out.println("Adiciona elemento na lista: ");
        list1.addElement("1° ELEMENTO");
        list1.showList();
        System.out.println("-------------------");
        list1.addElement("2° ELEMENTO INSERIDO");
        list1.showList();
        System.out.println("-----------");

        System.out.println("Retira um elemnto da lista: ");
        list.showList();
        list.removeElementList(1000);
        System.out.println("-----------");
        list.showList();

        System.out.println("-----------");
        System.out.println("Imprime Lista: ");
        list.showList();

    }
}
