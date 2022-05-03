import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Introduction {
//Greedy num2
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	int k = sc.nextInt();
	
	int[] arr = new int[n];
	
	for(int i = 0; i<n; i++) {
		arr[i] = sc.nextInt();
	}
	
	Arrays.sort(arr);
		
	int first = arr[n-1];
	int second = arr[n-2];
	//m이라는 최대 횟수 내 큰수k개 + 작은수1개의 수열이 반복 여기에 수열 외 나머지에서 큰수
	
	int cnt = (m/(k+1))*k;
		//반복되는 수열의 횟수 * 수열안에서 큰수의 개수
	cnt += m%(k+1);
	 	// 수열바깥에서 나타나는 큰수의 횟수(나머지)
	
	int result = cnt * first; 
	result += (m-cnt)* second;
			//큰수횟수외 남은 횟수만큼 작은수 반복
	
	System.out.println(result);
	
	
	}
	
	
	
}
	
	
