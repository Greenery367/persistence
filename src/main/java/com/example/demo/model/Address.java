package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	// @Id: DB 테이블의 PK를 나타낸다.
	// DB 테이블에서 이 필드를 기준으로 레코드를 구분한다.
	
	// @GeneratedValue
	// 이 어노테이션은 기본 키가 자동으로 생성되게 하다.
	// GenerationType.Identity는 DB의 Auto_increment를 사용해 기본 키 값을 자동 생성한다.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String street;

}
