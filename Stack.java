class Stack{
	private char[] data;
	private int top;

	public Stack(int size){
		data= new char[size];
		top =-1;
	}

	public void push(char x){
		if(top==data.length-1){
			System.out.println("stack is overflow");
		} else {
			data[++top]=x;
		}
	}

	public char pop(){
		if(top==-1){
			System.out.println(" ");

		}
		return data[top--];
	}
}


class StackTest{
	public static void main(String[]args){
		Stack s= new Stack(7);
			s.push('l');
			s.push('u');
			s.push('c');
			s.push('k');
			s.push('n');
			s.push('o');
			s.push('w');
			char result;
			while((result=s.pop())!=-1){
				System.out.print(result);
			}
	}
}
