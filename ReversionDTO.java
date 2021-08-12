package  net.baccredomatic.baclink.core.api.dto;


import java.util.Collection;

import net.baccredomatic.baclink.core.model.Field;
import net.baccredomatic.baclink.core.model.PaymentsHis;

public class ReversionDTO {
	private PaymentsHis paymentsHis;
	private Collection<Field> views;


	public ReversionDTO() {}

	public ReversionDTO(PaymentsHis paymentsHis, Collection<Field> views) {
		super();
		this.paymentsHis = paymentsHis;
		this.views = views;
	}
	
	/**
	 * @return the paymentsHis
	 */
	public PaymentsHis getPaymentsHis() {
		return paymentsHis;
	}
	/**
	 * @return the views
	 */
	public Collection<Field> getViews() {
		return views;
	}
	/**
	 * @param paymentsHis the paymentsHis to set
	 */
	public void setPaymentsHis(PaymentsHis paymentsHis) {
		this.paymentsHis = paymentsHis;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(Collection<Field> views) {
		this.views = views;
	}	
	
}
