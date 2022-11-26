

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		int num=22;
		
		int low=0;
		int high=a.length-1;
		for(int i=0;i<a.length;i++) {
			int mid=(low+high)/2;
			if(num==a[mid]) {
				System.out.println(num+" number found at the index "+mid);
				break;
			}
			else if(num<a[mid]) {
				high=mid-1;
			}
			else if(num>a[mid]) {
				low=mid+1;
			}
			
		}
		if(low>high) {
			System.out.println(num+" number not found");
		}

	}

}
