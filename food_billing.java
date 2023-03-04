import java.util.ArrayList;
import java.util.Scanner;

public class food_billing {

	public static ArrayList<Menu> menuCard = Bean.menuCard;
	
	public static void declareMenu()
	{
		Menu menu1 = new Menu();
		
		menu1.setItemName("AAA");
		menu1.setItemNo(100);
		menu1.setPrice(100);
		menuCard.add(menu1);
		
		Menu menu2 = new Menu();
		
		menu2.setItemName("BBB");
		menu2.setItemNo(200);
		menu2.setPrice(200);
		menuCard.add(menu2);
		
		Menu menu3 = new Menu();
		
		menu3.setItemName("CCC");
		menu3.setItemNo(300);
		menu3.setPrice(300);
		menuCard.add(menu3);
		
		Bean.menuCard = menuCard;
	}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		new Bean();
		
		declareMenu();
        
        System.out.println("Menu Card");
        
	  	  for(int i = 0; i < menuCard.size(); i++)
	  	  {
	  		  Menu _menu = menuCard.get(i);
	  		  
	  		  System.out.println(_menu.getItemNo()+" "+_menu.getItemName()+"  "+_menu.getPrice());
	  	  }
  	  
		while (true)
		{
		  
          Order.addToCart();
                  
          Bill.generateBill();
          
          System.out.println("Press 1 to Continue...");
          
          int choice = input.nextInt();
          
          if(choice == 1)
          {
        	  new Bean();
        	  
        	  declareMenu();
        	  
        	  continue;
          }
          
          break;
       }
		
      System.out.println("THANKYOU FOR TRUSTING US WITH YOUR ORDER :)");
	}

}
