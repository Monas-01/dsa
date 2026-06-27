// Brute
public int lastStoneWeight(int[] stones) {
    List<Integer> list = new ArrayList<>();
    for (int s : stones) list.add(s);

    while (list.size() > 1) {
        Collections.sort(list);

        int x = list.get(list.size() - 2);
        int y = list.get(list.size() - 1);

        list.remove(list.size() - 1);
        list.remove(list.size() - 1);

        if (x != y) list.add(y - x);
    }

    return list.isEmpty() ? 0 : list.get(0);
}

void main() {

}
