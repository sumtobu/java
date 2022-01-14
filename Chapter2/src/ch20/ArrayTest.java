package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];//기본 0으로 모두 초기화됨
		int total = 0;
		
		for(int i = 0,num=1 ; i<arr.length; i++) {
			arr[i] = num++;
			System.out.println(arr[i]);
		}
		
		for(int num : arr) {//
			System.out.println(num);
			total += num;
		}
		System.out.println(total);
		
		
		
		double[] dArr = new double[5];
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1;
		for(int i = 0; i<dArr.length ; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(mtotal);
		
		mtotal = 1;
		int count = 0;
		dArr[0] = 1.1; 	count++; 
		dArr[1] = 2.1;	count++; 
		dArr[2] = 3.1;	count++; 
		
		for(int i = 0; i<count ; i++) {
			mtotal *= dArr[i];
		}
		
		System.out.println(mtotal);
	}
	
	
		

}
