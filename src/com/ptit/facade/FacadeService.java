package com.ptit.facade;

public class FacadeService {

    private static final FacadeService INSTANCE = new FacadeService();

    private final CustomerService customerService;
    private final PaymentService paymentService;
    private final OrderService orderService;

    public FacadeService() {
        this.customerService = new CustomerService();
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
    }

    public static FacadeService getInstance(){
        return INSTANCE;
    }

    public void order(String customerName, float total, String productName){
        customerService.getCustomerByName(customerName);
        paymentService.payByMomo(total);
        orderService.createOrder(productName);
    }
}
