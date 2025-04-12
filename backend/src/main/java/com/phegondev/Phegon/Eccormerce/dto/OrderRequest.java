package com.phegondev.Phegon.Eccormerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.phegondev.Phegon.Eccormerce.entity.Payment;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest {

    private BigDecimal totalPrice;
    private List<OrderItemRequest> items;
    private Payment paymentInfo;
}
