package numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheSingleton {

	/*
	 * Find the Single student who hasn't got pair eg- {2, 4, 2 ,4 ,6} output would be 6
	 */

	public static void main(String[] args) {

		int[] input = {2,4,2,6,6};
		System.out.println(String.format("Single student is %d", run(input)));
	}

	public static Integer run(int[] student_list) {

		Integer single_student_number = 0;
		Map<Integer, String> studentTeamMap = new HashMap<>();
		Arrays.sort(student_list);
		int	lengthStudents = student_list.length;

		for(int i = 0; i < lengthStudents-1; i++){
			if (student_list[i] == student_list[i+1]){
				studentTeamMap.put(student_list[i],"Paired");
			}else{
				studentTeamMap.put(student_list[i+1],"Not Paired");
			}

		}

		for(Map.Entry pairStudent : studentTeamMap.entrySet()){
			if(pairStudent.getValue().equals("Not Paired")){
				single_student_number = (Integer) pairStudent.getKey();
			}

		}
		return single_student_number;
	}

}
