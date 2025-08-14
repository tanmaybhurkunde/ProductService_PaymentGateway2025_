package ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.configs;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayClientConfig {
    @Value("${razorpay.key.id}")
    private String razorpayKeyId ;

    @Value("${razorpay.key.secret}")
    private String getRazorpayKeySecret ;

    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return new RazorpayClient(razorpayKeyId, getRazorpayKeySecret);
    }
}
