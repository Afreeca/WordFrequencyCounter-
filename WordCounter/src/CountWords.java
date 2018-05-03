import java.util.Map;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) 
	{
		String sentence;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentece to be analysed:\n>");

		sentence = sc.nextLine();
		
		SentenceAnalysis analyseWOrd = new SentenceAnalysis();
		
		Map<String, Integer> WORDMAP = analyseWOrd.countWords(sentence);

		for (String word : WORDMAP.keySet()) 
		{
			System.out.println(word + " - " + WORDMAP.get(word));
		}
	}

}
