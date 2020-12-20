package streampack;

import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
	/*
	Solve FizzBuzz problem by transforming the given sequence of integers. 
	Save implementation into FizzBuzzTask.fizzBuzzIt. 
	Start with the number 1
	Every next player adds 1 to previous value
	if number is divisible by 3 - replace with fizz
	if number is divisible by 5 - replace with buzz
	if number is divisible by 15 - fizz buzz
	*/
	public static List<Object> fizzBuzzIt(List<Integer> source) {
		return source.stream()
		.map(x -> ((x % 15 == 0)) ? "fizz buzz" : ((x % 3 == 0) ? "fizz" : ((x % 5 == 0) ? "buzz" : x)))
		.collect(Collectors.toList());
	}
}
