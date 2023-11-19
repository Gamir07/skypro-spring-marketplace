package pro.sky.marketplace.skyprospringmarketplace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.marketplace.skyprospringmarketplace.service.BucketListService;
import pro.sky.marketplace.skyprospringmarketplace.service.BucketListServiceImpl;

import java.util.List;

@RestController
public class BucketListController {

    private BucketListService service;

    public BucketListController(BucketListServiceImpl service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public void addItem(@RequestParam List<Integer> items) {
        service.add(items);
    }

    @GetMapping(path = "/get")
    public List<Integer> getItems() {
        return service.get();
    }
}
