package Common_Programming;

public class Matching_integer_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,3,5,2,3,23,3,2,4,5};
		int target=3;
		int sum=0;
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				sum=sum+arr[i];
				count++;
			}
		}
		System.out.println("sum= "+sum+" count= "+count);

	}

}
