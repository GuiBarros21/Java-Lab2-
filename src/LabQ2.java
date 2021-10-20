import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class LabQ2 {

	public static void main(String[] args) {
		Stack<Integer> stackList = new Stack<>();
		Stack<Integer> stackList2 = new Stack<>();
		
		
		stackList.push(32);
		stackList.push(34);
		stackList.push(24);
		stackList.push(12);
		stackList.push(43);
		stackList.push(5);
		stackList.push(18);
		stackList.push(19);
		stackList.push(8);
		stackList.push(3);
		
		
		stackList2.addAll(stackList);
		
		stackList.set(0, -5);
		
		
		
		System.out.println(stackList);
		System.out.println(stackList2);
		
	}

}