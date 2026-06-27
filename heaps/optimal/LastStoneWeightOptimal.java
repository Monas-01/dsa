// Optimal
public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    for (int s : stones) maxHeap.add(s);

    while (maxHeap.size() > 1) {
        int y = maxHeap.poll();
        int x = maxHeap.poll();

        if (x != y) maxHeap.add(y - x);
    }

    return maxHeap.isEmpty() ? 0 : maxHeap.poll();
}

void main() {

}
