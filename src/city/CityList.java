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
		sundan.buyList();
		blue.buyList();
		green.buyList();
	}
}
