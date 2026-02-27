package com.example.company;

//InfosysL1
//the substring that lies between the first block of repeating characters 
//and the last block of repeating characters.
public class RepeatExtractor {
	public static void main(String[] args) {
		// String str = "qweertyuiioo"; // ertyui
		String str = "arrjun";
        
        char prev = str.charAt(0);  //u
        boolean repetetion = false;
        for(int i = 1; i<str.length(); i++){ //8
            char ch = str.charAt(i); //i
            if(ch == prev || repetetion == true){
                System.out.print(str.charAt(i)); //ertyu
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
	}
	
}