package Interfaces.Model.Service;

import Interfaces.Model.Entities.Contract;
import Interfaces.Model.Entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService PaymentService;

    public ContractService(OnlinePaymentService paymentService) {
        PaymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double installmentsValue = contract.getTotalValue() / months;
        double installmentsValueInterest = contract.getTotalValue() / months;
        int monthCount = 1;

        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i + 1);
            installmentsValue = installmentsValue + (installmentsValue * 0.01 * monthCount);
            Installment installment = new Installment(dueDate, PaymentService.paymentFee(installmentsValue) + PaymentService.interest(installmentsValueInterest, monthCount) + installmentsValueInterest);
            contract.addItem(installment);
            monthCount += 1;
        }
//        CORREÇÃO:
//        double basicQuota = contract.getTotalValue() / months;
//        for (int i = 1; i <= months; i++) {
//            LocalDate dueDate = contract.getDate().plusMonths(i);
//            double interest = onlinePaymentService.interest(basicQuota, i);
//            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
//            double quota = basicQuota + interest + fee;
//            contract.getInstallments().add(new Installment(dueDate, quota));
//        }
    }
}
