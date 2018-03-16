package lt.invoices.project.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;	
	private BigDecimal quantity;	
	private String units;
	private BigDecimal price;
	
	
	public Item() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}
	
	public BigDecimal getUnitPrice() {
		return price;
	}

	public void setUnitPrice(BigDecimal price) {
		this.price = price;
	}
	
	public BigDecimal getFinalPrice() {
		return getUnitPrice().multiply(getQuantity());
	}

}

