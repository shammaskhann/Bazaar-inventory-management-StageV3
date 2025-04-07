package com.example.internshipproject.InventoryManagementV2.service;

import com.example.internshipproject.InventoryManagementV2.entities.Store;
import com.example.internshipproject.InventoryManagementV2.repositories.StoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Transactional(readOnly = true)
    public Store findStoreById(Long Id){
        log.info("findStoreById");
        Store store = storeRepository.findStoreById(Id).orElse(null);
        log.info("findStoreById", store);
        return store;
    }

}
