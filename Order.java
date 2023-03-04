import java.util.ArrayList;
import java.util.Scanner;
public class Order extends Menu {	 
	 public static void addToCart()
	 {
		 System.out.println("Order Please !!");
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the no of orders: ");
		 
		 int no_of_orders = input.nextInt();
		 
		 ArrayList<OrderList> soru = Bean.soru;
		 
		 for(int i=0; i < no_of_orders;i++)
		 {
			 int itemIndex = i + 1;
			 
			 System.out.println("Enter the Item No "+ itemIndex +":");
			 
             int itemNo = input.nextInt();
             
             Menu itemMatched = checkMatch(itemNo);
             
             if(itemMatched != null)
       		  {
       			
       			  OrderList orderList = new OrderList();
       			  
            	  orderList.setMenuObj(itemMatched);
       			  
       			  System.out.println("Enter the quantity :");
       			  
                  int quantity = input.nextInt();
                  
                  orderList.setQuantity(quantity);
                  
                  soru.add(orderList);
                  
       		  }
              else
              {
       			 System.out.println("Please enter valid item number");
       			 
       			 i--;
	       	  }
		 }
		 
		 System.out.println("Order Taken Is Completed !!!");
	 }
	 
	 public static Menu checkMatch(int itemNo)
	 {
		 ArrayList<Menu> menuCard = Bean.menuCard;
		 
		 for(int menuCardIndex = 0; menuCardIndex < menuCard.size(); menuCardIndex++)
      	  {
      		  Menu _menu = menuCard.get(menuCardIndex);
      		  
      		  if(_menu.getItemNo() == itemNo)
      		  {
      			return _menu;
      		  }
      	  }
		 
		 return null;
	 }
}
