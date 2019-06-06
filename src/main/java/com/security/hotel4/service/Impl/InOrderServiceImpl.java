package com.security.hotel4.service.Impl;

import com.security.hotel4.mapper.InOrderMapper;
import com.security.hotel4.model.InOrder;
import com.security.hotel4.service.InOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("InOrderService")
public class InOrderServiceImpl implements InOrderService {

    @Resource(name="InOrderMapper")
    private InOrderMapper inOrderMapper;


    @Override
    public List<InOrder> getInOrderAll(InOrder inOrder) {
        return inOrderMapper.getInOrderAll(inOrder);
    }

    @Override
    public int addInOrder(InOrder inOrder) {
        return inOrderMapper.addInOrder(inOrder);
    }

    @Override
    public InOrder getOneInOrder(String inId) {
        return inOrderMapper.getOneInOrder(inId);
    }

    @Override
    public int updateInOrderById(InOrder inOrder) {
        return inOrderMapper.updateInOrderById(inOrder);
    }

    @Override
    public int deleteInOrderById(String inId) {
        return inOrderMapper.deleteInOrderById(inId);
    }

    @Override
    public int OverInOrder(String[] inIds,String status,String modifiedBy) {
        return inOrderMapper.OverInOrder(inIds,status,modifiedBy);
    }
}
