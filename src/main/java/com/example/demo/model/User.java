package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	// 고객과 주소가 1:1 관계라고 생각해보자.
	
	// @OneToOne(fetch = FetchType.LAZY)
	// OneToOne - User, Address 엔티티간의 1:1 관계를 매핑한다.
	// FetchType.LAZY : 지연 로딩 전략을 사용한다. (getAddress())
	@OneToOne(fetch = FetchType.LAZY)
	
	// @JoinColumn : 외래키 (FK)를 설정하는 어노테이션이다. 
	// 즉, address_id라는 이름이 외래키 컬럼이 된다!
	@JoinColumn(name = "address_id")
	private Address address;

}
