package com.picpayproject.apiresfull.repositories;

import com.picpayproject.apiresfull.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction, Long> {
}
