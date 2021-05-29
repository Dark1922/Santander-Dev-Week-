package model.dto;
		
import java.time.LocalDate;

//model dos objetos real
public class SocketDTO {//conceito pra ter uma interação com o controlador
	
	private Long id; //id é feito com long pq vai ser um numero
	private String name;
	private Double price;
	private LocalDate date; //data daquela ação
	private Double variation;  //variação daquele dia da contação
	
	//GETTER E SETTER
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getVariation() {
		return variation;
	}
	public void setVariation(Double variation) {
		this.variation = variation;
	}
	
	
	

}
