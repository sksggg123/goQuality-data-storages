package com.goquality.storage.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StorageRepository extends JpaRepository<Storage, Long> {
	
	List<Storage> findByLinkLike(String link);
	
}
