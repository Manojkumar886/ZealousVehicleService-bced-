package BikeService.ZealousBikeservice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Table(name ="BikeServiceModule")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
	private int bikeFinalamount;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnoreProperties(value = {"service_details","hibernateLazyInitializer"})
	@JoinColumn(name = "bikeCustomerid")
	private BikeDetails bikeDetails1;
	
	
}
