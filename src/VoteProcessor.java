import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int[] numbers = new int[6];
		int pf = 0;
		int PF = 0;
		int eS = 0;
		int ES = 0;
		int EDWARDSNOWDEN = 0;
		int Es = 0;
		boolean swap = false;
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equals("pope francis")) {
				pf++;
			} else if (votes.get(i).equals("Pope Francis")) {
				PF++;
			} else if (votes.get(i).equals("edward Snowden")) {
				eS++;
			} else if (votes.get(i).equals("Edward Snowden")) {
				ES++;
			} else if (votes.get(i).equals("EDWARD SNOWDEN")) {
				EDWARDSNOWDEN++;
			} else if (votes.get(i).equals("Edward snowden")) {
				Es++;
			}

		}
		numbers[0] = pf;
		numbers[1] = PF;
		numbers[2] = eS;
		numbers[3] = ES;
		numbers[4] = EDWARDSNOWDEN;
		numbers[5] = Es;
		for (int i = 0; i < numbers.length; i++) {
			if (i < numbers.length - 1 && numbers[i] > numbers[i + 1]) {
				temp = numbers[i];
				numbers[i] = numbers[i + 1];
				numbers[i + 1] = temp;
				swap = true;
			}
			if (i == numbers.length - 1 && swap == true) {
				i = 0;
				swap = false;
			}
		}

		if (numbers[5] == numbers[4]) {
			return "TIE";
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == pf) {
				return "pope francis";
			}
			if (numbers[i] == PF) {
				return "Pope Francis";
			}
			if (numbers[i] == eS) {
				return "edward Snowden";
			}
			if (numbers[i] == ES) {
				return "Edward Snowden";
			}
			if (numbers[i] == EDWARDSNOWDEN) {
				return "EDWARD SNOWDEN";
			}
			if (numbers[i] == Es) {
				return "Edward Snowden";
			}
		}
		return 0;
	}

	
}
