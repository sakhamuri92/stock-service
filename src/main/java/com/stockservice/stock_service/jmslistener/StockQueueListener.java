package com.stockservice.stock_service.jmslistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.basedomains.base_domains.dto.OrderEvent;

@Component
public class StockQueueListener {     
     private static final Logger LOGGER = LoggerFactory.getLogger(StockQueueListener.class);


    @JmsListener(destination = "stock-queue")
    public void processStockQueue(OrderEvent orderEvent) {
        LOGGER.info(String.format("Stock Service Sending Notification ==> %s", orderEvent.toString()));

        // Perform stock-related actions here
    }

}
