public class XpayImpl implements Xpay {
    private String creditCardNo;
    private String customerName;
    private int cardExpMonth;
    private int cardExpYear;
    private String cardCVVNo;
    private double amount;

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(String cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCardExpMonth() {
        return cardExpMonth;
    }

    public int getCardExpYear() {
        return cardExpYear;
    }

    public String getCardCVVNo() {
        return cardCVVNo;
    }

    public double getAmount() {
        return amount;
    }
}