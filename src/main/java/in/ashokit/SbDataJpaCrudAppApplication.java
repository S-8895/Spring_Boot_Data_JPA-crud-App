package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepo;

@SpringBootApplication
public class SbDataJpaCrudAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctex =SpringApplication.run(SbDataJpaCrudAppApplication.class, args);
		
		BookRepo repo= ctex.getBean(BookRepo.class);
		
		/*Book b = new Book();
		b.setBookId(100);
		b.setBookName("Spring Boot");
		b.setBookPrice(1200.00);
		repo.save(b);
		*/System.out.println("Record Inserted....");
		
		Optional<Book> findById = repo.findById(100);
		
		System.out.println(findById);
		
	}

}
