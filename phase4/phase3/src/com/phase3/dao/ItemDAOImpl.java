package com.phase3.dao;

import com.phase3.models.Item;
import com.phase3.util.HibernateUtil;
import com.phase3.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemDAOImpl implements ItemDAO {
	public ItemDAOImpl() {
		System.out.println("ItemDAOImpl");
		}

		@Autowired
		private HibernateUtil hibernateUtil;

		@Override
		public long createItem(Item item) { 
		return (Long) hibernateUtil.create(item);
		}

		@Override
		public Item updateItem(Item item) { 
		return hibernateUtil.update(item);
		}

		@Override
		public void deleteItem(long id) {
		Item item = new Item();
		item.setId(id);
		hibernateUtil.delete(item);
		}

		@Override
		public List<Item> getAllItems() { 
		return hibernateUtil.fetchAll(Item.class);
		}

		@Override
		public Item getItem(long id) {
		return hibernateUtil.fetchById(id, Item.class);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Item> getAllItems(String itemName) { 
		String query = "SELECT e.* FROM Items e WHERE e.name like '%"+ itemName +"%'";
		List<Object[]> itemObjects = hibernateUtil.fetchAll(query);
		List<Item> items = new ArrayList<Item>();
		for(Object[] itemObject: itemObjects) {
		Item item = new Item();
		long id = ((BigInteger) itemObject[0]).longValue(); 
		int price = (int) itemObject[1];
		String name = (String) itemObject[2];
		String description = (String) itemObject[3];
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setDescription(description);
		items.add(item);
		}
		System.out.println(items);
		return items;
		}

}
