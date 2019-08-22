package com.java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String document;

	
}
