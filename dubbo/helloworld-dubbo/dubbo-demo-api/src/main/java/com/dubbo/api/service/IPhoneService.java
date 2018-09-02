package com.dubbo.api.service;


import com.dubbo.api.model.Phone;

/**
 * Title：手机服务接口
 */
public interface IPhoneService {

    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    Phone findById (Long id);
}