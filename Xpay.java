public interface Xpay {
    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(int expMonth);
    void setCardExpYear(int expYear);
    void setCardCVVNo(String cvvNo);
    void setAmount(double amount);
}