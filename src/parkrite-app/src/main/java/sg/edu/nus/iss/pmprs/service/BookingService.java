package sg.edu.nus.iss.pmprs.service;

/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.business.booking.DashDataBl;
import sg.edu.nus.iss.pmprs.business.booking.GetBookingsBl;
import sg.edu.nus.iss.pmprs.business.booking.GetBookingsByCarParkBl;
import sg.edu.nus.iss.pmprs.business.booking.GetTodayBookingBl;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.vo.booking.BookingVo;
import sg.edu.nus.iss.pmprs.vo.dashboard.DashBoardVo;

/**
 * This sample demonstrates how to make basic requests to Amazon SQS using the
 * AWS SDK for Java.
 * <p>
 * <b>Prerequisites:</b> You must have a valid Amazon Web Services developer
 * account, and be signed up to use Amazon SQS. For more information on Amazon
 * SQS, see http://aws.amazon.com/sqs.
 * <p>
 * <b>Important:</b> Be sure to fill in your AWS access credentials in the
 * AwsCredentials.properties file before you try to run this sample.
 * http://aws.amazon.com/security-credentials
 */
@Service
public class BookingService{

	@Autowired 
	DashDataBl dashBoardDataBl;
	
	@Autowired 
	GetBookingsByCarParkBl bookingBl;
	
	public DashDataBl getDashBoardDataBl() {
		return dashBoardDataBl;
	}

	public void setDashBoardDataBl(DashDataBl dashBoardDataBl) {
		this.dashBoardDataBl = dashBoardDataBl;
	}
//
//	public void book(BookCarPark carpark) {
//		BookingDao dao = new BookingDao(getEm());
//		dao.create(carpark);
//		//dao.closeConnection();
//		QueueMessageSender sender=new QueueMessageSender();
//		sender.setQueueId(carpark.getCarparkId());
//		sender.send(carpark);
//
//	}
//
//	public void updateBookingStatus(String reference,String status,String carParkLot)
//
//	{
//		BookingDao dao = new BookingDao(getEm());
//		BookCarPark book = dao.getByBookingRef(reference);
//		book.setBookinStatus(status);
//		book.setBookinRefId(reference);
//		dao.update(book);
//
//	}
//
//	public BookCarPark checkStatus(String reference)
//
//	{
//		BookingDao dao = new BookingDao(getEm());
//		return dao.getByBookingRef(reference);
//
//	}
	public List<BookCarPark> getAllBookings()
	{
		GetBookingsBl bl=new GetBookingsBl();
	
		bl.process();
		return bl.getResult();
	
	}

	public List<DashBoardVo> getDashBoardList()
	{
		//DashDataBl dashBoardDataBl=new DashDataBl();
	
		dashBoardDataBl.process();
		return dashBoardDataBl.getResult();
		
	}
	
	public List<BookingVo> getBookingsByCarPark(int carparkId)
	{
		bookingBl.setIntParam(carparkId);
		bookingBl.process();
		return bookingBl.getResult();
		
	}
	
	public List<BookCarPark> getTodayBookings(String carparkId)
	{
		GetTodayBookingBl bl=new GetTodayBookingBl();
	
		bl.setCarparkId(carparkId);
		bl.process();
		return bl.getResult();
		
	}
	
	public void book(BookCarPark carpark) {

//		CarParkDao dao = new CarParkDao(getEm());
//		dao.create(carpark);
//		//dao.closeConnection();
//		QueueMessageSender sender=new QueueMessageSender();
//		
//		String quid="DEAD_LETTER_QUEUE";
//		if(carpark.getCarparkId().equals("1"))
//		{
//			
//			quid="SCIENCE_PARK";
//		}
//		else if(carpark.getCarparkId().equals("2"))
//		{
//			
//			quid="INDUSTRIAL_PARK";
//		}
//		else if(carpark.getCarparkId().equals("3"))
//		{
//			
//			quid="VIVO";
//		}
//		sender.setQueueId(quid);
//		sender.send(carpark);

	}

	public void updateBookingStatus(String reference,String status,String carParkLot)

	{
//		CarParkDao dao = new CarParkDao(getEm());
//		BookCarPark book = dao.getByBookingRef(reference);
//		book.setBookinStatus(status);
//		book.setBookinRefId(reference);
//		dao.update(book);

	}

	public BookCarPark checkStatus(String reference)

	{
//		CarParkDao dao = new CarParkDao(getEm());
//		return dao.getByBookingRef(reference);
		return null;

	}
	
}
