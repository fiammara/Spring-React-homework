package lt.trains.project.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "trains")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private Date date;
	private String producer;
	private String city;
	private BigDecimal FullPrice;
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Wagons> wagons;

	
	
	//public BigDecimal getFullPrice() {
		
		//return FullPrice;
//	}

	//public void setFullPrice(Set<Wagons> wagons) {
	//	BigDecimal FullPrice=BigDecimal.ZERO;
		//for(Wagons n:wagons) {
		//	FullPrice=FullPrice.add(n.getFinalPrice());
		//}
		
	//}
	public Train() {

	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void addWagon(Wagons wagon) {
		wagons.add(wagon);
	}
	public void removeWagon(Wagons wagon) {
		wagons.remove(wagon);
		
	}

	
	
}