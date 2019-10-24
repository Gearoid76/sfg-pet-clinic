package sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public static class SfgPetClinicApplicationTests {

		@Test
		public void contextLoads() {
		}

	}
}
