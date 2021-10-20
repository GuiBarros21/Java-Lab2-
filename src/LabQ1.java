import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class LabQ1 {
	public static void main(String[] args) {
	
	Stack<Integer> stackList = new Stack<>();
	Scanner sc = new Scanner(System.in);
	int value;
	
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
	System.out.println(stackList);
	
	System.out.println("Type the number to be searched: ");
	value = sc.nextInt();
	
	if (stackList.search(value) > 0) {
		System.out.println("Your number is in the list");
	}
	else
	{
		System.out.println("Your number in NOT in the list");
	}
	
		
	}
	
	
	
	
	
}


