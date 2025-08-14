package ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Service;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {
    public String generatePaymentLink(Long orderId) throws RazorpayException, StripeException;
}
