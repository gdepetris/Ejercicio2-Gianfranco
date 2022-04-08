package ejemploViernes.archivos;

import java.math.BigDecimal;

public enum Tax {

	SUPERREDUCED(new BigDecimal(0.04)), REDUCED(new BigDecimal(0.10)), NORMAL(new BigDecimal(0.21));
	
	 private BigDecimal precio;

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	 
	 Tax(BigDecimal precio){
		 this.precio=precio;
		 
	 }
	
}
