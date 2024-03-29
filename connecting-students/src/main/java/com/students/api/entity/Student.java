package com.students.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	@Column(name = "firstName", nullable = false)
	@NotBlank(message = "First name is required")
	private String firstName;

	@Column(name = "lastName", nullable = false)
	@NotBlank(message = "Last name is required")
	private String lastName;

	private String gender;
	
	@Column(nullable = false)
    @NotBlank(message = "Course is required")
	private String courseOpted;

    @Digits(integer = 3, fraction = 0, message = "Age must be a numeric value with up to 3 digits")
    private int age;

}
