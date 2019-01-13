package com.goquality.storage.service;

import java.util.Optional;

import com.goquality.storage.domain.Storage;

public interface StorageService {
	
	Optional<Storage> findById(Long id);

}
