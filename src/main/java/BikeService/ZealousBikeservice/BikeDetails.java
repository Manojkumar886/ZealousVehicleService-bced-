package BikeService.ZealousBikeservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
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
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@Nullable
	@JsonBackReference
	@JoinTable(name = "Allrecords",joinColumns = @JoinColumn(name="CustomerId"),inverseJoinColumns = @JoinColumn(name="Servicejobcardno"))
	private Collection<ServiceDetails> myservicedetails=new ArrayList<ServiceDetails>();
	

}