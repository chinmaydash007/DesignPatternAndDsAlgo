package DsAlgoArchievedPrograms.LinkedList;

public class LinkedList {
    public Node start;
    int size;

    public LinkedList() {
        this.start = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (start == null) {
            return true;
        }
        return false;
    }

    public void insertAtFirst(int val) {
        Node node = new Node();
        node.setData(val);
        node.setNext(start);
        start = node;
        size++;
    }

    public void insertAtLast(int val) {
        if (start == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node();
        node.setData(val);

        Node t = start;
        while (t.getNext() != null) {
            t = t.getNext();
        }
        t.setNext(node);
        size++;

    }

    public void insertAtPosition(int val, int position) {
        if (start == null) {
            System.out.println("The linkedList is empty");
            return;
        }
        if (position > size) {
            System.out.println("Out of range");
            return;
        }
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (position == size) {
            insertAtLast(val);
        }
        Node node = new Node();
        node.setData(val);

        Node t = start;
        for (int i = 1; i < position - 1; i++) {
            t = t.getNext();
        }

        node.setNext(t.getNext());
        t.setNext(node);
        size++;
    }

    public void getElements() {
        Node t = start;
        for (int i = 1; i <= size; i++) {
            System.out.print(t.getData() + " ");
            t = t.getNext();
        }
        System.out.println();
    }

    public void deleteNodeAtPosition(int position) {
        if (position == 1) {
            deleteAtFirst();
        } else if (position == size) {
            deleteAtLast();
        } else if (position > size) {
            System.out.println("Invalid Position");
        } else {
            Node t = start;
            Node t1;
            for (int i = 1; i < position - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }

    }

    public void deleteAtFirst() {
        if (start == null) {
            System.out.println("The list is empty");
            return;
        }
        start = start.getNext();
        size--;
    }

    public void deleteAtLast() {
        Node t = start;
        for (int i = 1; i <= size - 1; i++) {
            t = t.getNext();

        }
        t.setNext(null);
        size--;
    }

    public int searchNode(int val) {
        Node node = start;
        for (int i = 1; i <= size; i++) {
            if (node.getData() == val) {
                return i;
            }
        }
        return -1;
    }

    public void rotateClockwise(int value) {
        value = value % size;
        Node t1 = start;
        for (int i = 1; i <= value; i++) {
            t1 = t1.getNext();

        }
        Node t2 = t1;
        for (int i = value + 1; i < size; i++) {
            t2 = t2.getNext();
        }
        t2.setNext(start);
        start = t1;
        t1 = null;

    }

    public void rotateAntiClockwise(int value) {
        value = value % size;
        Node t1 = start;
        Node t3 = null;
        for (int i = 1; i < value; i++) {
            t1 = t1.getNext();
        }
        t3 = t1.getNext();
        Node t2 = t1;
        t1 = null;
        for (int i = value; i < size; i++) {
            t2 = t2.getNext();
        }
        t2.setNext(start);
        start = t3;
    }

    public void reverseLinklist() {
        Node current = start;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        start = prev;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.getNext() == null) {
            int value = head.getData();
            return head;
        }

        /* reverse the rest list and put
        the first element at the end */
        Node temp = reverseRecursive(head.getNext());
        System.out.println(temp.getData());
        head.getNext().setNext(head);

        /* tricky step -- see the diagram */
        head.setNext(null);

        /* fix the head pointer */
        return temp;
    }


}
