package pro.sky.marketplace.skyprospringmarketplace.model;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Repository
@SessionScope
public class Item {

    List<Integer> items;

    public Item(List<Integer> items) {
        this.items = items;
    }
    public void add(List<Integer> ids){
        items.addAll(ids);
    }

    public List<Integer> getItems() {
        return items;
    }
}
