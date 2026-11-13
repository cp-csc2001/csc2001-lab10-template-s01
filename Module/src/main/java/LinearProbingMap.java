/**
 * A hash map from String keys to int values, using open addressing with
 * linear probing (step 1) and a prime table size. The table grows to the
 * next prime >= 2m whenever the load factor goes above 0.5.
 *
 * Do not rename the class, the public methods, or change their
 * parameters/return types. You may add private helper methods.
 * Do not use HashMap, HashSet, Hashtable or any other library map or set
 * in this file. Use Hashing.hornerHash and Hashing.index to find a key's
 * home slot.
 */
public class LinearProbingMap {

    public static final int DEFAULT_CAPACITY = 11;

    private String[] keys;     // keys[i] == null means slot i is empty
    private int[] values;      // values[i] goes with keys[i]
    private int size;          // number of keys stored

    /**
     * Creates an empty map with DEFAULT_CAPACITY (11) slots.
     */
    public LinearProbingMap() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty map with nextPrime(capacity) slots.
     * throws IllegalArgumentException if capacity < 1
     */
    public LinearProbingMap(int capacity) {
        // TODO: check capacity, then create both arrays with nextPrime(capacity) slots
    }

    /**
     * Stores value under key. If key is already in the map, replaces its
     * value (size does not change). Otherwise puts key in the first empty
     * slot found by linear probing from its home slot, wrapping around from
     * the last slot to slot 0. After adding a new key, if size / capacity
     * is greater than 0.5, resizes the table to nextPrime(2 * capacity)
     * slots, reinserting the keys from the old slots in order 0, 1, 2, ...
     * throws IllegalArgumentException if key is null
     */
    public void put(String key, int value) {
        // TODO: check key, find its slot, replace or add, then resize if needed
    }

    /**
     * Returns the value stored under key, or null if key is not in the map.
     * throws IllegalArgumentException if key is null
     */
    public Integer get(String key) {
        // TODO
        return null;
    }

    /**
     * Returns true if key is in the map.
     * throws IllegalArgumentException if key is null
     */
    public boolean containsKey(String key) {
        // TODO
        return false;
    }

    /**
     * Returns the number of keys in the map.
     */
    public int size() {
        // TODO
        return 0;
    }

    /**
     * Returns the number of slots in the table (m).
     */
    public int capacity() {
        // TODO
        return 0;
    }

    /**
     * Returns a copy of the key array: element i is the key in slot i, or
     * null if slot i is empty. Changing the copy does not change the map.
     */
    public String[] keySlots() {
        // TODO: return a copy, not the array itself
        return null;
    }

    /**
     * Returns the smallest prime number that is >= n
     * (2 for any n <= 2).
     */
    public static int nextPrime(int n) {
        // TODO
        return 0;
    }

    // ---- private helpers ----
    // Suggested (not required): a private method that probes from a key's
    // home slot and returns the index of that key or of the first empty
    // slot, a private resize() method, and a private isPrime(int n).
}

