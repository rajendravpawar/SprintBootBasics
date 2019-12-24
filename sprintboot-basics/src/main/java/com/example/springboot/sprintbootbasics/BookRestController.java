/**
 * 
 */
package com.example.springboot.sprintbootbasics;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.sprintbootbasics.beans.Book;

/**
 * @author rajendra
 *
 */

@RestController
public class BookRestController {

	@GetMapping ("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(
				new Book(1L, "TestBook", "TestAuthor2")
				);
	}
}
