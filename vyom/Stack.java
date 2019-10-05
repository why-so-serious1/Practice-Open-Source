import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		
		for(int i=10;i>0;i--)
			stack.push(i);
		
		stack.add(99); //now the topmost element is 99
		System.out.println("Index of new element"+stack.indexOf(99));
		System.out.println("First Element:"+stack.get(0)); 
		
		while(!stack.isEmpty()){
			System.out.print(stack.peek()+" ");
			stack.pop();	
		}
		
		System.out.println("\nSize of stack:"+stack.size());
	}

}