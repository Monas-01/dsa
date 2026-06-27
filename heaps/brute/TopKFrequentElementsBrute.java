// Brute
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

    List<Integer> keys = new ArrayList<>(freq.keySet());
    keys.sort((a, b) -> freq.get(b) - freq.get(a));

    int[] result = new int[k];
    for (int i = 0; i < k; i++) result[i] = keys.get(i);

    return result;
}

void main() {

}


