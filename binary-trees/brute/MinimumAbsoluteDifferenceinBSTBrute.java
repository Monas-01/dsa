// Brute
public int getMinimumDifference(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    inorder(root, list);

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < list.size(); i++) {
        for (int j = i + 1; j < list.size(); j++) {
            min = Math.min(min, Math.abs(list.get(i) - list.get(j)));
        }
    }

    return min;
}

private void inorder(TreeNode node, List<Integer> list) {
    if (node == null) return;
    inorder(node.left, list);
    list.add(node.val);
    inorder(node.right, list);
}

void main() {

}