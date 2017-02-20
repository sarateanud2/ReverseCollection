import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<>();
		numberList.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,5,7,5,8,9,10}));
		
		//numberList.sort(Collections.reverseOrder());
		Collections.reverse(numberList);
		Stream<Integer> stream = numberList.stream();
		stream.forEach(s->System.out.println(s));

	}

}
