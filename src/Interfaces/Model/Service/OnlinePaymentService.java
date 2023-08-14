package Interfaces.Model.Service;

import Interfaces.Model.Entities.Contract;

public interface OnlinePaymentService {
    Double paymentFee(Double amount);
    Double interest(Double amount, Integer months);
}
