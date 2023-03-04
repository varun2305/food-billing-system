
public class OrderList 
{
	private Menu menuObj = null;
	
	private int quantity = 0;
	
	private int total = 0;

	public Menu getMenuObj() 
	{
		return menuObj;
	}

	public void setMenuObj(Menu menuObj) 
	{
		this.menuObj = menuObj;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	public int getTotal()
	{
		return total;
	}

	public void setTotal(int total)
	{
		this.total = total;
	}
}
