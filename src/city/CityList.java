package city;



public class CityList {
	public Sundan sundan = new Sundan();
	public Blue blue = new Blue();
	public Green green = new Green();
	
	
	public void fisrtStart() {//최초 한번 초기화&실행
		sundan.firstStart();
		blue.firstStart();
		green.firstStart();
	}
	
	public void cityList() {//날짜 변환 시, 실행
		sundan.buyList();//바꿔야함
		blue.buyList();//바꿔야하ㅑㅁ
		green.buySetList();
	}
	
	public void cityPrice() {
		green.buyprice();
	}
	
	public void cityQuantity() {
		green.buyQuantity();
	}
	
	public void time() {	//
		cityQuantity();
		cityPrice();
		cityList();
	}
}
