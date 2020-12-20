package streampack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class GroupWordsTask {
	/*
	You are given with a sequence of words.

	Group all the words by their first letter
	Count how many times the group-key letter appears in the grouped words
	Summarize the counts and combine them with character that represents a group
	For instance:
	List("ABCA", "BCD", "ABC") -> original input of 3 words

	List("A" -> List("ABCA", "ABC"), "B" -> List("BCD")) -> - Letter "A" is represented by two words "ABCA" and "ABC"; Letter "B" is represented by a single word "BCD"

	Map("A"-> 3, "B" -> 1)) - Letter A appears 2 times in the word "ABCA" and once at "ABC", hence the total number of "A" appears in the group is 3 time; For 'B' we have only a single word in the sequence which has only a single letter 'B'

	Save implementation into GroupWordsTask.groupIt.
	*/
	public static Map<Character, Integer> groupIt(List<String> source) {
		return source.stream()
		.collect(Collectors.groupingBy(x -> x.charAt(0)))
		.entrySet()
		.stream()
		.collect(Collectors.toMap(x -> x.getKey(), x -> {
			int i = 0;
			String s = String.join("", x.getValue());
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == x.getKey()) {
					i++;
				}
			}
			return i;
		}));
	}
}
