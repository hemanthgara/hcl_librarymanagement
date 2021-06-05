package com.library.demo.controller;

import com.library.demo.data.model.Book;
import com.library.demo.data.model.Order;
import com.library.demo.data.repository.BookRepository;
import com.library.demo.data.repository.OrderRepository;
import com.library.demo.service.bookservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "searchController", description = "This enpoints returns books, makesBooking, cancellation")
public class MyController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private OrderRepository orderRepository;

// API to get BOOKS

    @RequestMapping(value = "/addBooks", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "to get total number of books in library", response = List.class)
    public List<Book> getBooks() {
        List<Book> li = new ArrayList<Book>();
        bookRepository.findAll().forEach(li::add);
        return li;
    }

// API to add BOOKS

    @RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "to add new book in library", response = String.class)
    public void addBooks(@RequestBody List<Book> books) {
        System.out.println(books);
        bookRepository.saveAll(books);

    }

// get Book with details

    @RequestMapping(value = "/getBookingDetails", method = RequestMethod.GET,
            produces = "application/json")
    @ApiOperation(value = "to get total number of booking made", response = List.class)
    public List<Order> getBookingDetails() {
        List<Order> li = new ArrayList<Order>();
        orderRepository.findAll().forEach(li::add);
        return li;
    }

// Borrow book

    @RequestMapping(value = "/orderBook", method = RequestMethod.POST,
            produces = "application/json")
    @ApiOperation(value = "to take a book from library", response = String.class)
    public void makeBooking(@RequestBody Order orderDetails) {

        if(!order.getQuantity>3 ){

            orderRepository.save(orderDetails);
        }
    }

// return book

    @RequestMapping(value = "/returnBook", method = RequestMethod.PUT,
            produces = "application/json")
    @ApiOperation(value = "to return book back to the library", response = String.class)
    public void returnBooking(@RequestBody Order orderDetails) {

        @Column(name = "current_date)
        private Date current_date;

        int due = current_date - orderdetails.booking_date;

        int fine = order.orderdetails.charge();
        for ( int i=0 ; i< due ; i++)
        if(due> 3 && due <5){
            fine =  fine +20 ;

        } else if ( due > 5){
            fine =  fine +20 ;

        }
        order.setcharge(fine);
        orderRepository.save(orderDetails);
    }


    @RequestMapping(value = "/cancelBooking", method = RequestMethod.POST,
            produces = "application/json")
    @ApiOperation(value = "to cancel booking from library", response = String.class)
    public void cancelBooking(@RequestBody String orderDetails) {
        System.out.println(orderDetails.split(":")[0]);
        orderRepository.deleteByOrderId(orderDetails);


    }

}
