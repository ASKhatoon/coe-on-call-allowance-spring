package com.massmutual.coe.service;

import com.massmutual.coe.dao.OnCallAllowanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OnCallAllowanceServiceImpl implements OnCallAllowanceService{
    @Autowired
    OnCallAllowanceDao onCallAllowanceDao;
    @Override
    public List<Map<String, Object>> getAssociate() {
        return onCallAllowanceDao.getAssociate();
    }
}
