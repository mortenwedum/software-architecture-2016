package com.phase3.service;

import java.util.List;
import com.phase3.models.Item;

public interface ItemService {
	public long createItem(Item item);
	public Item updateItem(Item item);
	public void deleteItem(long id);
	public List<Item> getAllItems();
	public Item getItem(long id); 
	public List<Item> getAllItems(String itemName);
}
