package PrototypePattern;

public class Book {

	private int bid;
	private String bookname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookname=" + bookname + "]";
	}

	
	
	
}
