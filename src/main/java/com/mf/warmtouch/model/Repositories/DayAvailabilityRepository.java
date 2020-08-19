package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.entities.DayAvailability;
import com.mf.warmtouch.model.entities.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayAvailabilityRepository extends JpaRepository<DayAvailability, Integer>
{

}
