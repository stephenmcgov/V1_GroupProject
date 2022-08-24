
public class Product {
	private String productName;
	private String productDesc;
	private double productPrice;
	private int stockCount;
	private String imageLink;
	
	public Product(String productName, String productDesc, double productPrice, int stockCount, String imageLink) {
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.stockCount = stockCount;
		this.imageLink = imageLink;
	}
	
	public Product() {
		//empty obj
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getStockCount() {
		return stockCount;
	}

	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
}
