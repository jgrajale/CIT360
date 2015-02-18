package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
	@Id
    @GeneratedValue
    @Column(name="productID")
	private Integer productID;
	
	@Column(name="productCode")
	private String productCode;
	
	@Column(name="productName")
	private String productName;
	
	@ManyToOne
	@JoinColumn(name="categoryID")
	private Integer categoryID;
	
	public Products() {}

	public Products(Integer productID, Integer categoryID, String productCode,
			String productName, Integer priceID) {
		super();
		this.productID = productID;
		this.categoryID = categoryID;
		this.productCode = productCode;
		this.productName = productName;
		this.categoryID = priceID;
	}

	private Integer getProductID() {
		return productID;
	}

	private void setProductID(Integer productID) {
		this.productID = productID;
	}

	private String getProductCode() {
		return productCode;
	}

	private void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	private String getProductName() {
		return productName;
	}

	private void setProductName(String productName) {
		this.productName = productName;
	}

	private Integer getCategoryID() {
		return categoryID;
	}

	private void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}
	
	
	
}
