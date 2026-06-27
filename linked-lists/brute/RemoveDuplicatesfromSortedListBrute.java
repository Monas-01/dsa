// Brute
public ListNode deleteDuplicates(ListNode head) {
    List<Integer> list = new ArrayList<>();
    ListNode curr = head;

    while (curr != null) {
        if (!list.contains(curr.val)) list.add(curr.val);
        curr = curr.next;
    }

    ListNode dummy = new ListNode(0);
    curr = dummy;
    for (int val : list) {
        curr.next = new ListNode(val);
        curr = curr.next;
    }

    return dummy.next;
}
void main() {

}