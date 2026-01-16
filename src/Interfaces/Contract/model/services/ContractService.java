package Interfaces.Contract.model.services;

import Interfaces.Contract.model.entities.Contract;
import Interfaces.Contract.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public OnlinePaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicQuota, i);
            double updatedQuota = basicQuota + interest;

            double fee = paymentService.paymentFee(updatedQuota);
            double fullQuota = updatedQuota + fee;

            contract.addInstallments(new Installment(dueDate, fullQuota));
        }
    }
}
