import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Hashing.
 *
 * These starter tests (with these exact names) should all pass by the
 * time you're done. They are NOT enough on their own - add your own
 * tests (see the TODO list at the bottom and the lab handout).
 */
public class HashingTest {

    // ---- starter tests ----

    @Test
    void hornerHashCat() {
        // ((99 * 31) + 97) * 31 + 116 = 98262, as in lecture
        assertEquals(98262, Hashing.hornerHash("cat"));
    }

    @Test
    void indexOfCat() {
        assertEquals(10, Hashing.index(98262, 11));
    }

    @Test
    void indexOfNegativeHash() {
        // -7 % 11 is -7 in Java, but the index must be 4
        assertEquals(4, Hashing.index(-7, 11));
    }

    // TODO: add your own tests. At a minimum, cover:
    //   - hornerHash of "" (0) and of one and two characters
    //   - hornerHash matches String.hashCode() for many strings, including
    //     ones that overflow to a negative hash (e.g. "banana")
    //   - hornerHash(null) throws IllegalArgumentException
    //   - index with negative hashes, Integer.MIN_VALUE, and m = 1
    //   - index always returns a value from 0 to m - 1 (try many random hashes)
    //   - index with m < 1 throws IllegalArgumentException
}
