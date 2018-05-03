import java.util.HashMap;
import java.util.Map;

public class SentenceAnalysis 
{
	protected Map<String, Integer> countWords(String sentence)
	{
		Map<String, Integer> WORDMAP = new HashMap<String, Integer>(); // Map to store the words with their occurrence number
	
		sentence = sentence.replaceAll("[\\p{Punct}&&[^0-9]]", "").toLowerCase(); // stripping not letter and numbers
		
		String[] arraySentence = sentence.split(" "); // split by white space and store in array

		for (String word : arraySentence) 
		{
			int count = this.countOccurrence(arraySentence, word);
			
			if(!WORDMAP.containsKey(word)) //  if a word has not been counted, add it to the map
				WORDMAP.put(word, count);		
		}
		
		return WORDMAP;
	}
	
	/*
	 * Method to count the numbers of times a word appears in a String
	 * @param String[] - array of words
	 * @param string - the word we are looking for
	 * @return integer - number of time a specific word occur in the string
	 */
	private int countOccurrence(String[] sentence, String word)
	{
		int nrWord = 0;
		
		for (String st : sentence) 
			if(st.equals(word))
				nrWord++;
			
		return nrWord;
	}
	
}
