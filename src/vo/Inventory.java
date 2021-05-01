package vo;

import java.util.Random;

public class Inventory {
	String city_name;
	String city_type;
	int day;
	public Random rd = new Random();
		
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public String getCity_type() {
		return city_type;
	}
	public void setCity_type(String city_type) {
		this.city_type = city_type;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
		
	//생성자 : 클래스 자체를불러서 데이터를 바로 넣을 때 사용
}
