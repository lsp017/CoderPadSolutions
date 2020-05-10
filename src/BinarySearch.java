
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[]{1,2,3,4,5,6,7,8,9,10};
		int searchElement = 9;
		int len = ar.length;
		
		int res = bs(ar,0,len-1,searchElement);
		
		if(res== -1) System.out.println("not found");
		else System.out.println("found "+ res);
		
		
	}

	private static int bs(int[] ar, int left, int right, int searchElement) {
		// TODO Auto-generated method stub
		int mid=0;
		if(right>=left) {
			mid=(left+(right-1))/2;
		}
		System.out.println(mid);
		if (ar[mid] == searchElement) return mid;
		
		if(ar[mid] > searchElement) return bs(ar,left,mid-1,searchElement); 
		
		if(ar[mid] < searchElement)	return bs(ar,mid+1,right,searchElement);;
			
		return -1;
	}

}
