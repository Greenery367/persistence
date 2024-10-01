package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homework {
	
	@Id // PK 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String text;
	
	// 여러개의 댓글은 하나의 게시글에 속한다.
	// = Many To One
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;

}
