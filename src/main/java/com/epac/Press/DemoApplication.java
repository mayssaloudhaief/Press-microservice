package com.epac.Press;

import com.epac.Press.DAO.DbSequenceRepository;
import com.epac.Press.NotEntities.DbSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	DbSequenceRepository dbSequenceRepository;


	@Bean
public RestTemplate restTemplate(){
		return new RestTemplate();
}

	@Override
	public void run(String... args) throws Exception {
	DbSequence seqPress=dbSequenceRepository.findByLd("press");
		if(seqPress==null) {
		DbSequence Seq = new DbSequence("press", 1);
		dbSequenceRepository.save(Seq);
	}
	}

}


