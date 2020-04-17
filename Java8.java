package najeef.com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Filter{
	public static Predicate<String> prefixedString(String prefix){
		Predicate<String> str1 = str -> str.startsWith(prefix);
		return str1;
	}
}

class Mapper{
	public static Function<String, Long> distinctCharacters(){
		Function<String, Long> count = str -> str.chars().distinct().count();
		return count;
	}
}
public class Java8 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("aanaya");
		strList.add("aanaaya");
		
		strList.stream().filter(Filter.prefixedString("aa"))
			.map(Mapper.distinctCharacters())
			.forEach(System.out::println);
	}

}
