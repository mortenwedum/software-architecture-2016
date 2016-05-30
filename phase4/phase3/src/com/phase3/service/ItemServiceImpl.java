package com.phase3.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phase3.dao.ItemDAO;
import com.phase3.models.Item;
import com.phase3.service.ItemService;

import java.util.List;
@Service
@Transactional
public class ItemServiceImpl implements ItemService{
	public ItemServiceImpl() {
		System.out.println("ItemServiceImpl()");
		}

		@Autowired
		private ItemDAO itemDAO;

		@Override
		public long createItem(Item item) {
		return itemDAO.createItem(item);
		}
		@Override
		public Item updateItem(Item item) {
		return itemDAO.updateItem(item);
		}
		@Override
		public void deleteItem(long id) {
		itemDAO.deleteItem(id);
		}
		@Override
		public List<Item> getAllItems() {
		return itemDAO.getAllItems();
		}
		@Override
		public Item getItem(long id) {
		return itemDAO.getItem(id);
		} 
		@Override
		public List<Item> getAllItems(String itemName) {
		return itemDAO.getAllItems(itemName);
		}
}
