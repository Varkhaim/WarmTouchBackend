package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ShopItem, Integer>
{
    @Query("SELECT u FROM ShopItem u WHERE u.type = 'Packet'")
    public List<ShopItem> findAllPackets();

    @Query("SELECT u FROM ShopItem u WHERE u.type = 'Service'")
    public List<ShopItem> findAllServices();

    @Query("SELECT DISTINCT(type) FROM ShopItem")
    public List<String> findAllTypes();

    @Query("SELECT u FROM ShopItem u WHERE u.type = ?1")
    public List<ShopItem> findAllItemsOfType(String type);
}
