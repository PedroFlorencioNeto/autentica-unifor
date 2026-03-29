public class List {
    Node head;

    public List(){
        head = null;
    }

    public void add(String word){
        Node newNode = new Node(word);

        if (head == null){
            head = newNode;
        }
        else{
            Node atual = head;
            while(atual.next != null){
                atual = atual.next;
            }
            atual.next = newNode;
        }
    }

    public void print(){
        Node atual = head;
        while (atual != null){
            System.out.println(atual.word);
            atual = atual.next;
        }
    }
}
