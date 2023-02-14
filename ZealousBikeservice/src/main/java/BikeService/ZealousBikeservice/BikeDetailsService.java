package BikeService.ZealousBikeservice;

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

}
