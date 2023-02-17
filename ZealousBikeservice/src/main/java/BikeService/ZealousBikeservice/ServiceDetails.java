package BikeService.ZealousBikeservice;

import java.util.Arrays;
import java.util.Date;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Table(name ="BikeServiceModule")
public class ServiceDetails 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeJobcardno;
	private String[] bikeIssues;
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date bikeDateofservice;
	private int bikeKilometer;
	private String bikeStatus;
	private String bikeTypeofservice;
	private int bikeEstimatecharge;
	private int bikeNewproductcost;
	private int bikeLabourcharge;
	@Column(name = "bikeTotalamount")
	private int bikeFinalamount;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "bikeCustomerid")
	private BikeDetails Bikedetails1;
	public ServiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceDetails(int bikeJobcardno, String[] bikeIssues, Date bikeDateofservice, int bikeKilometer,
			String bikeStatus, String bikeTypeofservice, int bikeEstimatecharge, int bikeNewproductcost,
			int bikeLabourcharge, int bikeFinalamount, BikeDetails bikedetails1) {
		super();
		this.bikeJobcardno = bikeJobcardno;
		this.bikeIssues = bikeIssues;
		this.bikeDateofservice = bikeDateofservice;
		this.bikeKilometer = bikeKilometer;
		this.bikeStatus = bikeStatus;
		this.bikeTypeofservice = bikeTypeofservice;
		this.bikeEstimatecharge = bikeEstimatecharge;
		this.bikeNewproductcost = bikeNewproductcost;
		this.bikeLabourcharge = bikeLabourcharge;
		this.bikeFinalamount = bikeFinalamount;
		Bikedetails1 = bikedetails1;
	}
	@Override
	public String toString() {
		return "ServiceDetails [bikeJobcardno=" + bikeJobcardno + ", bikeIssues=" + Arrays.toString(bikeIssues)
				+ ", bikeDateofservice=" + bikeDateofservice + ", bikeKilometer=" + bikeKilometer + ", bikeStatus="
				+ bikeStatus + ", bikeTypeofservice=" + bikeTypeofservice + ", bikeEstimatecharge=" + bikeEstimatecharge
				+ ", bikeNewproductcost=" + bikeNewproductcost + ", bikeLabourcharge=" + bikeLabourcharge
				+ ", bikeFinalamount=" + bikeFinalamount + ", Bikedetails1=" + Bikedetails1 + "]";
	}
	public int getBikeJobcardno() {
		return bikeJobcardno;
	}
	public void setBikeJobcardno(int bikeJobcardno) {
		this.bikeJobcardno = bikeJobcardno;
	}
	public String[] getBikeIssues() {
		return bikeIssues;
	}
	public void setBikeIssues(String[] bikeIssues) {
		this.bikeIssues = bikeIssues;
	}
	public Date getBikeDateofservice() {
		return bikeDateofservice;
	}
	public void setBikeDateofservice(Date bikeDateofservice) {
		this.bikeDateofservice = bikeDateofservice;
	}
	public int getBikeKilometer() {
		return bikeKilometer;
	}
	public void setBikeKilometer(int bikeKilometer) {
		this.bikeKilometer = bikeKilometer;
	}
	public String getBikeStatus() {
		return bikeStatus;
	}
	public void setBikeStatus(String bikeStatus) {
		this.bikeStatus = bikeStatus;
	}
	public String getBikeTypeofservice() {
		return bikeTypeofservice;
	}
	public void setBikeTypeofservice(String bikeTypeofservice) {
		this.bikeTypeofservice = bikeTypeofservice;
	}
	public int getBikeEstimatecharge() {
		return bikeEstimatecharge;
	}
	public void setBikeEstimatecharge(int bikeEstimatecharge) {
		this.bikeEstimatecharge = bikeEstimatecharge;
	}
	public int getBikeNewproductcost() {
		return bikeNewproductcost;
	}
	public void setBikeNewproductcost(int bikeNewproductcost) {
		this.bikeNewproductcost = bikeNewproductcost;
	}
	public int getBikeLabourcharge() {
		return bikeLabourcharge;
	}
	public void setBikeLabourcharge(int bikeLabourcharge) {
		this.bikeLabourcharge = bikeLabourcharge;
	}
	public int getBikeFinalamount() {
		return bikeFinalamount;
	}
	public void setBikeFinalamount(int bikeFinalamount) {
		this.bikeFinalamount = bikeFinalamount;
	}
	public BikeDetails getBikedetails1() {
		return Bikedetails1;
	}
	public void setBikedetails1(BikeDetails bikedetails1) {
		Bikedetails1 = bikedetails1;
	}

}
