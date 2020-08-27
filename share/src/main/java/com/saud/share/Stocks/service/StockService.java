package com.saud.share.Stocks.service;

import com.saud.share.Stocks.dao.StockRepo;
import com.saud.share.Stocks.entity.Stock;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author SAUD on 8/27/2020.
 */
@Service
public class StockService {

  private final StockRepo stockRepo;

  public StockService(StockRepo stockRepo) {
    this.stockRepo = stockRepo;
  }

  @Transactional
  public Stock createStock(final Stock stock) {
    return this.stockRepo.save(stock);
  }

  @Transactional(readOnly = true)
  public List<Stock> getAllStock(final int count) {
    return stockRepo
        .findAll()
        .stream()
        .limit(count)
        .collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public Optional<Stock> getStockById(final Long id) {
    return stockRepo
        .findById(id);
  }
}
