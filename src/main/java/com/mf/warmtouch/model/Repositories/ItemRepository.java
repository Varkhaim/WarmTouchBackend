package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.ItemCategory;
import com.mf.warmtouch.model.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ShopItem, Integer>
{

}
