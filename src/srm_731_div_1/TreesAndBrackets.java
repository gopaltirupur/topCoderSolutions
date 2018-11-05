package srm_731_div_1;

import java.util.Stack;

public class TreesAndBrackets {
	private static String possible = "Possible";
	private static String impossible = "Impossible";
	public String check(String t1, String t2){		
		Stack<Character> s1 = getStackForString(t1);
		Stack<Character> s2 = getStackForString(t2);
		while(!s1.empty()&&!s2.empty()){
			Character c1 = s1.peek();
			Character c2 = s2.peek();
			if(c1==c2){
				s1.pop();
				s2.pop();
			}else if(c2==')'&&c1=='('){
				Stack<Character> tmp = new Stack();
				tmp.push(s1.pop());
				while(!tmp.empty()&&!s1.empty()){
					if(s1.peek()=='('){
						tmp.push(s1.pop());
					}else if(s1.peek()==')'&&tmp.peek()=='('){
						tmp.pop();
						s1.pop();
					}else{
						break;
					}
				}						
			}else{
				return impossible;
			}
		}
		return (s1.empty()&&s2.empty())?possible:impossible;
		
	}	
	private Stack<Character> getStackForString(String input){
		Stack<Character> outputStack = new Stack();
		for(int i = input.length()-1;i>=0;i--){
			outputStack.push(input.charAt(i));
		}
		return outputStack;
	}
}

