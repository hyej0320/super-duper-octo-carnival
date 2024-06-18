package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Coffee {
	Integer c_id;
	String c_name;
	Integer price;
	
	public Coffee(Integer c_id, String c_name, Integer price) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.price = price;
	}
	
	public Coffee(ResultSet rs) throws SQLException {
		c_id = rs.getInt("c_id");
		c_name = rs.getString("c_name");
		price = rs.getInt("price");
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [c_id=" + c_id + ", c_name=" + c_name + ", price=" + price + "]";
	}

	
	
	
	
}
