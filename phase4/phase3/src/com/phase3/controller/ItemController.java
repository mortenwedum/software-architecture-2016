package com.phase3.controller;
import com.phase3.models.Item;
import com.phase3.service.ItemService;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ItemController {
	private static final Logger logger = Logger.getLogger(ItemController.class);

	public ItemController() {
	System.out.println("ItemController()");
	}

	@Autowired
	private ItemService itemService;

	@RequestMapping("createItem")
	public ModelAndView createItem(@ModelAttribute Item item) {
	logger.info("Creating Item. Data: "+item);
	return new ModelAndView("itemForm");
	}

	@RequestMapping("editItem")
	public ModelAndView editItem(@RequestParam long id, @ModelAttribute Item item) {
	logger.info("Updating the Item for the Id "+id);
	item = itemService.getItem(id);
	return new ModelAndView("itemForm", "itemObject", item);
	}

	@RequestMapping("saveItem")
	public ModelAndView saveItem(@ModelAttribute Item item) {
	logger.info("Saving the Item. Data : "+item);
	if(item.getId() == 0){
	itemService.createItem(item);
	} else {
	itemService.updateItem(item);
	}
	return new ModelAndView("redirect:getAllItems");
	}

	@RequestMapping("deleteItem")
	public ModelAndView deleteItem(@RequestParam long id) {
	logger.info("Deleting the Item. Id : "+id);
	itemService.deleteItem(id);
	return new ModelAndView("redirect:getAllItems");
	}

	@RequestMapping(value = {"getAllItems"})
	public ModelAndView getAllItems() {
	logger.info("Getting the all Employees.");
	List<Item> itemList = itemService.getAllItems();
	return new ModelAndView("itemList", "itemList", itemList);
	}

	@RequestMapping("searchItem")
	public ModelAndView searchItem(@RequestParam("searchName") String searchName) { 
	logger.info("Searching the Item. Item Names: "+searchName);
	List<Item> itemList = itemService.getAllItems(searchName);
	return new ModelAndView("itemList", "itemList", itemList); 
	}
}
