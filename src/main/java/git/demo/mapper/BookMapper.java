package git.demo.mapper;

import git.demo.domain.book.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {

    void insertBook(Book book);

    Book findBookById(Long bookId);

    Book findBookByName(String bookName);

    List<Book> findAllBook();

    void updateBook(@Param("id")Long id, @Param("bookName")String bookName, @Param("price")Integer price, @Param("quantity")Integer quantity);

    void deleteBook(Long bookId);

    void deleteAllBook();

}
