package com.example.company;

//InfosysL1
//the substring that lies between the first block of repeating characters 
//and the last block of repeating characters.
public class RepeatExtractor {
	public static void main(String[] args) {
		 String str = "qweertyuiioo"; // ertyui
		System.out.println(findSubstringBetweenRepeatingBlock(str));
        findSubstringApproch2(str);
        
		str = "arrjun";
        System.out.println(findSubstringBetweenRepeatingBlock(str));
        findSubstringApproch2(str);
	}
	
	private static String findSubstringBetweenRepeatingBlock(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);  //u
        boolean repetetion = false;
        for(int i = 1; i<str.length(); i++){ //8
            char ch = str.charAt(i); //i
            if(ch == prev || repetetion == true){
//                System.out.print(str.charAt(i)); //ertyu
            	sb.append(str.charAt(i));
                if(i+1 < str.length() && ch == str.charAt(i+1)){
                    repetetion = false;
                    break;
                }else{
                    repetetion = true;
                }
            } else{
                repetetion = false;
            }
            prev = str.charAt(i);
        }
		return sb.toString();
	}
	
	private static void findSubstringApproch2(String str) {
		int firstRepeatEnd = -1;
        int lastRepeatStart = -1;

        // 1. Find the end index of the first repeating pair
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                firstRepeatEnd = i + 1; // Position of the second 'e'
                break;
            }
        }

        // 2. Find the start index of the last repeating pair
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                lastRepeatStart = i - 1; // Position of the first 'o'
                break;
            }
        }

        // 3. Extract and print if both pairs were found
        if (firstRepeatEnd != -1 && lastRepeatStart != -1 && firstRepeatEnd < lastRepeatStart) {
            String result = str.substring(firstRepeatEnd + 1, lastRepeatStart);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Could not find two distinct repeating pairs.");
        }
	}
	
}