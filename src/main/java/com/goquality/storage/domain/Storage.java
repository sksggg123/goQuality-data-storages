package com.goquality.storage.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Storage extends AbstractPersistable<Long> {
	
	private String link;
	private String description;
	private String category;
	
	
	
}
