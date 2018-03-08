package am.lad.shop.other;

/**
 * Created by David on 3/8/2018.
 */
public class PaymentMethods {

    private BankCard bankCard;
    private BankTransfer bankTransfer;

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public BankTransfer getBankTransfer() {
        return bankTransfer;
    }

    public void setBankTransfer(BankTransfer bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    private static class BankCard {

        private String cardNumber;
        private String cardCVS;
        private String cardValidationDate;
        private String cardOwner;

        public BankCard(String cardNumber, String cardCVS, String cardValidationDate, String cardOwner) {
            this.cardNumber = cardNumber;
            this.cardCVS = cardCVS;
            this.cardValidationDate = cardValidationDate;
            this.cardOwner = cardOwner;
        }
    }

    private static class BankTransfer {

    }
}
