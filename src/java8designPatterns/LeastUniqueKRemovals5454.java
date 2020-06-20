package java8designPatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeastUniqueKRemovals5454 {

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		if (arr == null || arr.length == 0)
			return 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		map.forEach((m,n)->{
			System.out.println("m:" + m + ",n:" + n);
		});
		System.out.println("Done");
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
		for (int i : map.keySet()) {
			pq.add(i);
		}

		pq.forEach(a->System.out.print(a + ","));
		while (k > 0 && !pq.isEmpty())
			k -= map.get(pq.poll());

		return k < 0 ? pq.size() + 1 : pq.size();
	}

	public static void main(String[] args) {
		int a[] = { 4, 3, 1, 1, 3, 3, 2 };
		System.out.println(findLeastNumOfUniqueInts(a, 3));

	}

}
