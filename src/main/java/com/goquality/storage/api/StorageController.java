package com.goquality.storage.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goquality.storage.domain.Storage;
import com.goquality.storage.service.StorageService;

@RestController
@RequestMapping("/storage")
public class StorageController {

	@Autowired
	StorageService storageService;

	@GetMapping("/{storageId}")
	public ResponseEntity<Storage> findAll(Long storageId) {
		Storage storage = storageService.findById(storageId).orElseThrow(() -> new RuntimeException("Not Found: " + storageId));
		
		return ResponseEntity.ok(storage);
	}
}
