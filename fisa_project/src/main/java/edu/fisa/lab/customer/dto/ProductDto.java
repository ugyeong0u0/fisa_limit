package edu.fisa.lab.customer.dto;

import edu.fisa.lab.model.domain.Category;
import edu.fisa.lab.model.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProductDto {

	private String productName;
	private int price;
	private String brand;
	private int size;
	private String classify; 
	private Category category;

	public Product toEntity(ProductDto productDto) {
		return Product.builder()
				.productName(productDto.getProductName())
				.price(Integer.valueOf(productDto.getPrice()))
				.brand(productDto.getBrand())
				.size(Integer.valueOf(productDto.getSize()))
				.category(productDto.getCategory())
				.build();	
	}
	
	
	public ProductDto toDto(Product product) {
		return ProductDto.builder()
				.productName(product.getProductName())
				.price(product.getPrice())
				.brand(product.getBrand())
				.size(product.getSize())
				.category(product.getCategory())
				.build();
	}


	public ProductDto(String productName, int price, String brand, int size, Category category) {
		super();
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		this.size = size;
		this.category = category;
	}
	
	
}
