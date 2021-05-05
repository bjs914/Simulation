package main;

import commander.KeyCommand;
import vo.Inventory;
import vo.ItemGate;

public class TestMain {

	public static void main(String[] args) {
		KeyCommand kc = new KeyCommand();
		ItemGate itemGate = new ItemGate();
		
		itemGate.start();
		//무한 반복시작
		while(true) {
		System.out.println("도시 이름 : "+itemGate.inven.getCity_name()+"\t"+"날짜 : "+itemGate.inven.getDay());
		System.out.println();
		System.out.println("1. 상품구입");
		System.out.println("2. 상품판매");
		System.out.println("3. 재고확인");
		System.out.println("4. 휴식");
		System.out.println("5. 도시이동");
		System.out.println("6. 종료");
		
		int con=kc.sc.nextInt();
		
		if(con==1) {	//상품구입
			itemGate.numberOne();
		}//상품구입종료
		else if(con==2) {	//상품판매
			itemGate.numberTwo();
		}
		else if(con==3) {	//재고확인
			
		}
		else if(con==4) {	//휴식
			itemGate.numberFour();
		}
		else if(con==5) {	//도시이동 시작
			itemGate.numbereFive();
		}//도시 이동 종료
		else if(con==6) {	//프로그램 종료 시작
			System.out.println("게임이 종료되었습니다");
			break;
		}	//프로그램 종료 끝
		
		}//반복문 종료

	}//메인 화면 종료
}//클래스 종료