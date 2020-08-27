package com.saud.share.Stocks.dao;

import com.saud.share.Stocks.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SAUD on 8/27/2020.
 */
@Repository
public interface StockRepo extends JpaRepository<Stock,Long>{
}
