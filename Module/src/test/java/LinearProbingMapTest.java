import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for LinearProbingMap.
 *
 * The trace tests use the example from the handout. Home slots with 11
 * slots:   cat 10, dog 6, owl 6, cow 7, apple 10, bat 6
 * and with 23 slots:
 *          cat 6, dog 8, owl 22, cow 6, apple 6, bat 11
 *
 * These starter tests (with these exact names) should all pass by the
 * time you're done. They are NOT enough on their own - add your own
 * tests (see the TODO list at the bottom and the lab handout).
 */
public class LinearProbingMapTest {

    /** Returns a map holding the first five keys of the handout example. */
    private static LinearProbingMap fiveKeys() {
        LinearProbingMap map = new LinearProbingMap();
        map.put("cat", 1);
        map.put("dog", 2);
        map.put("owl", 3);
        map.put("cow", 4);
        map.put("apple", 5);
        return map;
    }

    // ---- starter tests ----

    @Test
    void newMapIsEmpty() {
        LinearProbingMap map = new LinearProbingMap();
        assertEquals(0, map.size());
        assertEquals(11, map.capacity());
        assertArrayEquals(new String[11], map.keySlots());
    }

    @Test
    void fiveKeysLayout() {
        // owl and cow probe forward; apple wraps around from slot 10 to slot 0
        LinearProbingMap map = fiveKeys();
        assertArrayEquals(new String[]{"apple", null, null, null, null, null,
                "dog", "owl", "cow", null, "cat"}, map.keySlots());
        assertEquals(5, map.size());
        assertEquals(11, map.capacity());
    }

    @Test
    void getAfterPut() {
        LinearProbingMap map = fiveKeys();
        assertEquals(Integer.valueOf(1), map.get("cat"));
        assertEquals(Integer.valueOf(5), map.get("apple"));
        assertNull(map.get("bat"));
    }

    // TODO: add your own tests. At a minimum, cover:
    //   - the exact layout (keySlots) after each of the first five puts
    //   - get and containsKey for every key, and for missing keys whose
    //     probe sequence passes over other keys (e.g. "emu", home slot 6)
    //   - put on an existing key replaces the value without changing size
    //     or capacity, and never causes a resize
    //   - the 6th key resizes the table to 23 slots: check the exact layout
    //     (see the handout) and that every value survived
    //   - the sequence of resizes from 11 slots (23, 47, 97, ...), and that
    //     size * 2 <= capacity after every put
    //   - the capacity constructor (nextPrime) and capacity < 1 throwing
    //   - null keys throwing IllegalArgumentException in put, get, containsKey
    //   - keys with negative hash codes, and the empty string
    //   - changing the array from keySlots() does not change the map
    //   - nextPrime, including n <= 2 and squares of primes (25, 49, 121)
    //   - many random keys compared with java.util.HashMap
    //   - a large map (200,000 keys)
}
