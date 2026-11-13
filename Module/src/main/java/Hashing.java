/**
 * Two small hashing helpers from the Hash Functions lecture.
 *
 * Do not rename the class, the public methods, or change their
 * parameters/return types. You may add private helper methods.
 * Do not call String.hashCode() in this file (you may use it in your tests).
 */
public class Hashing {

    /**
     * Returns the polynomial (Horner's rule) hash of s with base 31:
     *     h = 0;  for each char c in s:  h = 31 * h + c
     * int overflow is expected and allowed. The result must equal
     * s.hashCode(). The empty string hashes to 0.
     * throws IllegalArgumentException if s is null
     */
    public static int hornerHash(String s) {
        // TODO: check for null, then apply Horner's rule with base 31
        return 0;
    }

    /**
     * Returns the table index for a hash value in a table with m slots:
     * a number from 0 to m - 1, even when hash is negative.
     * throws IllegalArgumentException if m < 1
     */
    public static int index(int hash, int m) {
        // TODO: check m, then use Math.floorMod (not %)
        return 0;
    }
}
