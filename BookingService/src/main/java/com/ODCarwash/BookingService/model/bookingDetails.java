package com.ODCarwash.BookingService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Bookingdetailsdb")
public class bookingDetails {		
	
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private Long id;
	
	private String CarName;

	private String Model;

	private String washpackName;
	
	private int washpackId;
	
	private String Date;

	private long contact;

	public bookingDetails(Long id, String carName, String model, String washpackName, int washpackId, String date,
			long contact) {
		super();
		this.id = id;
		CarName = carName;
		Model = model;
		this.washpackName = washpackName;
		this.washpackId = washpackId;
		Date = date;
		this.contact = contact;
	}

	public bookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getWashpackName() {
		return washpackName;
	}

	public void setWashpackName(String washpackName) {
		this.washpackName = washpackName;
	}

	public int getWashpackId() {
		return washpackId;
	}

	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	@Override
	public String toString() {
		return "bookingDetails [id=" + id + ", CarName=" + CarName + ", Model=" + Model + ", washpackName="
				+ washpackName + ", washpackId=" + washpackId + ", Date=" + Date + ", contact=" + contact + "]";
	}

	
}
