import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int counter = 0;
		int counter2 = 0;
		boolean same = false;
		int [] numbers;
		String [] values;
		boolean swap = false;
		int temp = 0;
		for (int i = 0; i < votes.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(votes.get(i).equals(votes.get(j))) {
					counter = counter;
					same = true;
				}
				if(j == i-1 && same == true) {
					same = false;
				}
				else if (j == i-1 && same == false) {
					counter ++;
				}
			}
		}
		values = new String [counter];
		numbers = new int [counter];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		for (int i = 0; i < votes.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(votes.get(i).equals(votes.get(j))) {
					counter2 = counter2;
					same = true;
				}
				if(j == i-1 && same == true) {
					same = false;
				}
				else if (j == i-1 && same == false) {
					values[counter2] = votes.get(i);
					counter2 ++;
				}
			}
		}
		for (int i = 0; i < votes.size(); i++) {
			for (int j = 0; j < values.length; j++) {
				if(votes.get(i).equals(values[j])) {
					numbers[i] ++;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > numbers [i+1]) {
				temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				swap = true;
			}
			if(i == numbers.length -1 && swap == true) {
				swap = false;
				i = 0;
			}
		}
		if(numbers[numbers.length -1] == numbers[numbers.length -2]) {
			return "TIE";
		}
		return temp;
	}

}
