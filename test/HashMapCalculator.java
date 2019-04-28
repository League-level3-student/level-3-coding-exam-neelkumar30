import java.util.HashMap;

public class HashMapCalculator {
	public Object commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {
		int similar = 0;
		String [] keys1 = new String [5];
		String [] keys2 = new String [5];
		for (int i = 0; i < keys1.length; i++) {
			keys1[i] = "";
		}
		for (int i = 0; i < keys2.length; i++) {
			keys2[i] = "";
		}
		keys1[0] = "Alice";
		keys1[1] = "Mary";
		keys1[2] = "Bob";
		keys1[3] = "Chuck";
		keys1[4] = "Felix";
		
		keys2[0] = "Mary";
		keys2[1] = "Felix";
		keys2[2] = "Ricardo";
		keys2[3] = "Tam";
		keys2[4] = "Bob";
		for (int i = 0; i < one.size(); i++) {
			for (int j = 0; j < two.size(); j++) {
				if(one.get(keys1[i]).equals(two.get(keys2[j])) && keys1[i].equals(keys2[j])) {
					similar++;
				}
			}
		}
		return similar;
	}
}
