package ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Controllers;

import ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Dtos.GeneratePaymentLinkRequestDto;
import ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Service.PaymentService;
import ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Service.RazorpayPaymentGateway;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(@Qualifier("stripePaymentGateway") PaymentService paymentService){
        this.paymentService = paymentService ;
    }

    @PostMapping("")
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkRequestDto requestDto) throws RazorpayException, StripeException {
        // we should handle the exception using the controller Advices
        return paymentService.generatePaymentLink(requestDto.getOrderid()) ;
    }

    @PostMapping("/webhook")
    public void handleWebhookEvent(){
        System.out.println("webhook trigered");
    }
}
