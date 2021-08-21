package com.luv2code.hibernate.demo.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@NamedQueries(value=
{
	
	@NamedQuery(
		name="findProductPriceByName",
		query="select price from Shopping where product=:name"
     ),
	@NamedQuery(
			name="findProductByid",
			query="select product from Shopping where id=:id"
	     )
	
}
)

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name="shopping")
public class Shopping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product")
	private String product;
	
	@Column(name="price")
	private String price;
	
	public Shopping() {
		
	}

	public Shopping(String product, String price) {
		super();
		this.product = product;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shopping [id=" + id + ", product=" + product + ", price=" + price + "]";
	}

}
