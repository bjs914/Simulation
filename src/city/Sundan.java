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
	}

	public void buyprice() {
		beef.buyProcess(beef.ptqvo.getGreen_Quantity());	//이거 열개들어와야함
		egg.buyProcess(egg.ptqvo.getGreen_Quantity());
		gold.buyProcess(gold.ptqvo.getSundan_Quantity());
		iron.buyProcess(iron.ptqvo.getSundan_Quantity());
		mushroom.buyProcess(mushroom.ptqvo.getSundan_Quantity());
		octopus.buyProcess(octopus.ptqvo.getSundan_Quantity());
		oyster.buyProcess(oyster.ptqvo.getSundan_Quantity());
		rice.buyProcess(rice.ptqvo.getSundan_Quantity());
		salmon.buyProcess(salmon.ptqvo.getSundan_Quantity());
		salt.buyProcess(salt.ptqvo.getSundan_Quantity());
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
	
	
	
	public void beef_list() {//10개만들기	
		city.setName(beef.ptqvo.getName());
		city.setPrice(beef.cvo.getPrice());
		city.setSale(beef.cvo.getSale());
		city.setQuantity(beef.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅	
		alist.add(city);	
	}
	
	public void egg_list() {
		city.setName(egg.ptqvo.getName());
		city.setPrice(egg.cvo.getPrice());
		city.setPrice(egg.cvo.getPrice());
		city.setSale(egg.cvo.getSale());
		city.setQuantity(egg.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void gold_list() {
		city.setName(gold.ptqvo.getName());
		city.setPrice(gold.cvo.getPrice());
		city.setPrice(gold.cvo.getPrice());
		city.setSale(gold.cvo.getSale());
		city.setQuantity(gold.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void iron_list() {
		city.setName(iron.ptqvo.getName());
		city.setPrice(iron.cvo.getPrice());
		city.setPrice(iron.cvo.getPrice());
		city.setSale(iron.cvo.getSale());
		city.setQuantity(iron.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void mushroom_list() {
		city.setName(mushroom.ptqvo.getName());
		city.setPrice(mushroom.cvo.getPrice());
		city.setPrice(mushroom.cvo.getPrice());
		city.setSale(mushroom.cvo.getSale());
		city.setQuantity(mushroom.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void octopus_list() {
		city.setName(octopus.ptqvo.getName());
		city.setPrice(octopus.cvo.getPrice());
		city.setPrice(octopus.cvo.getPrice());
		city.setSale(octopus.cvo.getSale());
		city.setQuantity(octopus.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void oyster_list() {
		city.setName(oyster.ptqvo.getName());
		city.setPrice(oyster.cvo.getPrice());
		city.setPrice(oyster.cvo.getPrice());
		city.setSale(oyster.cvo.getSale());
		city.setQuantity(oyster.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void rice_list() {
		city.setName(rice.ptqvo.getName());
		city.setPrice(rice.cvo.getPrice());
		city.setPrice(rice.cvo.getPrice());
		city.setSale(rice.cvo.getSale());
		city.setQuantity(rice.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void salmon_list() {
		city.setName(salmon.ptqvo.getName());
		city.setPrice(salmon.cvo.getPrice());
		city.setPrice(salmon.cvo.getPrice());
		city.setSale(salmon.cvo.getSale());
		city.setQuantity(salmon.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
	
	public void salt_list() {
		city.setName(salt.ptqvo.getName());
		city.setPrice(salt.cvo.getPrice());
		city.setPrice(salt.cvo.getPrice());
		city.setSale(salt.cvo.getSale());
		city.setQuantity(salt.ptqvo.getSundan_Quantity());
		//리스트화 지정 전 세팅
		alist.add(city);
	}
}
