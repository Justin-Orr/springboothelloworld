package com.example.springboothelloworld.account.service;

import com.example.springboothelloworld.account.domain.Account;
import com.example.springboothelloworld.account.repository.AccountRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountManagerService {

    private final AccountRepository accountRepository;

    public AccountManagerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(String name) {
        return accountRepository.insertAccount(new Account(UUID.randomUUID(), name));
    }

    public List<Account> getAccounts() {
        return accountRepository.getAccounts();
    }

    public Account getAccount(UUID id) {
        return accountRepository.findAccount(id);
    }

    public Account updateAccount(Account account) {
        return accountRepository.updateAccount(account);
    }

    public Account deleteAccount(UUID id) {
        return accountRepository.deleteAccount(id);
    }

}
