package com.carrentalsystem.service;

/*
 * we can make booking class singleton, if we need only one instance
 */

import com.carrentalsystem.exception.BookingNotFoundException;
import com.carrentalsystem.exception.CancellationNotAllowedException;
import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.User;
import com.carrentalsystem.repository.BookingRepository;
import com.carrentalsystem.repository.UserRepository;

import java.util.Date;
import java.util.List;

public class BookingService {

  private final BookingRepository bookingRepository = new BookingRepository();
  private final UserRepository userRepository = new UserRepository();

  public void bookVehicle(User user, Booking booking) {

    boolean isBooked = bookingRepository.createBooking(booking);
    if (isBooked) {
      userRepository.addBookingToUser(user, booking);
      System.out.println("Booking Successful");
    } else System.out.println("Booking Unsuccessful......");
  }

  // think of implementing using strategy pattern and do
  public void returnBooking(Booking booking, Date returnDate) {}

  public void cancelBooking(Booking booking, Date cancelDate)
      throws CancellationNotAllowedException, BookingNotFoundException {

    // check if cancel date is prior to the date of start of booking, if no then cancellation not
    // allowed;
    // if the booking is not in records throw exception
    if (cancelDate.after(booking.getBookingDate())) {
      throw new CancellationNotAllowedException("Cancellation Not Allowed");
    }
    bookingRepository.deleteBooking(booking);
  }

  public List<Booking> getAll() {
    return bookingRepository.getAll();
  }
}
