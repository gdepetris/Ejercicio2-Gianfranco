package ejemploViernes.archivos;

import java.math.BigDecimal;

public class Product implements Comparable<Product>{

	private String name;
	
	private BigDecimal Price;
	
	private Tax type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public void setPrice(BigDecimal price) {
		Price = price;
	}

	public Tax getType() {
		return type;
	}

	public void setType(Tax type) {
		this.type = type;
	}

	public Product(String name, BigDecimal price, Tax type) {
		super();
		this.name = name;
		Price = price;
		this.type = type;
	}

	@Override
	public int compareTo(Product o) {
		return 0;
	}

	
	
	
}
