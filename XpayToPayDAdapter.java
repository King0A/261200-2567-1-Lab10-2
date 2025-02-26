public class XpayToPayDAdapter implements PayD {
    private XpayImpl xpay;

    public XpayToPayDAdapter(XpayImpl xpay) {
        this.xpay = xpay;
    }

    @Override
    public long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public String getCustomerName() {
        return xpay.getCustomerName();
    }

    @Override
    public int getCardExpMonth() {
        return xpay.getCardExpMonth();
    }

    @Override
    public int getCardExpYear() {
        return xpay.getCardExpYear();
    }

    @Override
    public int getCardCVVNo() {
        return xpay.getCardCVVNo();
    }

    @Override
    public double getAmount() {
        return xpay.getAmount();
    }
}