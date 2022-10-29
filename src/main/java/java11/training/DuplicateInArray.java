package java11.training;

public class DuplicateInArray {
	
	public static void main(String[] args) {
		int arr[] = { 2,3,1,3,1,5,3,6};
		int map[] = new int[7];
		//output 3 1
		for(int i=0;i<arr.length;i++) {
			map[arr[i]]++;
		}
		
		for(int i=0;i<map.length;i++) {
			if(map[i] >= 2) {
				System.out.println(i);
			}
		}
		
	}

}
