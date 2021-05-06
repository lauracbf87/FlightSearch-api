package com.nagarro.flight.search.api.model;


public class FindByText {
	private String textToFind;

	public FindByText() { }

	public FindByText(String textToFind) {
		this.textToFind = textToFind;
	}

	public void setTextToFind(String textToFind) {
		this.textToFind = textToFind;
	}

	public String getTextToFind() {
		return this.textToFind;
	}
}