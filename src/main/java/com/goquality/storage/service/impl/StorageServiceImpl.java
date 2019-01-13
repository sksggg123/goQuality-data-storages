package com.goquality.storage.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.goquality.storage.domain.Storage;
import com.goquality.storage.domain.StorageRepository;
import com.goquality.storage.service.StorageService;

@Service
@Transactional
public class StorageServiceImpl implements StorageService {
	
	private final StorageRepository storageRepository;
	
	public StorageServiceImpl(StorageRepository storageRepository) {
		this.storageRepository = storageRepository;
	}

	@Override
	public Optional<Storage> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
