package coreJava;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hashmapwordcount {
	


 public static void main(String args[]) {

  Map < String, Integer > map = new HashMap <String, Integer > (); 
  Scanner sc = new Scanner(System.in); // used to read user input
  System.out.println("Enter a string:");
  String sentence = sc.nextLine();

  String[] tokens = sentence.split(" "); // split based on space

  for (String token: tokens) {

   String word = token.toLowerCase();
   if (map.containsKey(word)) {
    int count = map.get(word); // get word count 
    map.put(word, count + 1); // override word count
   } else {
    map.put(word, 1); // initial word count to 1
   }
  }

  //display the data
  Set < String > keys = map.keySet(); // list of unique words because it's a Set

  LinkedHashSet<String> sortedKeys = new LinkedHashSet <String > (keys); // ascending order of words

  for (String str: sortedKeys) {

   System.out.println("Word ="+"'"+str +"'"+" and it's count = " + map.get(str));

  }
 }
}


