package in.seshujava.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.seshujava.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCatogery", path="book-catogery")
public interface BookCatogeryRepository extends JpaRepository<BookCategory, Long>{

}
