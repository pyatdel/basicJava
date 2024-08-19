package kr.or.ddit.book;

import lombok.Data;

@Data
public class BookVo {
	private String title;
	private String writer;
	private String publisher;
	private String pub_date;
	private String review;
	private String regula_price;
	private String sale_price;
	private String image;
	private String content;
	private String book_index;
	private String isbn13;
	private String isbn10;
}
