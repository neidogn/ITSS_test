package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.invoice.Invoice;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;

import java.io.IOException;
import java.sql.SQLException;


public interface InterbankInterface {

	public abstract String getUrlPayOrder(int amount);

	public abstract PaymentTransaction paypalPayOrder(Invoice invoice, String contents) throws IOException, SQLException;

	public abstract void refundOrder(Invoice invoice) throws IOException, SQLException;

}
