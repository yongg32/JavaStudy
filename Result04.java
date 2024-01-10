package practice;

import java.util.PrimitiveIterator.OfDouble;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;

public class Result04 {

	public static void main(String[] args) {
		
		// 1 ~ 50 사이의 랜덤함 수 생성
		// 업다운 게임을 만들어주세요 ^^
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세여:");
		int nw = scan.nextInt();
	
		int chance = 5;
		int randInt = (int) (Math.random() * 50 + 1);
		while(true){
			chance--;
			if(randInt == nw) {
				System.out.println("정답입니다!!!");
				break;
			}else if(randInt > nw) {
				System.out.println("업!! 기회가" + chance + "번 남았습니다!");
		}else{
			System.out.println("다운!! 기회가" + chance + "번 남았습니다!");
		} 
			if (chance == 0) {
			System.out.println("실패하셨씁니다 정답은" + randInt + "였습니다");
			break;
			}
			System.out.println("숫자를 다시 입력해주세요");
			nw = scan.nextInt();
	}
			
//		Q. 02
//		엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가
//		이동하는
//		프로그램을 구현해 봅시다.
//		1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
//		2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
//		3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
//		4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다.
//		@. 사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로
//		이동하도록 만드세요.
		
		int sum = scan.nextInt();
		System.out.println("몇층에 계시나요?[종료는 q 또는 exit]" + sum);
		
		if(int i = )
		
		
		
		
		
		
		}

}
