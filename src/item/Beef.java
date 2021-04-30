package item;


import city.City_VO;
import commander.KeyCommand;
import vo.PTQ_VO;

//210330 : 이거 10개 만들것(아이템별로)
public class Beef {
	public PTQ_VO ptqvo=new PTQ_VO();
	public City_VO cvo = new City_VO();

	KeyCommand kc=new KeyCommand();
	int fQuantity =200;	//초기수량
	int beefPrice=120; //소고기 기초가격
	
	public void first_setting() {
		ptqvo.setName("소고기");
		
		ptqvo.setType1("농지");
		quantity(fQuantity);//최초 실행시 물건 수량에 대한 초기값 지정
		buyProcess(ptqvo.getGreen_Quantity());//최초 구매설정 초기화
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

		ptqvo.setGreen_Quantity(QuantityF+S_plus()-S_minus());
		if(ptqvo.getGreen_Quantity()<0) {
			ptqvo.setGreen_Quantity(0);
		}
		
		ptqvo.setBlue_Quantity(QuantityF+G_plus()-G_minus());
		if(ptqvo.getBlue_Quantity()<0) {
			ptqvo.setBlue_Quantity(0);
		}
		
		ptqvo.setSundan_Quantity(QuantityF+B_plus()-B_minus());
		if(ptqvo.getSundan_Quantity()<0) {
			ptqvo.setSundan_Quantity(0);
		}
	}
	
	public void buyProcess(int quantity) {	//수량을 받아서 가격을 설정하는것
		if(quantity<=140) {
			cvo.setPrice(beefPrice*((1-30/100)));
		}
		else if(quantity>140 || quantity<=160) {
			cvo.setPrice(beefPrice*((1-20/100)));
		}
		else if(quantity>160 || quantity<=180) {
			cvo.setPrice(beefPrice*((1-10/100)));
		}
		else if(quantity>180 || quantity<=220) {
			cvo.setPrice(beefPrice);
		}
		else if(quantity>220 || quantity<=240) {
			cvo.setPrice(beefPrice*((1+10/100)));
		}
		else if(quantity>240 || quantity<=260) {
			cvo.setPrice(beefPrice*((1+20/100)));
		}
		else {
			cvo.setPrice(beefPrice*((1+30/100)));
		}
	}
}
