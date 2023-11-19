package pro.sky.marketplace.skyprospringmarketplace.service;

import java.util.List;

public interface BucketListService {
    void add(List<Integer> items);
    List<Integer> get();
}
