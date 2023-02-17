package BikeService.ZealousBikeservice;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ZealousBikeserviceApplicationTests {

	@MockBean
	BikeDetailsRepositary repo;
	@Autowired
	BikeDetailsService service;

	@Test
	public void test1()
	{
		 Date d = new Date(1999, 2, 28);
		BikeDetails bike=new BikeDetails(1,"TN34V6767","Manojkumar",9789355930L,"manoj@gmail.com",d,null);

	when(repo.findAll()).thenReturn(Stream.of(bike).collect(Collectors.toList()));
	
	assertNotSame((d), service.MakeFetchAll().get(0).getCusDateofpurchase());
//	assertNull(service.MakeFetchAll());

	}
}
