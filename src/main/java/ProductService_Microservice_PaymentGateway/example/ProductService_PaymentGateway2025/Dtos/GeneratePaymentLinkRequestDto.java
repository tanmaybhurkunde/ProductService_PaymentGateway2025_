package ProductService_Microservice_PaymentGateway.example.ProductService_PaymentGateway2025.Dtos;

//import lombok.Getter;
//import lombok.Setter;


public class GeneratePaymentLinkRequestDto {
    private Long orderid ;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
}
