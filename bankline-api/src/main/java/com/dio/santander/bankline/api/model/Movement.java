package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movement {
	private Integer id;
	private LocalDateTime dateHour;
	private String description;
	private Double value;
	private TypeMovement type;

	public Movement() {
	}
	
	public Movement(Integer id, LocalDateTime dateHour, String description, Double value, TypeMovement type) {
		super();
		this.id = id;
		this.dateHour = dateHour;
		this.description = description;
		this.value = value;
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDateHour() {
		return dateHour;
	}
	public void setDateHour(LocalDateTime dateHour) {
		this.dateHour = dateHour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public TypeMovement getType() {
		return type;
	}
	public void setType(TypeMovement type) {
		this.type = type;
	}
	
}