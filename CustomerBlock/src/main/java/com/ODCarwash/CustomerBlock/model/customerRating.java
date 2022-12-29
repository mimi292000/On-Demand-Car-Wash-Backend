package com.ODCarwash.CustomerBlock.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratingdb")
public class customerRating {
		@Id
	     private String washername;
		 private int rating;
		 private String review;
		 
		 public customerRating() {
			super();
		}
		public customerRating(String washername, int rating, String review) {
			super();
			this.washername = washername;
			this.rating = rating;
			this.review = review;
		}
		public String getWashername() {
			return washername;
		}
		public void setWashername(String washername) {
			this.washername = washername;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getReview() {
			return review;
		}
		public void setReview(String review) {
			this.review = review;
		}
		@Override
		public String toString() {
			return "CustomerRating [washername=" + washername + ", rating=" + rating + ", review=" + review + "]";
		}
		 
		
}
