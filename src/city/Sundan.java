package city;

import java.util.ArrayList;

import item.Beef;
import item.Egg;
import item.Gold;
import item.Iron;
import item.Mushroom;
import item.Octopus;
import item.Oyster;
import item.Rice;
import item.Salmon;
import item.Salt;

public class Sundan {
	public City_VO city= new City_VO();
	public ListCollection listC = new ListCollection();
	
	Beef beef = new Beef();
	Egg egg = new Egg();
	Gold gold = new Gold();
	Iron iron = new Iron();
	Mushroom mushroom = new Mushroom();
	Octopus octopus = new Octopus();
	Oyster oyster = new Oyster();
	Rice rice = new Rice();
	Salmon salmon = new Salmon();
	Salt salt = new Salt();
	
	
	public ArrayList<City_VO> alist = new ArrayList<City_VO>();
	
	public void firstStart() {	//도시타입,도시이름 설정
		city.setCity_name("선단시티");
		city.setCity_type("산지");
		beef.first_setting();
		egg.first_setting();
		gold.first_setting();
		iron.first_setting();
		mushroom.first_setting();
		octopus.first_setting();
		oyster.first_setting();
		rice.first_setting();
		salmon.first_setting();
		salt.first_setting();	
		firstQuantity();
		buyprice();
		buyList();
		
	}

	public void buyprice() {
		beef.buyProcess(beef.ptqvo.getSundan_Quantity());	//이거 열개들어와야함
		egg.buyProcess(egg.ptqvo.getSundan_Quantity());
		gold.buyProcess(gold.ptqvo.getSundan_Quantity());
		iron.buyProcess(iron.ptqvo.getSundan_Quantity());
		mushroom.buyProcess(mushroom.ptqvo.getSundan_Quantity());
		octopus.buyProcess(octopus.ptqvo.getSundan_Quantity());
		oyster.buyProcess(oyster.ptqvo.getSundan_Quantity());
		rice.buyProcess(rice.ptqvo.getSundan_Quantity());
		salmon.buyProcess(salmon.ptqvo.getSundan_Quantity());
		salt.buyProcess(salt.ptqvo.getSundan_Quantity());
	}
	
	public void firstQuantity() {//210501 추가 및 수정
		beef.sundan_quantity(beef.fQuantity);
		egg.sundan_quantity(egg.fQuantity);
		gold.sundan_quantity(gold.fQuantity);
		iron.sundan_quantity(iron.fQuantity);
		mushroom.sundan_quantity(mushroom.fQuantity);
		octopus.sundan_quantity(octopus.fQuantity);
		oyster.sundan_quantity(oyster.fQuantity);
		rice.sundan_quantity(rice.fQuantity);
		salmon.sundan_quantity(salmon.fQuantity);
		salt.sundan_quantity(salt.fQuantity);
	}
	
	public void buyQuantity() {	//날짜바뀔때마다 변경 되는 메소드
		int num = listC.item_name.indexOf(beef.ptqvo.getName());
		beef.sundan_quantity(listC.quantity_collect.get(num));	//210501 수정 하는중
		
		num = listC.item_name.indexOf(egg.ptqvo.getName());
		egg.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(gold.ptqvo.getName());
		gold.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(iron.ptqvo.getName());
		iron.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(mushroom.ptqvo.getName());
		mushroom.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(octopus.ptqvo.getName());
		octopus.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(oyster.ptqvo.getName());
		oyster.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(rice.ptqvo.getName());
		rice.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(salmon.ptqvo.getName());
		salmon.sundan_quantity(listC.quantity_collect.get(num));
		
		num = listC.item_name.indexOf(salt.ptqvo.getName());
		salt.sundan_quantity(listC.quantity_collect.get(num));
	}
	
	
	public void buySale() {	//판매관련
		
	}
	
	public void buyList() {	//9개추가
		beef_list();
		egg_list();
		gold_list();
		iron_list();
		mushroom_list();
		octopus_list();
		oyster_list();
		rice_list();
		salmon_list();
		salt_list();
	}
	
	public void buySetList() {
		beef_setList();
		egg_setList();
		gold_setList();
		iron_setList();
		mushroom_setList();
		octopus_setList();
		oyster_setList();
		rice_setList();
		salmon_setList();
		salt_setList();
	}
	
	
	public void beef_list() {//최초 한번 실행하게 되는 리스트 
		listC.item_name.add(beef.ptqvo.getName());
		listC.quantity_collect.add(beef.ptqvo.getSundan_Quantity());
		listC.price_collect.add(beef.cvo.getPrice());
		listC.item_type1.add(beef.ptqvo.getType1());
		listC.item_type2.add(beef.ptqvo.getType2());
		listC.item_type3.add(beef.ptqvo.getType3());
		//리스트화 지정 전 세팅		
	}
	
	public void beef_setList() {//휴식, 도시이동 등의 로직으로 반복적으로 수정되는 리스트. 날짜 변경시 판매목록 변경
		int num = listC.item_name.indexOf(beef.ptqvo.getName());
		listC.quantity_collect.set(num, beef.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, beef.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void egg_list() {
		listC.item_name.add(egg.ptqvo.getName());
		listC.quantity_collect.add(egg.ptqvo.getSundan_Quantity());
		listC.price_collect.add(egg.cvo.getPrice());
		listC.item_type1.add(egg.ptqvo.getType1());
		listC.item_type2.add(egg.ptqvo.getType2());
		listC.item_type3.add(egg.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void egg_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(egg.ptqvo.getName());
		listC.quantity_collect.set(num, egg.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, egg.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void gold_list() {
		listC.item_name.add(gold.ptqvo.getName());
		listC.quantity_collect.add(gold.ptqvo.getSundan_Quantity());
		listC.price_collect.add(gold.cvo.getPrice());
		listC.item_type1.add(gold.ptqvo.getType1());
		listC.item_type2.add(gold.ptqvo.getType2());
		listC.item_type3.add(gold.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void gold_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(gold.ptqvo.getName());
		listC.quantity_collect.set(num, gold.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, gold.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void iron_list() {
		listC.item_name.add(iron.ptqvo.getName());
		listC.quantity_collect.add(iron.ptqvo.getSundan_Quantity());
		listC.price_collect.add(iron.cvo.getPrice());
		listC.item_type1.add(iron.ptqvo.getType1());
		listC.item_type2.add(iron.ptqvo.getType2());
		listC.item_type3.add(iron.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void iron_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(iron.ptqvo.getName());
		listC.quantity_collect.set(num, iron.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, iron.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void mushroom_list() {
		listC.item_name.add(mushroom.ptqvo.getName());
		listC.quantity_collect.add(mushroom.ptqvo.getSundan_Quantity());
		listC.price_collect.add(mushroom.cvo.getPrice());
		listC.item_type1.add(mushroom.ptqvo.getType1());
		listC.item_type2.add(mushroom.ptqvo.getType2());
		listC.item_type3.add(mushroom.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void mushroom_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(mushroom.ptqvo.getName());
		listC.quantity_collect.set(num, mushroom.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, mushroom.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void octopus_list() {
		listC.item_name.add(octopus.ptqvo.getName());
		listC.quantity_collect.add(octopus.ptqvo.getSundan_Quantity());
		listC.price_collect.add(octopus.cvo.getPrice());
		listC.item_type1.add(octopus.ptqvo.getType1());
		listC.item_type2.add(octopus.ptqvo.getType2());
		listC.item_type3.add(octopus.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void octopus_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(octopus.ptqvo.getName());
		listC.quantity_collect.set(num, octopus.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, octopus.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	
	public void oyster_list() {
		listC.item_name.add(oyster.ptqvo.getName());
		listC.quantity_collect.add(oyster.ptqvo.getSundan_Quantity());
		listC.price_collect.add(oyster.cvo.getPrice());
		listC.item_type1.add(oyster.ptqvo.getType1());
		listC.item_type2.add(oyster.ptqvo.getType2());
		listC.item_type3.add(oyster.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void oyster_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(oyster.ptqvo.getName());
		listC.quantity_collect.set(num, oyster.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, oyster.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void rice_list() {
		listC.item_name.add(rice.ptqvo.getName());
		listC.quantity_collect.add(rice.ptqvo.getSundan_Quantity());
		listC.price_collect.add(rice.cvo.getPrice());
		listC.item_type1.add(rice.ptqvo.getType1());
		listC.item_type2.add(rice.ptqvo.getType2());
		listC.item_type3.add(rice.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void rice_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(rice.ptqvo.getName());
		listC.quantity_collect.set(num, rice.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, rice.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void salmon_list() {
		listC.item_name.add(salmon.ptqvo.getName());
		listC.quantity_collect.add(salmon.ptqvo.getSundan_Quantity());
		listC.price_collect.add(salmon.cvo.getPrice());
		listC.item_type1.add(salmon.ptqvo.getType1());
		listC.item_type2.add(salmon.ptqvo.getType2());
		listC.item_type3.add(salmon.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void salmon_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(salmon.ptqvo.getName());
		listC.quantity_collect.set(num, salmon.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, salmon.cvo.getPrice());
		//판매가격 넣어야함
	}
	
	public void salt_list() {
		listC.item_name.add(salt.ptqvo.getName());
		listC.quantity_collect.add(salt.ptqvo.getSundan_Quantity());
		listC.price_collect.add(salt.cvo.getPrice());
		listC.item_type1.add(salt.ptqvo.getType1());
		listC.item_type2.add(salt.ptqvo.getType2());
		listC.item_type3.add(salt.ptqvo.getType3());
		//리스트화 지정 전 세팅
	}
	
	public void salt_setList() {	//날짜 변경 시, 상점 판매 목록 변경
		int num = listC.item_name.indexOf(salt.ptqvo.getName());
		listC.quantity_collect.set(num, salt.ptqvo.getGreen_Quantity());	//num자리에 잇는 것을 beef이후에 것으로 변경(override)하는 의미
		listC.price_collect.set(num, salt.cvo.getPrice());
		//판매가격 넣어야함
	}
}