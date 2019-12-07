private static void levelOrder(Node root) {
    if (root == null) {
        return;
    }

    // ArrayDeque is faster than LinkedList when used as a queue.
    ArrayDeque<Node> deque = new ArrayDeque<>();
    deque.add(root);

    while (!deque.isEmpty()) {
        Node node = deque.removeFirst();
        System.out.print(node.data + " ");
        if (node.left != null) {
            deque.addLast(node.left);
        }
        if (node.right != null) {
            deque.addLast(node.right);
        }
    }
}
