public interface PayD {
    void setCardNumber(long cardNumber);
    void setCardHolderName(String cardHolderName);
    void setExpiryMonth(int expiryMonth);
    void setExpiryYear(int expiryYear);
    void setCVV(int cvv);
    void setTransactionAmount(double amount);
}