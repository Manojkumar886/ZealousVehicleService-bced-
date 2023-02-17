package BikeService.ZealousBikeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDetailsRepositary extends JpaRepository<ServiceDetails, Integer>
{
	

}
