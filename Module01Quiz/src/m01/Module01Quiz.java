package m01;

/**
 * Moudule 01 Quiz -2021 Spring
 * @author CSIS1410 Qi Cao
 *
 */
public class Module01Quiz {

	/**
	 * 
	 * @param word String giving any string 
	 * @return word
	 * 
	 */
	public static String transform(String word) {
		return word;

	}

	/**
	 * @param word String giving any string 
	 * @return  return String format without '_'</br> all letter return lowercase except 'a' and 'z'
	 * </br> add reversed word to the end.
	 */
	public static String methodA(String word) {
		if (word == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if ('_' != word.charAt(i)) {

				sb.append(word.charAt(i));
			}
		}

		String lowercase = sb.toString().toLowerCase();
		String capWord = "";

		for (int j = 0; j < lowercase.length(); j++) {

			if (j == 0) {
				if (lowercase.charAt(j) == 'a' || lowercase.charAt(j) == 'A') {
					capWord = capWord + 'A';
				} else
					capWord = capWord + lowercase.charAt(j);
			}

			else if (j == lowercase.length() - 1) {
				if (lowercase.charAt(lowercase.length() - 1) == 'z'
						|| lowercase.charAt(lowercase.length() - 1) == 'Z') {
					capWord = capWord + 'Z';
				} else
					capWord = capWord + lowercase.charAt(j);
			} else {
				capWord = capWord + lowercase.charAt(j);
			}

		}

		for (int i = capWord.length() - 1; 0 <= i; i--) {
			capWord = capWord + Character.toString(capWord.charAt(i));
		}
		return capWord;
	}

	/**
	 * @param word giving any string
	 * @return it retrun count number of letter from the giving string
	 * </br> except ae, oe, ue, and eu format: {String}..{count}
	 */
	public static String methodB(String word) {
		String lowerCase = word.toLowerCase();
		int countOneLetter = 0;
		int count = 0;

		for (int i = 0; i < lowerCase.length(); i++) {

			if (i != lowerCase.length() - 1) {
				if ((lowerCase.charAt(i) == 'a' && lowerCase.charAt(i + 1) == 'e')
						|| (lowerCase.charAt(i) == 'o' && lowerCase.charAt(i + 1) == 'e')
						|| (lowerCase.charAt(i) == 'u' && lowerCase.charAt(i + 1) == 'e')
						|| (lowerCase.charAt(i) == 'e' && lowerCase.charAt(i + 1) == 'u')) {
					countOneLetter++;
					i++;
				} else
					countOneLetter++;
			}

			else
				count++;
		}

		int total = countOneLetter + count;

		return word + ".." + total;
	}

}
