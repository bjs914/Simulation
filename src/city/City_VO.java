package city;

public class City_VO {
	private String city_name;
	private String city_type;
	private String name; //상품 이름
	private double price;	//구입가격
	private int quantity;	//최종수량이자 변동되는 수량들을 의미함
	private int sale;	//판매가격
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}
	
	
	
}
