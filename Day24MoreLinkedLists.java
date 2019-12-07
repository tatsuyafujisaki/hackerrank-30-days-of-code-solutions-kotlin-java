// Constraint: Data are always in non-decreasing order.
private static Node removeDuplicates(final Node head) {
    if (head == null) {
        return null;
    }
    Node node = head;
    while (node.next != null) {
        if (node.data == node.next.data) {
            node.next = node.next.next;
        } else {
            node = node.next;
        }
    }
    return head;
}
