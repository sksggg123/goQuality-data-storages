package com.goquality.storage.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class StorageRepositoryTest {
	
	@Autowired
	StorageRepository repository;
	
	@Test
	public void testSave() {
		Storage storage = new Storage();
		storage.setLink("https://sksggg123.github.io/");
		storage.setDescription("개인블로그");
		storage.setCategory("private");
		
		assertThat(storage.isNew()).isTrue();
		
		repository.save(storage);
		
		assertThat(storage.isNew()).isFalse();
	}
	
	@Test
	public void testFindByLinkLike() {
		Storage storage = new Storage();
		storage.setLink("https://sksggg123.github.io/");
		storage.setDescription("개인블로그");
		storage.setCategory("private");
		
		repository.save(storage);
		
		List<Storage> storages = repository.findByLinkLike("sksggg123");
		assertThat(storages).isNotEmpty();
		
		storages = repository.findByLinkLike("integerous");
		assertThat(storages).isEmpty();
	}
	
}
