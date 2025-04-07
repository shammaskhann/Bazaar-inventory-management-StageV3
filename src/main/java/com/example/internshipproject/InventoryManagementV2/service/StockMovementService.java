package com.example.internshipproject.InventoryManagementV2.service;

import com.example.internshipproject.InventoryManagementV2.entities.StockMovement;
import com.example.internshipproject.InventoryManagementV2.entities.StockMovementMessage;
import com.example.internshipproject.InventoryManagementV2.repositories.StockMovementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockMovementService {

    @Autowired
    StockMovementRepository stockMovementRepository;

    public void processStockMovement(StockMovementMessage message) {
        StockMovement entity = new StockMovement();
        // map fields
        entity.setProduct(message.getProduct());
        entity.setStore(message.getStore());
        entity.setQuantity(message.getQuantity());
        entity.setUser(message.getUser());
        entity.setChangeType(message.getChangeType());
        entity.setMovementTime(message.getMovementTime());

        stockMovementRepository.save(entity); // This hits the master DB
    }
}
