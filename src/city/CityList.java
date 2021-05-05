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
		sundan.buySetList();//SetList로 바꿔야함
		blue.buySetList();//SetList로 바꿔야함
		green.buySetList();
	}
	
	public void cityPrice() {
		blue.buyprice();
		green.buyprice();
		sundan.buyprice();
	}
	
	public void cityQuantity() {
		green.buyQuantity();
		blue.buyQuantity();
		sundan.buyQuantity();
	}
	
	public void time() {	//이 클래스에 있는 메소드를 묶어서 한번에 활용하기 위한 것
		cityQuantity();
		cityPrice();
		cityList();
	}
}
