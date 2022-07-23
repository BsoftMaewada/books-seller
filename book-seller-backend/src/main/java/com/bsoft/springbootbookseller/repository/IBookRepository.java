package com.bsoft.springbootbookseller.repository;

import com.bsoft.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository <Book, Long> {


}
