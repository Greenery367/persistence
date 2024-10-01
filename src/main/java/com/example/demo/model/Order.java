package com.example.demo.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String orderName;
	private Date orderDate;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name="address_id")
	private Address address;
}
