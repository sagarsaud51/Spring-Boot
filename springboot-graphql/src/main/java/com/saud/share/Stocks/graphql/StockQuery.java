package com.saud.share.Stocks.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.saud.share.Stocks.entity.Stock;
import com.saud.share.Stocks.service.StockService;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 * @author SAUD on 8/27/2020.
 */

@Component
public class StockQuery implements GraphQLQueryResolver{

  private final StockService stockService;

  public StockQuery(StockService stockService) {
    this.stockService = stockService;
  }

  public List<Stock> getStocksByCount(final int count){
    return stockService.getAllStock(count);
  }


  public Optional<Stock> getStockById(final Long stockId){
    return stockService.getStockById(stockId);
  }
}
