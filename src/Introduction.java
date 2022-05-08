import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Introduction {

	public static void main(String args[]) {
		// Greedy num2
		// Mine - Fail (방법도출실패)
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

		// Greedy num3 (p96)
		// mine 배열 - sort 각 행별 최소숫자 도출 - 최소숫자들을 다시 list - sort 최대숫자 도출
		// 해설
//		Scanner sc = new Scanner(System.in);
//
//		// N, M을 공백을 기준으로 구분하여 입력 받기
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int result = 0;
//
//		// 한 줄씩 입력 받아 확인하기
//		for (int i = 0; i < n; i++) {
//			// 현재 줄에서 '가장 작은 수' 찾기
//			int min_value = 10001;
//			for (int j = 0; j < m; j++) {
//				int x = sc.nextInt();
//				min_value = Math.min(min_value, x); // !! i가 0일때 그 안에서 j값을 반복하면서 비교
//			} // (j0값과 minvalue비교 minvaul저장-> 저장한값과 j1값을 비교 minvaul저장->저장한값과 j2값을 비교 ->반복)
//			// '가장 작은 수'들 중에서 가장 큰 수 찾기
//			result = Math.max(result, min_value); // i 가 0일때 나온 minval값과 result비교 result저장 -> 저장한 result값과 i1일때의 minval
//													// 비교 result저장 -> 반복
//													// 이렇게 반복하여 i0~in-1 의 minvalue값 중 최대 값 비교가능(처음에 이해못한 것 )
//		}
//
//		System.out.println(result); // 최종 답안 출력
//	}

	// Mine(포기)
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
	
	//GREEDY NUM4 99P
	//MINE - 나누어떨어지면(%값이 0일때?) 나누고 값을 저장한 다음 계속 판단 
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int K = sc.nextInt();
//		//result = 0; result로 저장하려고 함 false!
//		int n = 0;
//		while(true) {//조건 어떻게? while의 경우 true 후 break 조건이 최선인가?
//			if(N%K == 0) {
//				N = N/K;
//				n++;
//			} else {
//				N = N-1;
//				n++;
//			}//횟수는 어떻게 나오게 하지?
//			if (N==1) break; //!!조건 몰라서 검색함
//		}
//		System.out.println(n);
		//!!!but만약 나누는 수가 커진다면(EX만단위) 마지막 빼는 단계에서 불필요한 연산(N%K==0)이 너무 많이 실행됨
		
		//해설
		  Scanner sc = new Scanner(System.in);

	        // N, K를 공백을 기준으로 구분하여 입력 받기
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int result = 0;

	        while (true) {
	            // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기 (EX17, 3)
	            int target = (n / k) * k;   //나누어떨어지는수 (나누고 곱하기)(나눌횟수는 1회)(15) (3)
	            result += (n - target);     //나누어떨어지는수 제외한 나머지  (빼게될횟수와 똑같음)(2) (3+2)
	            n = target;
	            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
	            if (n < k) break;		
	            // K로 나누기
	            result += 1;				//전체 연산횟수 = 나머지(빼는횟수) + 1 (나누는횟수) (3회)(6회)
	            n = n / k;					//나누어떨어지는수를 나눈 결과 (나눌기호가 있다면 반복 )(5)(1)
	        }

	        // 마지막으로 남은 수에 대하여 1씩 빼기
	        result = result + (n - 1);
	        System.out.println(result);
	       
	    }
		
		
		
		
		
		
		
		
	}

