package main.practice.interview;

import java.util.LinkedList;

public class HashMapInternal<K, V> {
	@SuppressWarnings("hiding")
	private class Entry<K, V> {
		K key;
		V value;

		Entry(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private int size;
	private LinkedList<Entry<K, V>>[] buckets;

	@SuppressWarnings("unchecked")
	public HashMapInternal(int size) {
		this.size = size;
		buckets = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	private int hash(K key) {
		return Math.abs(key.hashCode()) % size;
	}

	public void put(K key, V value) {
		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = buckets[index];
		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				entry.value = value; // Update existing key
				return;
			}
		}
		bucket.add(new Entry<>(key, value)); // Insert new key-value pair
	}

	public V get(K key) {
		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = buckets[index];
		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				return entry.value;
			}
		}
		return null; // Key not found
	}

	public boolean remove(K key) {
		int index = hash(key);
		LinkedList<Entry<K, V>> bucket = buckets[index];
		for (Entry<K, V> entry : bucket) {
			if (entry.key.equals(key)) {
				bucket.remove(entry);
				return true; // Key found and removed
			}
		}
		return false; // Key not found
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (LinkedList<Entry<K, V>> bucket : buckets) {
			for (Entry<K, V> entry : bucket) {
				sb.append(entry.key).append("=").append(entry.value).append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		HashMapInternal<String, Integer> hashmap = new HashMapInternal<>(10);
		hashmap.put("apple", 1);
		hashmap.put("banana", 2);
		hashmap.put("orange", 3);

		System.out.println(hashmap.get("apple")); // Output: 1
		System.out.println(hashmap.get("banana")); // Output: 2
		System.out.println(hashmap.get("grape")); // Output: null

		hashmap.remove("banana");
		System.out.println(hashmap.get("banana")); // Output: null

		System.out.println(hashmap); // Output: apple=1 orange=3
	}
}
