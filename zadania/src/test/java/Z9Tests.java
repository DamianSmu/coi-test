import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadania.Z9;

public class Z9Tests {
    @Test
    public void shouldReturnFalseWhenStringsAreNull(){
        Assertions.assertFalse(Z9.isAnagram(null, null));
    }

    @Test
    public void shouldReturnFalseWhenStringsAreDifferentLength(){
        Assertions.assertFalse(Z9.isAnagram("aaa", "aa"));
    }

    @Test
    public void shouldReturnFalseWhenLettersAreDifferentCase(){
        Assertions.assertFalse(Z9.isAnagram("AA", "aa"));
    }

    @Test
    public void shouldReturnTrueWhenStringsAreTheSame(){
        Assertions.assertTrue(Z9.isAnagram("ABCDE", "ABCDE"));
    }

    @Test
    public void shouldReturnTrueForEmptyStrings(){
        Assertions.assertTrue(Z9.isAnagram("", ""));
    }

    @Test
    public void shouldReturnTrueWhenStringsConsistsOfTheSameLetters(){
        Assertions.assertTrue(Z9.isAnagram("ABCDE", "EDCBA"));
    }

}
