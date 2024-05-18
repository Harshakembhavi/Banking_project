package com.example.bank.bankingapp.mapper;

import com.example.bank.bankingapp.dto.AccountDto;
import com.example.bank.bankingapp.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account=new Account(accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance());
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(account.getId(),
                account.getAccountHolderName(),
                account.getBalance());
        return accountDto;
    }
}
