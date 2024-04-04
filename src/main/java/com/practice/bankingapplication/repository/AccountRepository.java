package com.practice.bankingapplication.repository;

import com.practice.bankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
