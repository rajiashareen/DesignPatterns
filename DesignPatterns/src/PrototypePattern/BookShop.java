package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop  implements Cloneable{
	private String ShopName;
	private List<Book> Book =new ArrayList<>();
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public List<Book> getBook() {
		return Book;
	}
	public void setBook(List<Book> book) {
		Book = book;
	}
	@Override
	public String toString() {
		return "BookShop [ShopName=" + ShopName + ", Book=" + Book + "]";
	}

	
	
	public void loadData()
	{
		for(int i=0;i<10;i++)
		{
			Book b =new Book();
			b.setBid(i);
			b.setBookname("Book"+i);
			getBook().add(b);
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop bs=new BookShop();
		//fetching data from previous object instead of database
		for(Book b: this.getBook())
		{
		
			bs.getBook().add(b);
		}
		return bs;
		
	}
	
	

}
