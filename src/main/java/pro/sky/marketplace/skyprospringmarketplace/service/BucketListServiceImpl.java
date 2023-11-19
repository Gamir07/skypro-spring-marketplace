package pro.sky.marketplace.skyprospringmarketplace.service;

import org.springframework.stereotype.Service;
import pro.sky.marketplace.skyprospringmarketplace.model.Item;

import java.util.List;

@Service
public class BucketListServiceImpl implements BucketListService {

    private Item listOfItems;

    public BucketListServiceImpl(Item listOfItems) {
        this.listOfItems = listOfItems;
    }

    @Override
    public void add(List<Integer> items) {
        listOfItems.add(items);
    }

    @Override
    public List<Integer> get() {
        return listOfItems.getItems();
    }
}
