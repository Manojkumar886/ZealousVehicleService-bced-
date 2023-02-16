package BikeService.ZealousBikeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/updatebikedetails")
	public String updatebike(@RequestBody BikeDetails bike)
	{
		BikeDetails temp=service.create(bike);
		return temp.getCusName()+"has been updated successfully";
	}
	
	@GetMapping("/listallbikedetails")
	public List<BikeDetails> listallbikedetails()
	{
		return service.MakeFetchAll();
	}
	@GetMapping("/")
	public String smaple()
	{
		return "welcome everyone";
	}
	
	@GetMapping("/listonebikedetail/{id}")
	public Optional<BikeDetails> readonebikedetail(@PathVariable("id")int id)
	{
		return service.makefetchone(id);
	}
	@DeleteMapping("/deletebybikedetails/{id}")
	public String  deleteabikedetail(@PathVariable("id")int id)
	{
		return service.deletebyid(id);
	}
}
