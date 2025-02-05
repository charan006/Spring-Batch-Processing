package com.example.batch_processing_demo.config;

import com.example.batch_processing_demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {

//        pattern to add logic to the data being added to db
//        if(customer.getCountry().equals("India")){
//            return customer;
//        }else {
//            return null;
//        }

        return customer;
    }
}
