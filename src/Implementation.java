
import java.util.*;
//구현
public class Implementation {

	public static void main(String[] args) {
		
		//4-1 상하좌우 p110
		//mine RLUD을 숫자로 변환후 맞는 2차원 배열 찾아서 출ㄹ력
		
//		Scanner scanner = new Scanner(System.in);
//		int size = scanner.nextInt();
//		
//		String inputValue = scanner.nextLine(); //다수입력
//		
//		String[] splitedValue = inputValue.split(","); //다수입력을 나눠서 배열?
//		
//		String R = splitedValue[0];
//		String L = splitedValue[1];
//		String U = splitedValue[2];
//		String D = splitedValue[3];
//		
//		
//		int[][] map = new int [size][size];
//		//명령무시는 어떻게 구현?
		
//		//해설 
		//2차원없이 그냥 1,1에서 시작해서 입력받은대로 더하기 명령무시는 CONTINUE로
//        Scanner sc = new Scanner(System.in);
//
//        // N을 입력받기(전체지도규모) (BUT이걸로 전체규모를 먼저 지정하는게 아니라 이동좌표를 제한하는 정도의 수준역할)
//        int n = sc.nextInt();
//        sc.nextLine(); // 정수입력뒤 문자열입력위해 버퍼 비우기
//        String[] plans = sc.nextLine().split(" "); //입력받은걸 배열화 .SPLIT은 입력받은 걸 (입력)을 기준으로 분할함(여기서는 띄어쓰기)
//        int x = 1, y = 1; //최초좌표(초기화필요해서 1이 들어감)
//
//        // L, R, U, D에 따른 이동 방향 
//        int[] dx = {0, 0, -1, 1}; //x방향(direction x)
//        int[] dy = {-1, 1, 0, 0}; //y방향 //X,Y방향을 같은 배열에 넣어도 되지만 보기 좋게하기 위해서?
//        char[] moveTypes = {'L', 'R', 'U', 'D'}; //실제입력방향과 대조위한 역할
//
//        // 이동 계획을 하나씩 확인
//        for (int i = 0; i < plans.length; i++) {
//            char plan = plans[i].charAt(0);
//            // 이동 후 좌표 구하기 
//            int nx = -1, ny = -1; //아무입력이 없을시 아래 continue 작동시키기 위해서 -1?
//            for (int j = 0; j < 4; j++) { //반복문 통해 LRUD중 어느게 같은지 검증
//                if (plan == moveTypes[j]) { 
//                    nx = x + dx[j]; //이동할 좌표
//                    ny = y + dy[j];
//                }
//            }
//            // 이동할 좌표가 공간을 벗어나는 경우 이동할 좌표를 실제반영하지않고 무시 
//            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
//            // 이동할 좌표대로 이동수행
//            x = nx; // 반복문이 반복되어야 하기 때문에 반복문에서 더함의 대상이 되는 x가 대상 
//            y = ny;
//        }
//
//        System.out.println(x + " " + y);
		

//		Retry (fail)
//		Scanner sc = new Scanner(System.in);
//		int Size = sc.nextInt();
//		int x = 1;
//		int y = 1;
//		int Mx = 0;
//		int My = 0;
//		sc.nextLine(); // 정수입력뒤 문자열입력위해 버퍼 비우기
//		String[] in = sc.nextLine().split(" ");
//		
//		char[] direction = {'L', 'R', 'U','D'};
//		int[] dx = {0,0,-1,1};
//		int[] dy = {-1,1,0,0};
//		
//		for(int i = 0; i<in.length; i++) {
//			char plan = in[i].charAt(0); //!!Error!! 이걸 빼먹음 String을 char으로 변환
//			
//			for(int j = 0; j<4; j++) {
//				if( direction[j] == plan) {
//					Mx = x+dx[j];
//					My = y+dy[j];
//				}
//			
//			}
//			if(Mx>Size || My>Size || Mx==0 || My==0 ) continue; //!!Error!! 아래 코드까지 위 반복문안에 넣었었음
//			
//			x =  Mx; //!!ERROR!! x = x + Mx 로 했었음 
//			y =  My;// Mx, My 자체가 이미 이동결과까지 반영하여 실질적으로 실행할지말지를 결정하는 단계인데 +=를 해버리면 
//					// 원위치 + (원위치+ 이동거리) 결과가 되어버림
//		}
//		System.out.println(x+" "+y);
//		
		
		//Retry3 (fail)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//
//		int x = 1;
//		int y = 1;
//		int mx = 0;
//		int my = 0;
//		sc.nextLine();
//		String[] plan = sc.nextLine().split(" ");
//		
//		char[] direction = {'L', 'R', 'U', 'D'};
//		int[] dx = {-1,1,0,0};
//		int[] dy = {0,0,-1,1};
//		
//		for(int i =0; i<plan.length; i++) {
//			
//			char plan1 = plan[i].charAt(0);
//			for(int j =0; j<direction.length; j++) { //!!Error!!! 반복문 횟수 오류 j<3 으로 잘못넣음(깝치지말고 .length)
//				if(plan1 == direction[j]) {
//					mx = x + dx[j];
//					my = y + dy[j];
//				}
//			}
//			if(mx<1 || my<1 || mx>N || my>N ) continue;
//			x = mx;
//			y = my;
//		}
//		System.out.println(x+" "+y);
		
		
		
		
//----------------------------------------
		//4-2 p113 implementation
		//Mine 3중반복문?(시분초) 
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int count = 0;
//		
//		for(int t = 0; t<=N; t++ ) {
//			String c = Integer.toString(t);
//			if(c.charAt(0) == 3 || c.charAt(1) == 3) { //Mine 수를 String으로 변환한 다음 charAt으로뽑아서 3여부 보려함
//				count = count + 59*59;
//				continue;
//			}
//			
//			for(int m = 0; m<60; m++) {
//				String b = Integer.toString(m);
//				if(b.charAt(0) == 3 || b.charAt(1) == 3) {
//					count = count + 59;
//					continue;
//				}
//				
//				for(int s = 0; s<60; s++) {
//					String a = Integer.toString(s);
//					if(a.charAt(0) == 3 || a.charAt(1) == 3) {
//						count++;
//					}
//				} //m에서도 같은 식으로 하려면 m 3일때 s에서 3된게 중복 카운트 됨 
//			}
//		} //!!Error!!삼중반복문이라는 아이디어 자체는 맞았지만 1. boolean 메서드 미활용, 2. 반복문에서 각 단계별로 따로 확인하려했음
		
		//해설 
//		public static boolean check(int h, int m, int s) {
//			if( h%10==3 || m%10==3 || s%10==3 || m/10==3 || s/10==3 ) { //!!Error!!수의성질 판단법 생각못함
//	  //!!Error!! 일의자리 판단법(10으로 나눠서 나머지가3), 십의자리 판단법 (10으로 나누어 몫이 3) 
//				return true; //!!Error!! boolean 메서는 이런 명시적인 true false 외에도
//			}return false; // return(입력값 == 3) 처럼 뒤 조건이 true인지 false 인지에 대한 결과를 반환할 수도	
//		}
//
//		public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int cnt = 0;
//		for(int h=0; h<=n; h++) {
//			for(int m = 0; m<60; m++) {
//				for(int s = 0; s<60; s++) {
//					if(check(h, m, s)) {
//						cnt++;
//					}
//				}
//			}
//		}
//		System.out.println(cnt);
//	}
	
		//Retry 1 (fail)
//		public static boolean time (int h, int m, int s) {
//			
//			if(h%10==3|| m%10==3 || s%10==3 || m/10==3 || s/10==3) {
//				return true;}
//			return false; //!!Error!! return fasel 없이 true만 return 하게 함
//		}
//				
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int N = sc.nextInt();
//			int result = 0;
//			for(int h =0; h<=N; h++) {
//				for(int m = 0; m<60; m++) {
//					for(int s = 0; s<60; s++) {
//						if(time(h, m, s)) {
//							result ++;
//						}
//					}
//				}
//			}
//			System.out.println(result);
		
		//2. knight game p115 (해결)
		//mine abcd 숫자전환 - 이동가능한 8개경우 좌표 - 불가한것 거르기 
		//아이디어 자체는 작동했으나 입력값을 좌표로 변환할때 필요한 코드를 몰랐고(a2Int, xIndex) 반복문에서 i j 값에서 실수함		
//		int[] Yarray = {1,2,3,4,5,6,7,8}; //결과적으로 필요없었음
//		char[] Xarray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
//		
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		char a1 = a.charAt(0);
//		
//		char a2 = a.charAt(1);
//		int a2Int = Character.getNumericValue(a2); //뒷자리수변환 char to int 
//		
//		int xIndex = Arrays.binarySearch(Xarray, a1); 
//		//앞자리char[]의 index 활용( 쓸려면 +1할것(ex a = 1))
//		//범용성 측면에서(ex 10, 20, 30..으로 변환)는 아래 아스키코드 활용이 더 낫다
		
//		int x = xIndex +1;
//		int y = a2Int;
//
//		int[]dx = {-1, 1, 0, 0}; //LR
//		int[]dy = {0, 0, -1, 1}; //UD
//		
//		int mx = 0; int my = 0;
//		int cnt = 0;
//		
//		// 해당 구조를 각 방위로  반복 후 cnt 출력
//		for(int i = 0; i<2; i++) {
//			mx = x+(dx[i] * 2);
//			for(int j = 2; j<4; j++) {
//				my = y+dy[j];
//				
//				if(mx < 1 || my < 1 || mx>8 || my>8) continue;
//				cnt++;
//			}
//		} 
//		for(int p = 2; p<4; p++) {
//			my = y+(dy[p] * 2);
//			for(int q = 0; q<2; q++) {
//				mx = x+dx[q];
//				
//				if(mx < 1 || my < 1 || mx>8 || my>8) continue;
//				cnt++;
//			}
//		} 		
//		System.out.println(cnt);}
		
		
		//해설
		//
		
        // 현재 나이트의 위치 입력받기
		Scanner sc = new Scanner(System.in);
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        // int 로 변수선언함으로써 char를 아스키코드값(숫자)로 변환
        //빼낸char1의 아스키코드값 - 0의 아스키코드값(48) = 1~
        //ex char 1의 아스키코드값 = 49 / 49-48 = 1
        //숫자의 경우 알파벳과 다르게 1아래 0의 아스키코드값이 있기에 별도 +1 해줄필요 없음 
        
        int column = inputData.charAt(0) - 'a' + 1;
        //a의 아스키코드값 = 97 / 1씩늘려가면서 알파벳진행

        //so 아스키코드 통한 숫자획득의 경우 숫자 to int = charAt() - '0'/ 문자 to int = charAt() - 'a' + 1
        
        
        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2}; //나와는 다르게 갈 수 있는 방위값을 미리 계산
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1; //continue로 거르는게 아니라 if문 &&으로 적용
            }
        }

        System.out.println(result);
    }

		
}
