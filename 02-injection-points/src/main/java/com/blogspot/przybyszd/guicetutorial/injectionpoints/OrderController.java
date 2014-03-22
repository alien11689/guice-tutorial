package com.blogspot.przybyszd.guicetutorial.injectionpoints;

import javax.inject.Inject;

/**
 * Created by alien on 22.03.14.
 */
public class OrderController {
    private final OrderDao orderDao;

    private OrderProcessor orderProcessor;

    @Inject
    private OrderValidator orderValidator;

    @Inject
    public OrderController(final OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Inject
    public void setOrderProcessor(final OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public void invokeProcessing(final Order order) {
        //TODO finish it
        throw new UnsupportedOperationException("No yet implemented");
    }
}
