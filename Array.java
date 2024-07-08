/*class Array{
	public static void main(String[]args){
		int[] arr={1,2,4,56,67,7,74,4,3,34,56,3};
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println("duplicates Array"+arr[j]);
				}
			}
		}
	}
}*/

class Array{
	public static void main(String[]args){
		int[] arr={1,234,5,6,78,54,678,9876,54,67,876,54,5,67898,765};
		int maxvalue= arr[0];
		int minvalue=arr[0];
		for(int i=0; i<arr.length; i++){
			if(maxvalue<arr[i]){
				maxvalue = arr[i];
			}else if(minvalue > arr[i]){
				minvalue=arr[i];
			}
		}
		 System.out.println("largest element = "+maxvalue+"samllest elemenet = "+minvalue);

	}

}
