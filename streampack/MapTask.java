package streampack;

import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
	/*
	Transform the given input List<String> into List<String>.
	For example:
		List("1", "2", "3")
		should be transformed into
		List(1, 2, 3)

	Also, consider the possibility that the given
	List<String> may have non digital values.
	In such a scenario, your transformation SHOULD NOT fail.
	For example:
		List("1", "abc", "2", "3")
		should be transformed into
		List(1, 2, 3). 
	Save implementation into MapTask.mapping.
	*/
	public static List<Integer> mapping(List<String> source) {
		return source.stream()
		.filter(x -> x.matches("[0-9]+"))
		.map(x -> Integer.parseInt(x))
		.collect(Collectors.toList());
	} 
}
