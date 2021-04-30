package item;

import commander.KeyCommand;
import vo.F_VO;

//210330 : 이거 10개 만들것(아이템별로)
public class Mushroom {
	F_VO fvo=new F_VO();
	KeyCommand kc=new KeyCommand();
	int fQuantity =200;	//수량은 200개로 초기값 일단 고정
	
	
	public void first_setting() {
		fvo.setName("버섯");
		
		fvo.setType1("농지");
		fvo.setType2("산지");
		quantity(fQuantity);	//최초 실행시 물건 수량에 대한 초기값 지정
	}
	
	public int S_plus() {	//선단시티
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 플러스값
		return quantyty;
	}
	public int S_minus() {
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 마이너스값
		return quantyty;
	}
	public int G_plus() {	//그린시티
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 플러스값
		return quantyty;
	}
	
	public int G_minus() {
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 마이너스값
		return quantyty;
	}
	public int B_plus() {	//블루시티
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 플러스값
		return quantyty;
	}
	public int B_minus() {	
		int quantyty = kc.rd.nextInt(50)+1;	//최초 수량에 대한 변동 마이너스값
		return quantyty;
	}
	
	public void quantity(int QuantityF) {	//상점에 수량 세팅에 대한 함수
		fvo.setGreen_Quantity(QuantityF+S_plus()-S_minus());
		if(fvo.getGreen_Quantity()<0) {
			fvo.setGreen_Quantity(0);
		}
		
		fvo.setBlue_Quantity(QuantityF+G_plus()-G_minus());
		if(fvo.getBlue_Quantity()<0) {
			fvo.setBlue_Quantity(0);
		}
		
		fvo.setSundan_Quantity(QuantityF+B_plus()-B_minus());
		if(fvo.getSundan_Quantity()<0) {
			fvo.setSundan_Quantity(0);
		}
		
	}
}
