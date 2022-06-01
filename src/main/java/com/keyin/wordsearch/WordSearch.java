package com.keyin.wordsearch;
import java.util.Arrays;
public class WordSearch {
    public boolean find(String str1, String str2) {
        if (str1.contains(str2)) {return true;}
        else {return false;}
    }
    public boolean compareArray(char[] arr1, char[] arr2) {
        if( Arrays.equals(arr1, arr2)){return true;}
        else{return false;}
    }
  public boolean searchSentence(String str1, String keyword ){
      Boolean found = Arrays.asList(str1.split(" ")).contains(keyword);
      if(found){return true;}
      else{ return false;}

    }
}
