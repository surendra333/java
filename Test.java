package com.techouts.bean;

import java.util.ArrayList;
import java.util.List;

import com.techouts.entity.HotelsBooking;

/**
 * @author Surender
 * @since
 */
/**
 * @author Surender
 *
 */
public class Test {
	static HotelsBooking booking;
	static List<HotelsBooking> list = new ArrayList<>();
	
	public static void main(String[] args) {
		booking = new HotelsBooking();
		setPrice(booking);
		list.add(booking);
		System.out.println("price..."+booking.getPrice() + " Qty ::"+booking.getQuantity());
		System.out.println("List Size::"+list.size() );
	}

	
	/**
	 * @param booking
	 * @return
	 */
	private static  HotelsBooking setPrice(HotelsBooking booking) {
		
		//booking.setPrice(200.00);
		booking.setPrice(400.00);
		booking.setQuantity(10);
		// overriding
		return booking;
	}

	
}
