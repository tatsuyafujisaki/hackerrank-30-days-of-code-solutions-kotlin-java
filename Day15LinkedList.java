public static Node insert(Node head, int data) {
    Node newNode = new Node(data);

    if (head == null) {
        return newNode;
    }

    Node current = head;

    while (current.next != null) {
        current = current.next;
    }

    current.next = newNode;

    return head;
}
