class Stack{
	private char[] data=null;
	private int top;
	public Stack(int size){
		data = new char[size];
		top=-1;
	}

	public void push(char ch){
		data[++top]=ch;
	}

	public char pop(){
		return data[top--];
	}

	public boolean isEmpty(){
		if(top==-1) return true;
		return false;
	}
}
class ReverseString{
	public static void main(String[]args){
		String s= "lucknow";
		Stack st = new Stack(10);
		for(int i=0; i<s.length(); i++){
			st.push(s.charAt(i));
		}

		char[] result = new char[s.length()];
		int j=0;
		while(!st.isEmpty()){
			result[j]=st.pop();
			j++;
		}

		String str= new String(result);
		System.out.println(str);
	}
}
