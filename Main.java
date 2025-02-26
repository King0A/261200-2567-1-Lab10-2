public class Main {
    public static void main(String[] args) {
        // Create an instance of XpayImpl
        XpayImpl xpay = new XpayImpl();
        xpay.setCreditCardNo("1234567890123456");
        xpay.setCustomerName("John Doe");
        xpay.setCardExpMonth(12);
        xpay.setCardExpYear(2025);
        xpay.setCardCVVNo("123");
        xpay.setAmount(100.00);

        // Use the XpayToPayDAdapter to create a PayD object
        PayD payD = new XpayToPayDAdapter(xpay);

        // Demonstrate usage of PayD methods
        System.out.println("Processing payment through PayD:");
        System.out.println("Credit Card No: " + payD.getCreditCardNo());
        System.out.println("Customer Name: " + payD.getCustomerName());
        System.out.println("Expiration Date: " + payD.getCardExpMonth() + "/" + payD.getCardExpYear());
        System.out.println("CVV: " + payD.getCardCVVNo());
        System.out.println("Amount: " + payD.getAmount());
    }
}