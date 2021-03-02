package com.visionare.entities;

import java.io.Serializable;
import java.util.Date;

public class Policy implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numberPolicy;
	private String name;
	private Date startEffective;
	private Date endValid;
	private String vehiclePlate;
	private double policyValue;

	public Policy() {

	}

	public Policy(int numberPolicy, String name, String vehiclePlate, double policyValue) {
		super();
		this.numberPolicy = numberPolicy;
		this.name = name;
		this.vehiclePlate = vehiclePlate;
		this.policyValue = policyValue;
	}



	public int getNumberPolicy() {
		return numberPolicy;
	}

	public void setNumberPolicy(int numberPolicy) {
		this.numberPolicy = numberPolicy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartEffective() {
		return startEffective;
	}

	public void setStartEffective(Date startEffective) {
		this.startEffective = startEffective;
	}

	public Date getEndValid() {
		return endValid;
	}

	public void setEndValid(Date endValid) {
		this.endValid = endValid;
	}

	public String getVehiclePlate() {
		return vehiclePlate;
	}

	public void setVehiclePlate(String vehiclePlate) {
		this.vehiclePlate = vehiclePlate;
	}

	public double getPolicyValue() {
		return policyValue;
	}

	public void setPolicyValue(double policyValue) {
		this.policyValue = policyValue;
	}

}
