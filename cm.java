class Array{
	public static void main(String[]args){
		int[] a={1,2,4,4,5,3,3,5,5};
		int[] b={1,3,5,6,4,3,6,7435,524,42,20};
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j]){
					System.out.println(a[i]);
					//break;
				}
			}
		}
	}
}
