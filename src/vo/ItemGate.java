package vo;

import city.CityList;


public class ItemGate {
	PTQ_VO ftqvo=new PTQ_VO();
	CityList cityList =new CityList();
	
	
	public void start() {	//최초 한번실행
		cityList.fisrtStart();
	}


	public void numberOne() {
		System.out.println("상품명\t판매가격\t판매수량\t도시타입\t도시타입\t도시타입");

		for(int i=0;i<cityList.sundan.listC.item_name.size();i++) {
			System.out.print(cityList.sundan.listC.item_name.get(i)+"\t");

			System.out.print(Math.round(cityList.sundan.listC.price_collect.get(i))+"\t");
			
			System.out.print(cityList.sundan.listC.quantity_collect.get(i)+"\t");

			System.out.print(cityList.sundan.listC.item_type1.get(i)+"\t");
			
			System.out.print(cityList.sundan.listC.item_type2.get(i)+"\t");
			
			System.out.println(cityList.sundan.listC.item_type3.get(i)+"\t");
		}
	}
	
	
	public void numberTwo() {
		
	}
	
	public void numberThree() {
		
	}
	
	public void numberFour() {
		
	}
	
	public void numbereFive() {
		
	}
}
