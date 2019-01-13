package com.goquality.storage.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.goquality.storage.domain.Storage;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class StorageServiceTest {
	
	@Autowired
	StorageService storageService;
	
	@Test(expected=RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		storageService.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
	}

}
