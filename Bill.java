import java.util.ArrayList;

public class Bill 
{
	public static void generateBill()
	{
		int total = 0;
		
		ArrayList<OrderList> soru = Bean.soru;
		
		for(int i = 0; i < soru.size(); i++)
		{
			OrderList order = soru.get(i);
			
			total = total + ( order.getMenuObj().getPrice() * order.getQuantity());
		}
		
		System.out.println("The Total Bill Amount Is : "+total);
	}
}
