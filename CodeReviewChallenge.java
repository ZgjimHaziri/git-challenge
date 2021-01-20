import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//Meaningless class name.
public class Class1 {
    public final String SPECIAL_CHARACTER = "a";//never used

	//Meaningless method name. Based on its function it should be something like findShortestWordsWithA
    public List<String> method(String paragraph) {
        List<String> shortestWords = new ArrayList<>();//Can be replaced with an array of the same length as 'sentences'.
        String[] sentences =   paragraph.split(".");//Remove extra space after '='.

		//Add some space between ';' and the next character and also in both sides of '='.
        for (int i=0;i<sentences.length;i++) {
            String[] words = sentences[i].split(" ");
            String shortestWord = words[0];//Should check if the array 'words' is not empty. And also the first word might not contain an 'a'.
			
			/*
			String shortestWord = "";
			int shortestWordLength = Integer.MAX_VALUE;
			
			for (int j = 0; j < words.length; j++) {
                if (words[j].length() < shortestWordLength) {
                    if (words[j].contains("a")) {
                        shortestWord = words[j];
						shortestWordLength = words[j].length();
                    }
                }
            }
			*/
			
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() < shortestWord.length()) {
                    if (words[j].contains("a")) {//Use SPECIAL_CHARACTER constant instead of "a", to make the code more ready for changes.
                        shortestWord = words[j];
                    }
                }
            }

            shortestWords.add(shortestWord);
        }


		//Unnecessary space 
        return shortestWords;
    }

    public String findShortestWordWithA(String paragraph) {
        List<String> shortestWordsWithA = method(paragraph);
        String shortestWord = shortestWordsWithA.get(0);//Should check if index is out of bounds
 
		//Unnecessary iteration i=0. Also not consistent with the brace pattern
        for (int i = 0; i < shortestWordsWithA.size(); i++)
        {
            if (shortestWordsWithA.get(i).length() < shortestWord.length()){
                shortestWord = shortestWordsWithA.get(i);
            }
        }

        return shortestWord;
    }

    public String findFirstShortWordStartingWithA(String paragraph) {
        List<String> shortestWordsWithA = method(paragraph);
        String firstShortWordStartingWithA = "";//Simplify the name to firstShortWord

        for(int i = 0; i < shortestWordsWithA.size(); i++) {
            if (shortestWordsWithA.get(i).startsWith("a")) {//Use SPECIAL_CHARACTER constant instead of "a", to make the code more ready for changes.
                firstShortWordStartingWithA = shortestWordsWithA.get(i);
				//To find the first short word, it should include a break statement here.
            }
        }

        return firstShortWordStartingWithA;
    }
}
