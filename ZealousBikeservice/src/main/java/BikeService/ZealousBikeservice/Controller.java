package BikeService.ZealousBikeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@Autowired
	BikeDetailsService service;
	
	//http://locolhost:8080/createbikedetails
	@PostMapping("/createbikedetails")
	public String newbikedetails(@RequestBody BikeDetails bike)
	{
		return service.create(bike).getCusName()+"has been added successfully";
	}

}
