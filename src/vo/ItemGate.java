package vo;

import city.CityList;


public class ItemGate {
	PTQ_VO fvo=new PTQ_VO();
CityList cl =new CityList();
	
	
	
	
	public void start() {	//최초 한번실행
		cl.fisrtStart();
		cl.cityList();
	}
	




	public void numberOne() {
	
		for(int i=0;i<cl.sd.alist.size();i++) {
			System.out.println(cl.sd.alist.get(i).getCity_name());

			System.out.println(cl.sd.alist.get(i).getCity_type());
			
			System.out.println(cl.sd.alist.get(i).getName());

			System.out.println(cl.sd.alist.get(i).getPrice());

			System.out.println(cl.sd.alist.get(i).getSale());

			System.out.println(cl.sd.alist.get(i).getQuantity());
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
