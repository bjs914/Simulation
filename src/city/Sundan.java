package city;

import java.util.ArrayList;

import item.Beef;


public class Sundan {
	public City_VO city= new City_VO();
	Beef beef = new Beef();
	
	public ArrayList<City_VO> alist = new ArrayList<City_VO>();
	
	
	
	public void firstStart() {	//도시타입,도시이름 설정
		city.setCity_name("선단시티");
		city.setCity_type("산지");
		beef.first_setting();
		
	}

	public void buyprice() {
		beef.buyProcess(beef.fvo.getSundan_Quantity());	//이거 열개들어와야함
	}
	
	
	
	public void buySale() {	//판매관련
		
	}
	
	public void buyList() {	//9개추가
		beef_list();
		
	}
	
	
	
	public void beef_list() {//10개만들기
		
		city.setName(beef.fvo.getName());
		city.setPrice(beef.cvo.getPrice());
		city.setSale(beef.cvo.getSale());
		city.setQuantity(beef.fvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		
		alist.add(city);
		
	}
	
}
