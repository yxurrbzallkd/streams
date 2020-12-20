package streampack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattingTask {
	/*
	You are given with the sequence of words List<String>.
	Transform the given sequence to a sequence of letters of 
	every word in the sequence List<String>. 
	For example:
		List("abc", "def", "ghj")
		should be transformed into
		List("a", "b", "c", "d", "e", "f", "g", "h", "j")
	Save implementation into FlattingTask.flattingStrings. 
	*/
	public static List<String> flattingString(List<String> source) {
		return source.stream()
		.flatMap(x -> Stream.of(x.split("")))
		.collect(Collectors.toList());
	}
}
