package com.security.hotel4.service;


import com.security.hotel4.model.InOrder;

import java.util.List;

public interface InOrderService {

    public List<InOrder> getInOrderAll(InOrder inOrder);
    public int addInOrder(InOrder inOrder);
    public InOrder getOneInOrder(String inId);
    public int updateInOrderById(InOrder inOrder);
    public int deleteInOrderById(String inId);
    public int OverInOrder(String[] inIds, String status, String modifiedBy);

}
