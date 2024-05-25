package proc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class OccurenceOfALetterInAString {
	public static void main(String[] args) {
		String stringParam = "aaabbbcccccccaaaabbbbbcccccddaccdcccccccccccccccccc";
		checkOccurenceOfAWordInAString(stringParam, 'c');
	}

	private static void checkOccurenceOfAWordInAString(String stringParam, char c) {
		int counter = 0;
		String maximumConsecutiveStringParam = "";
		List<String> stringValuesLi = new ArrayList<String>();
		List<Integer> counterList = new ArrayList<Integer>();
		for (char character : stringParam.toCharArray()) {
			if (c == character) {
				counter++;
				maximumConsecutiveStringParam += String.valueOf(character);
			} else if (c != character){
				if (null != maximumConsecutiveStringParam && !StringUtils.isEmpty(maximumConsecutiveStringParam)) {
					stringValuesLi.add(maximumConsecutiveStringParam);
					counterList.add(counter);
					maximumConsecutiveStringParam = "";
					counter = 0;					
				}
			}
		}
		if (null != maximumConsecutiveStringParam && !StringUtils.isEmpty(maximumConsecutiveStringParam)) {
			stringValuesLi.add(maximumConsecutiveStringParam);
			counterList.add(counter);
			maximumConsecutiveStringParam = "";
			counter = 0;					
		}
		System.out.println(counterList);
		System.out.println(stringValuesLi.get(counterList.indexOf(Collections.max(counterList))));
	}

}