package vo;

import city.CityList;
import commander.KeyCommand;


public class ItemGate {
	PTQ_VO ftqvo=new PTQ_VO();
	CityList cityList =new CityList();
	public Inventory inven = new Inventory();
	KeyCommand keyCommand = new KeyCommand();
	
	public void start() {	//최초 한번실행
		cityList.fisrtStart();
		int cityPick = inven.rd.nextInt(3);
		inven.setDay(1);
		
		
		if(cityPick==0) {	//선단시티에 대한 것
			inven.setCity_name(cityList.sundan.city.getCity_name());
			inven.setCity_type(cityList.sundan.city.getCity_type());
		}
		else if (cityPick==1) {
			inven.setCity_name(cityList.blue.city.getCity_name());
			inven.setCity_type(cityList.blue.city.getCity_type());
		}
		else if (cityPick==2) {
			inven.setCity_name(cityList.green.city.getCity_name());
			inven.setCity_type(cityList.green.city.getCity_type());
		}
	}


	public void numberOne() {
		if(inven.getCity_name().equals(cityList.sundan.city.getCity_name())) {
			for (int i=0; i<cityList.sundan.listC.item_name.size();i++) {
				if(cityList.sundan.listC.item_type1.get(i).equals(cityList.sundan.city.getCity_type()) || 
				cityList.sundan.listC.item_type2.get(i)!=null && cityList.sundan.listC.item_type2.get(i).equals(cityList.sundan.city.getCity_type()) || 
				cityList.sundan.listC.item_type3.get(i)!=null && cityList.sundan.listC.item_type3.get(i).equals(cityList.sundan.city.getCity_type())) {
					
					System.out.print(cityList.sundan.listC.item_name.get(i)+"\t");
					
					System.out.print(Math.round(cityList.sundan.listC.price_collect.get(i))+"\t");
								
					System.out.println(cityList.sundan.listC.quantity_collect.get(i)+"\t");
				}
			}
		}//선단 시티 종료
		else if(inven.getCity_name().equals(cityList.blue.city.getCity_name())) {
			for (int i=0; i<cityList.blue.listC.item_name.size();i++) {
				if(cityList.blue.listC.item_type1.get(i).equals(cityList.blue.city.getCity_type()) || 
				cityList.blue.listC.item_type2.get(i)!=null && cityList.blue.listC.item_type2.get(i).equals(cityList.blue.city.getCity_type()) || cityList.blue.listC.item_type3.get(i)!=null && cityList.blue.listC.item_type3.get(i).equals(cityList.blue.city.getCity_type())) {
					
					System.out.print(cityList.blue.listC.item_name.get(i)+"\t");
					
					System.out.print(Math.round(cityList.blue.listC.price_collect.get(i))+"\t");
								
					System.out.println(cityList.blue.listC.quantity_collect.get(i)+"\t");
				}
			}
		}//블루시티 종료
		else if(inven.getCity_name().equals(cityList.green.city.getCity_name())) {
			for (int i=0; i<cityList.green.listC.item_name.size();i++) {
				if(cityList.green.listC.item_type1.get(i).equals(cityList.green.city.getCity_type()) || cityList.green.listC.item_type2.get(i)!=null && cityList.green.listC.item_type2.get(i).equals(cityList.green.city.getCity_type()) || cityList.green.listC.item_type3.get(i)!=null && cityList.green.listC.item_type3.get(i).equals(cityList.green.city.getCity_type())) {
					
					System.out.print(cityList.green.listC.item_name.get(i)+"\t");
					
					System.out.print(Math.round(cityList.green.listC.price_collect.get(i))+"\t");
								
					System.out.println(cityList.green.listC.quantity_collect.get(i)+"\t");
				}
			}
		}//그린시티 종료
	}
	
	
	public void numberTwo() {
		for(int i=0;i<cityList.blue.listC.item_name.size();i++) {
			System.out.print(cityList.blue.listC.item_name.get(i));
			System.out.print(cityList.blue.listC.item_type1.get(i));
			System.out.print(cityList.blue.listC.item_type2.get(i));
			System.out.println(cityList.blue.listC.item_type3.get(i));
		}
		
	}
	
	public void numberThree() {
		
	}
	
	public void numberFour() {
		//휴식 메소드, 210501추가
		inven.setDay(inven.getDay()+1);
		cityList.time();
	}
	
	public void numbereFive() {//210505 추가
		System.out.println("이동할 마을을 선택해주세요.");
		if(inven.getCity_name().equals(cityList.green.city.getCity_name())) {
			System.out.println("1. 블루시티 (2일)\t 2. 선단시티 (3일)");
			String choice=keyCommand.sc.next();
			
			if(inven.getCity_name().equals(cityList.green.city.getCity_name()) && choice.equals("1") ) {
				inven.setCity_name(cityList.blue.city.getCity_name());
				for (int i=0; i<2; i++) {	//i의 의미 : 그린시티->블루시티 까지의 일수 (즉, 변경되는 최대날짜까지의 로직 반복 횟수)
					inven.setDay(inven.getDay()+1);
					cityList.time();
				}			
			}
			else if(inven.getCity_name().equals(cityList.green.city.getCity_name()) && choice.equals("2") ) {
				inven.setCity_name(cityList.sundan.city.getCity_name());
				for (int i=0;i<4;i++) {
					inven.setDay(inven.getDay()+1);
					cityList.time();				
				}
			}
		}
		else if(inven.getCity_name().equals(cityList.blue.city.getCity_name())) {
			System.out.println("1. 선단시티 (5일)\t 2. 그린시티 (3일)");
			String choice=keyCommand.sc.next();
			
			if(inven.getCity_name().equals(cityList.blue.city.getCity_name()) && choice.equals("1") ) {
				inven.setCity_name(cityList.sundan.city.getCity_name());
				for (int i=0; i<5; i++) {
					inven.setDay(inven.getDay()+1);
					cityList.time();
				}
			}
			else if(inven.getCity_name().equals(cityList.blue.city.getCity_name()) && choice.equals("2") ) {
				inven.setCity_name(cityList.green.city.getCity_name());
				for (int i=0;i<3;i++) {
					inven.setDay(inven.getDay()+1);
					cityList.time();
				}
			}
						
		}
		else if(inven.getCity_name().equals(cityList.sundan.city.getCity_name())) {
			System.out.println("1. 블루시티 (2일)\t 2. 그린시티 (4일)");
			String choice=keyCommand.sc.next();
			
			if(inven.getCity_name().equals(cityList.sundan.city.getCity_name()) && choice.equals("1")) {
				inven.setCity_name(cityList.blue.city.getCity_name());
				for (int i=0;i<3;i++) {
					inven.setDay(inven.getDay()+1);
					cityList.time();
				}
			}
			else if(inven.getCity_name().equals(cityList.sundan.city.getCity_name()) && choice.equals("2")) {
				inven.setCity_name(cityList.green.city.getCity_name());
				for (int i=0;i<4;i++) {
					inven.setDay(inven.getDay()+1);
					cityList.time();
				}
			}
		}	
		else {
			System.out.println("잘못 눌렀습니다.");
		}
	}
}
