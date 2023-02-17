
package BikeService.ZealousBikeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDetailsService 
{
	@Autowired
	ServiceDetailsRepositary srepo;
	
	public ServiceDetails newservice(ServiceDetails service)
	{
		return srepo.save(service);
	}

}
