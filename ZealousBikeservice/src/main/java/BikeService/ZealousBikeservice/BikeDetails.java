package BikeService.ZealousBikeservice;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class BikeDetails 
{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	private String cusBikeno;
	private String cusName;
	private long cusContactno;
	private String cusEmail;
	@JsonFormat(pattern = 	"yyyy-mm-dd")
	private Date cusDateofpurchase;//(dd-mm-yyyy)
	public BikeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BikeDetails(int cusId, String cusBikeno, String cusName, long cusContactno, String cusEmail,
			Date cusDateofpurchase) {
		super();
		this.cusId = cusId;
		this.cusBikeno = cusBikeno;
		this.cusName = cusName;
		this.cusContactno = cusContactno;
		this.cusEmail = cusEmail;
		this.cusDateofpurchase = cusDateofpurchase;
	}
	@Override
	public String toString() {
		return "BikeDetails [cusId=" + cusId + ", cusBikeno=" + cusBikeno + ", cusName=" + cusName + ", cusContactno="
				+ cusContactno + ", cusEmail=" + cusEmail + ", cusDateofpurchase=" + cusDateofpurchase + "]";
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusBikeno() {
		return cusBikeno;
	}
	public void setCusBikeno(String cusBikeno) {
		this.cusBikeno = cusBikeno;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public long getCusContactno() {
		return cusContactno;
	}
	public void setCusContactno(long cusContactno) {
		this.cusContactno = cusContactno;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public Date getCusDateofpurchase() {
		return cusDateofpurchase;
	}
	public void setCusDateofpurchase(Date cusDateofpurchase) {
		this.cusDateofpurchase = cusDateofpurchase;
	}
	

}
