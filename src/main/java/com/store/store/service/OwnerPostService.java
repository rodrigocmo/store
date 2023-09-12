package com.store.store.service;


import com.store.store.db.dto.OwnerPostDTO;
import org.springframework.stereotype.Service;

@Service
public interface OwnerPostService {

    void createOwnerPost(OwnerPostDTO ownerPostDTO);

}
