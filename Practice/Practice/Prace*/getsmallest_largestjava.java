class getsallestandlargest
{
	public static String getSmallestAndLargest(String s, int k) {
	    String smallest = "";
	    String largest = "";

	    // Initialize smallest and largest to the first substring of length k
	    smallest = s.substring(0, k);
	    largest = s.substring(0, k);

	    // Iterate through the string to find the smallest and largest substrings
	    for (int i = 1; i <= s.length() - k; i++) {
	        String sub = s.substring(i, i + k);
	        if (sub.compareTo(smallest) < 0) {
	            smallest = sub;
	        }
	        if (sub.compareTo(largest) > 0) {
	            largest = sub;
	        }
	    }

	    // Return the smallest and largest substrings separated by a newline
	    return smallest + "\n" + largest;
	}

}