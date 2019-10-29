package com.example.spring_hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="biryani")
public class Biryani implements Serializable {
	private static final long serialVersionUID = -2862825605032956883L;
	
	public Biryani()
	{
		
	}
	public Biryani(String biryaniname, int cost) {
		super();
		this.biryaniname = biryaniname;
		this.cost = cost;
	}

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="biryaniname")
	private String biryaniname;
	
	@Column(name="cost")
	private int cost;

	@Override
	public String toString() {
		return "Biryani [biryaniname=" + biryaniname + ", cost=" + cost + "]";
	}

}
