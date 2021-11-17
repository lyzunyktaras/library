package com.web.club3.dto;

import com.web.club3.model.Book;
import com.web.club3.model.User;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookOrderDTO {
    private int id;
    private User user;
    private Book book;
    private LocalDate lendingDate;
    private LocalDate returnDate;
}