import streampack.*;
import java.util.List;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//FizzBuzz test
		List<Integer> sourceFizzBuzz = Arrays.asList(1, 2, 3, 4, 5, 10, 12, 15);
		System.out.println("testing FizzBuzz-ing. Input/Output");
		System.out.println(sourceFizzBuzz);
		System.out.println(FizzBuzzTask.fizzBuzzIt(sourceFizzBuzz));

		//Flatting test
		List<String> sourceFlatIt = Arrays.asList("aBc", "d", "e", "fghijkLM");
		System.out.println("\ntesting flattening. Input/Output");
		System.out.println(sourceFlatIt);
		System.out.println(FlattingTask.flattingString(sourceFlatIt));

		//Map test
		List<String> sourceMapTask = Arrays.asList("a1B", "123v", "12", "6", "1o78", "1234");
		System.out.println("\ntesting Mapping. Input/Output");
		System.out.println(sourceMapTask);
		System.out.println(MapTask.mapping(sourceMapTask));

		//GroupWords task
		List<String> sourceGroupTask = Arrays.asList("AB", "ABC", "ABCD", "DAF", "B", "BBBBB");
		System.out.println("\ntesting Grouping. Input/Output");
		System.out.println(sourceGroupTask);
		System.out.println(GroupWordsTask.groupIt(sourceGroupTask));
	}
}
