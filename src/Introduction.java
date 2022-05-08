import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Introduction {

	

	public static void main(String args[]) {
		//Greedy num2 
		//Mine - Fail (방법도출실패)
//	Scanner sc = new Scanner(System.in);
//	
//	int n = sc.nextInt();
//	int m = sc.nextInt();
//	int k = sc.nextInt();
//	
//	int[] arr = new int[n];
//	
//	for(int i = 0; i<n; i++) {
//		arr[i] = sc.nextInt();
//	}
//	
//	Arrays.sort(arr);
//		
//	int first = arr[n-1];
//	int second = arr[n-2];
//	//m이라는 최대 횟수 내 큰수k개 + 작은수1개의 수열이 반복 여기에 수열 외 나머지에서 큰수
//	
//	int cnt = (m/(k+1))*k;
//		//반복되는 수열의 횟수 * 수열안에서 큰수의 개수
//	cnt += m%(k+1);
//	 	// 수열바깥에서 나타나는 큰수의 횟수(나머지)
//	
//	int result = cnt * first; 
//	result += (m-cnt)* second;
//			//큰수횟수외 남은 횟수만큼 작은수 반복
//	
//	System.out.println(result);
	
//	}
	
	//Greedy num3 (p96)
	//mine 배열 - sort 각 행별 최소숫자 도출 - 최소숫자들을 다시 list - sort 최대숫자 도출
		//해설
		Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x); //!! i가 0일때 그 안에서 j값을 반복하면서 비교 
//            }										/(j0값과 minvalue비교 minvaul저장-> 저장한값과 j1값을 비교 minvaul저장->저장한값과 j2값을 비교 ->반복)
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);  //i 가 0일때 나온 minval값과 result비교 result저장 -> 저장한 result값과 i1일때의 minval 비교 result저장 -> 반복
            										//이렇게 반복하여 i0~in-1 의 minvalue값 중 최대 값 비교가능(처음에 이해못한 것 ) 
        }

        System.out.println(result); // 최종 답안 출력
    }
		
		
		
	
		//Mine(포기)
//		Scanner sc = new Scanner(System.in);
//		
//	    // N, M을 공백을 기준으로 구분하여 입력 받기
//	    int n = sc.nextInt();
//	    int m = sc.nextInt();
//	    int[][] a = new int[n][m];
//	    
//	    for(int i = 0; i<n; i++) {
//	
//	    	for(int j = 0; j<m; j++) {
//	    		a[i][j] = sc.nextInt();
//	    	}
//	    	  //다음 과정이 너무 복잡해서 이건 포기
//	    }
//	    System.out.println(sortRowWise(a));
//
//	}
//
//	public static int[] sortRowWise(int a[][]) {
//		for (int i = 0; i < a.length; i++) {
//            Arrays.sort(a[i]);
//        }	
//		
//		int[] b = new int[n];
//		for (int i = 0; i<b.length; i++) {
//			b[i] = a[i][1];
//		}
//		for(int i = 0; i<b.length; i++) {
//			System.out.println(b[i]);
//		}
//		return b;
//	} 
//	public static int n; //전역변수화
	
	}
}


	
	
