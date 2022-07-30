package pl.coderslab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface BookService {
    List<Book> getBooks();
    void add(Book book);

}
