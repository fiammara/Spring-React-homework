package lt.trains.project.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "wagons")
public class Wagons {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String producer;
	private BigDecimal quantity;

	private int type;
	@Transient
	private BigDecimal price;
	private int volume;
	private BigDecimal finalPrice;
	@ManyToOne
	@JoinColumn(name = "trains_id", nullable = true)
	private Train train;
	private int PassengerClass;
	private int maxWeight;	
	private String locomotiveType;
	
	public String getLocomotiveType() {
		return locomotiveType;
	}
	public void setLocomotiveType(String locomotiveType) {
		this.locomotiveType = locomotiveType;
	}
	public int getPassengerClass() {
		
		return PassengerClass;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	public void setPassengerClass(int passengerClass) {
		PassengerClass = passengerClass;
	}
	public Wagons() {
		
	}
	
	public BigDecimal getFinalPrice() {
		return price.multiply(quantity);
	}

}