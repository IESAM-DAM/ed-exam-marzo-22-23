package com.iesam.openbank.domain;

public class GetCustomerUseCase {
    private final BankRepository bankRepository;

    public GetCustomerUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public Customer execute(String dni){
        return this.bankRepository.getCustomer(dni);
    }
}