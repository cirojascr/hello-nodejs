package  net.baccredomatic.baclink.core.api.dto;


import java.util.List;

public class AuditDTO {

	private String consumer;
	private String transactionId;
	private String type;
	private List<AuditDetailDTO> detailList;

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AuditDetailDTO> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<AuditDetailDTO> detailList) {
		this.detailList = detailList;
	}

	@Override
	public String toString() {
		return "AuditDTO [consumer=" + consumer + ", transactionId=" + transactionId + ", detailList=" + detailList
				+ "]";
	}
}
