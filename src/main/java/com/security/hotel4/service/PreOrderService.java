package com.security.hotel4.service;

import com.security.hotel4.model.PreOrder;

import java.util.List;

public interface PreOrderService {

    public List<PreOrder> getPreOrderAll();
    public int addPreOrder(PreOrder preOrder);
    public PreOrder getOnePreOrder(String preId);
    public int updatePreOrderById(PreOrder preOrder);
    public int deletePreOrderById(String preId);
    public int OverPreOrder(String[] roomIds, String status);

}
