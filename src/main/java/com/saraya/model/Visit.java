package com.saraya.model;

import java.time.LocalDate;

public class Visit {

	private LocalDate visitDate;
		public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;
	public Visit() {
		
	}
	public Visit(LocalDate visitDate, String description) {
		this.visitDate = visitDate;
		this.description = description;
	}
	public LocalDate getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}
}
