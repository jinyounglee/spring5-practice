package com.example.springpractice.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired // @Inject 를 사용해서 의존성을 주입한다.
    StoreRepository storeRepository;

    public void setStoreRepository(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public StoreRepository getStoreRepository() {
        return storeRepository;
    }
}
