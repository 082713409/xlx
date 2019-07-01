package com.qf.serviceimpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.IEMailMapper;
import com.qf.entity.EMail;
import com.qf.service.IEMailService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author X
 * @Date 2019/7/1 0:17
 * @Version 1.0
 **/
@Service
public class EMailServiceImpl implements IEMailService {

    @Autowired
    private IEMailMapper eMailMapper;

    @Override
    public EMail getById(Integer id) {
        return (EMail) eMailMapper.selectById(id);
    }


}
