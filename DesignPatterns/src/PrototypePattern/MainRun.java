package PrototypePattern;

public class MainRun {
	 public static void main(String[] args) {
		 
		 
		 BookShop bs=new BookShop();
		 bs.setShopName("Universal");
		 bs.loadData();
		 try {
			BookShop bs1=(BookShop) bs.clone();
			bs1.setShopName("wpr");
			 bs.getBook().remove(2);
			 System.out.println(bs);
			System.out.println(bs1);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
