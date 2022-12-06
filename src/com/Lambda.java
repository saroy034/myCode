package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Product arg0) {
		// TODO Auto-generated method stub
		return this.name.compareTo(arg0.name);
	}

}

public class Lambda {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

		Collections.sort(list);

		System.out.println("Sorting on the basis of comparator...");
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

		System.out.println("Sorting on the basis of lambda...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}
}
