package com.phase3.dao;

import java.util.List;

import com.phase3.models.Item;

public interface ItemDAO {
	public long createItem(Item item);
	public Item updateItem(Item item);
	public void deleteItem(long id);
	public List<Item> getAllItems();
	public Item getItem(long id); 
	public List<Item> getAllItems(String itemName);
}
