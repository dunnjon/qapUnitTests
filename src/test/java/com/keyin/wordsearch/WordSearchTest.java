package com.keyin.wordsearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
    @Test
    public void compareStrings() {
        WordSearch worldSearchUnderTest = new WordSearch();
        String str1 = "hello world";
        String str2 = "hello world";
        String str3 = "bye world";
        boolean result = worldSearchUnderTest.find(str1, str2);
        Assertions.assertEquals(str1, str2);
        Assertions.assertNotEquals(str1, str3);
        Assertions.assertTrue(result);
    }
    @Test
    public void compareArrays() {
        char[] arr1 = { 'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd' };
        char[] arr2 = "helloworld".toCharArray();
        WordSearch worldSearchUnderTest = new WordSearch();
        boolean result = worldSearchUnderTest.compareArray(arr1, arr2);
        Assertions.assertTrue(result);
        Assertions.assertArrayEquals(arr1, arr2);
    }
    @Test
    public void searchSentence(){
    WordSearch worldSearchUnderTest = new WordSearch();
    String str1 = "hello world, goodnight";
    String keyword = "Jon";
    boolean result = worldSearchUnderTest.searchSentence(str1, keyword);
    Assertions.assertFalse(result);
}
}
