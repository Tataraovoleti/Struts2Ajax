/*
 * Copyright @ Paarmita Software and Consulting Pvt Ltd.
 * All Rights are reserved to Paarmita.
 * http://www.paarmita.com
 */
package com.java.struts.fazalcode;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author : Tatarao
 * @date   : 15-Nov-2013 2:40:37 PM
 */
public class AjaxAutoCompleteAction extends ActionSupport {

	private static final long serialVersionUID = 755446481485036238L;
	
	private ArrayList<String> countries;
	
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
		
	public ArrayList<String> getCountries() {
		return countries;
	}
	public void setCountries(ArrayList<String> countries) {
		this.countries = countries;
	}
	public String execute(){
		countries=new ArrayList<String>();
		countries.add("Maharastra");
		countries.add("Madhya Pradesh");
		countries.add("Meghalaya");
		countries.add("Karnataka");
		countries.add("Kerala");
		
		return SUCCESS;
	}

}
