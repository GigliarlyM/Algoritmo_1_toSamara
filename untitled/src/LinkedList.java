public class LinkedList {
    Node<Aluno> head;
    Node<Aluno> tail;

    public LinkedList(Node<Aluno> value) {
        this.head = value;
        this.tail = value;
    }

    public void remove(Aluno aluno) {
        Node<Aluno> aux = this.head;

        do {
            if (aux.next.value.getNome().equals(aluno.getNome())) {
                aux.next = aux.next.next;
                break;
            }
            aux = aux.next;
        } while (aux != null);
    }
}

class Node<i> {
    public i value;
    public Node<i> next;

    public Node(i value) {
        this.value = value;
    }
}
