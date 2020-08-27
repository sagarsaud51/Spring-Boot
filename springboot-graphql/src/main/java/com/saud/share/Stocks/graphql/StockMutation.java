package com.saud.share.Stocks.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.saud.share.Stocks.entity.Stock;
import com.saud.share.Stocks.service.StockService;
import org.springframework.stereotype.Component;

/**
 * @author SAUD on 8/27/2020.
 */

@Component
public class StockMutation implements GraphQLMutationResolver {

  private final StockService stockService;

  public StockMutation(StockService stockService) {
    this.stockService = stockService;
  }

  public Stock createStock(final String securityName,final String securitySymbol,final String companyName) {
    Stock stock = new Stock();
    stock.setCompanyName(companyName);
    stock.setSecurityName(securityName);
    stock.setSecuritySymbol(securitySymbol);
    return stockService.createStock(stock);
  }
}
