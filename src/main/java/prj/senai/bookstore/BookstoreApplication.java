package prj.senai.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import prj.senai.bookstore.service.DBService;

@SpringBootApplication
public class BookstoreApplication{// implements CommandLineRunner {

	@Autowired
	DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.dbService.instanciaBaseDeDados();
	}*/
}
