import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        // N을 입력받기(전체지도규모) (BUT이걸로 전체규모를 먼저 지정하는게 아니라 이동좌표를 제한하는 정도의 수준역할)
        int n = sc.nextInt();
        sc.nextLine(); // 정수입력뒤 문자열입력위해 버퍼 비우기
        String[] plans = sc.nextLine().split(" "); //입력받은걸 배열화 .SPLIT은 입력받은 걸 (입력)을 기준으로 분할함(여기서는 띄어쓰기)
        int x = 1, y = 1; //최초좌표(초기화필요해서 1이 들어감)

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1}; //x방향(direction x)
        int[] dy = {-1, 1, 0, 0}; //y방향 //X,Y방향을 같은 배열에 넣어도 되지만 보기 좋게하기 위해서?
        char[] moveTypes = {'L', 'R', 'U', 'D'}; //실제입력방향과 대조위한 역할

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            // 이동 후 좌표 구하기 
            int nx = -1, ny = -1; //아무입력이 없을시 아래 continue 작동시키기 위해서 -1?
            for (int j = 0; j < 4; j++) { //반복문 통해 LRUD중 어느게 같은지 검증
                if (plan == moveTypes[j]) { 
                    nx = x + dx[j]; //이동할 좌표
                    ny = y + dy[j];
                }
            }
            // 이동할 좌표가 공간을 벗어나는 경우 이동할 좌표를 실제반영하지않고 무시 
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동할 좌표대로 이동수행
            x = nx; // 반복문이 반복되어야 하기 때문에 반복문에서 더함의 대상이 되는 x가 대상 
            y = ny;
        }

        System.out.println(x + " " + y);
		

		
	}

}
