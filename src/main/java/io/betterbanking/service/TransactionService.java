package io.betterbanking.service;

import io.betterbanking.entity.Transaction;
import io.betterbanking.repository.MerchantDetailsRepository;
import io.betterbanking.repository.TransactionApiClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    public TransactionService(
            final TransactionApiClient transactionApiClient,
            final MerchantDetailsRepository merchantDetailsRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
    }

    @CircuitBreaker(name = "transactionService", fallbackMethod = "foundNone")
    public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
        var transactions= transactionApiClient.findAllByAccountNumber(accountNumber);
        transactions.forEach(transaction -> {
            merchantDetailsRepository.findMerchantLogo(transaction.getMerchantName()).ifPresent(logo -> {
                transaction.setMerchantLogo(logo);
            });
        });

        return transactions;
    }

    private List<Transaction> foundNone(final Integer accountNumber, final Throwable throwable) {
        return Collections.emptyList();
    }

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;
}
