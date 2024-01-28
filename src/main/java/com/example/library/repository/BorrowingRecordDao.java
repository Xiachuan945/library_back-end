package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.library.entity.BorrowingRecord;
@Repository
public interface BorrowingRecordDao extends JpaRepository<BorrowingRecord, Integer> {

}
