package com.example.SOLIDBankApp3.service.internal;

import com.example.SOLIDBankApp3.dao.TransactionRepository;
import com.example.SOLIDBankApp3.entity.transaction.Transaction;
import com.example.SOLIDBankApp3.service.TransactionListingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionListingServiceImpl implements TransactionListingService {
    private TransactionRepository transactionRepository;

    public TransactionListingServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getClientTransactions(String clientID) {
        return transactionRepository.getClientTransactions(clientID);
    }

    @Override
    public List<Transaction> getClientTransactionsByAccountID(String clientID, String accountID) {
        return transactionRepository.getClientTransactionsByAccountID(clientID, accountID);
    }

}
