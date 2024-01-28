package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.Inventory;

@Repository
public interface InventoryDao extends JpaRepository<Inventory, Integer>{

}
