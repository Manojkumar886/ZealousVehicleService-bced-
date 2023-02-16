package BikeService.ZealousBikeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeDetailsService 
{
	
	@Autowired
	BikeDetailsRepositary repo;
	
	public BikeDetails create(BikeDetails bike)
	{
		return repo.save(bike);
	}
	public List<BikeDetails> MakeFetchAll()
	{
		return repo.findAll();
	}
	
	public Optional<BikeDetails> makefetchone(int id)
	{
		return repo.findById(id);
	}
	public String deletebyid(int id)
	{
		BikeDetails temp=repo.findById(id).orElse(new BikeDetails());
		repo.delete(temp);
		return temp.getCusName()+"has been deleted successfully";
	}

}
