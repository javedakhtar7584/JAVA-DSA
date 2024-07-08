class Pair{
	public static void main(String[]args){
		int[] a={2,5,7,9,2,7,15,8,9,2};
		int count=0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]) count++;
			}
		}
//		return count;
	}
}
