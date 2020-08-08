package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.enums.ItemCategory;
import com.mf.warmtouch.model.entities.PricelistItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricelistRepository extends JpaRepository<PricelistItem, Integer>
{
    @Query("SELECT u FROM PricelistItem u WHERE u.type = ?1")
    public List<PricelistItem> findAllItemsOfType(ItemCategory type);

    @Query("SELECT DISTINCT(type) FROM PricelistItem")
    public List<String> findAllTypes();
}
