package learning_jdbc;

public class Order {
	private int id;
	private String code;
	private String orderDate;
	private String Region;
	private String rep;
	private String Item;
	private int units;
	private double unitCost;
	private double total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getRep() {
		return rep;
	}
	public void setRep(String rep) {
		this.rep = rep;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getUnitCost() {
		return unitCost;
	}
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		String message = "";
		
//		message = "------------------------\n";
//		message += String.format("%7s %7s %7s %7s %7s %7s %7s %7s ","Code", "Order Date", "Region", 
//				"Rep", "Item", "Units", "Unit Cost", "Total");
//		message += "\n";
		message += String.format("%7s %7s %7s %7s %7s %7s %7s %9s ", this.getCode(), this.getOrderDate(), this.getRegion(),
				this.getRep(), this.getItem(), this.getUnits(), this.getUnitCost(), this.getTotal());
//		message += "\n------------------------";
		return message;
	}

}
