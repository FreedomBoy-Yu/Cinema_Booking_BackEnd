package com.example.demo.mapper;

import com.example.demo.model.UserBook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserBookMapper {
    List<UserBook> findAllBookings();
    List<UserBook> findBookingsByUserId(Integer userId);
    void addBooking(UserBook userBook);
    void updateBooking(UserBook userBook);
    void deleteBooking(Integer id);
}
