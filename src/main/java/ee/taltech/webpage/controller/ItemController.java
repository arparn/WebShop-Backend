package ee.taltech.webpage.controller;

import ee.taltech.webpage.items.Item;
import ee.taltech.webpage.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("items")
@RestController
public class ItemController {

    @Autowired
    private ItemsService itemsService;


    @GetMapping()
    public List<Item> getItems() {
        return itemsService.getAll();
    }

    @GetMapping("{nameOne}")
    public Item getItemByNameOne(@RequestParam String name) {
        return itemsService.getByNameOne(name);
    }

    @GetMapping("{nameAll}")
    public List<Item> getItemByNameAll(@RequestParam String name) {
        return itemsService.getByNameAll(name);
    }

    @GetMapping("{id}")
    public Item getItemById(@RequestParam Long id) {
        return itemsService.getItemById(id);
    }

    @GetMapping("{ratingMax}")
    public List<Item> getItemByRatingMostPopular() {
        return itemsService.getByRatingMostPopular();
    }

    @GetMapping("{ratingMin}")
    public List<Item> getItemByRatingLessPopular() {
        return itemsService.getByRatingLessPopular();
    }

    @GetMapping("{strengthMax}")
    public List<Item> getItemByStrengthMax() {
        return itemsService.getByStrengthMax();
    }

    @GetMapping("{strengthMin}")
    public List<Item> getItemByStrengthMin() {
        return itemsService.getByStrengthMin();
    }

    @GetMapping("{priceMax}")
    public List<Item> getItemByPriceMax() {
        return itemsService.getByPriceMax();
    }

    @GetMapping("{priceMin}")
    public List<Item> getItemByPriceMin() {
        return itemsService.getByPriceMin();
    }

    @GetMapping("{alphabetOrderAtoZ}")
    public List<Item> getItemByAlphabetAtoZ() {
        return itemsService.getItemByAlphabetAtoZ();
    }

    @GetMapping("{alphabetOrderZtoA}")
    public List<Item> getItemByAlphabetZtoA() {
        return itemsService.getItemByAlphabetZtoA();
    }
}
