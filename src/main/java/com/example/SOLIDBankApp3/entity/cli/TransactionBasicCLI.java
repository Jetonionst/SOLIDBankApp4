package com.example.SOLIDBankApp3.entity.cli;

import com.example.SOLIDBankApp3.service.BankCore;
import com.example.SOLIDBankApp3.service.TransactionListingService;
import org.springframework.stereotype.Component;

@Component
public class TransactionBasicCLI {

    private BankCore bankCore;
    private TransactionListingService transactionListingService;

    public TransactionBasicCLI(TransactionListingService transactionListingService, BankCore bankCore) {
        this.transactionListingService = transactionListingService;
        this.bankCore = bankCore;
    }

    public void getClientTransactions(String clientID){
        System.out.println(transactionListingService.getClientTransactions(clientID));
    }
}
