package com.dubbo.provider.service;


import com.dubbo.api.model.Phone;
import com.dubbo.api.service.IPhoneService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Title：手机服务service
 */
@Service
public class PhoneServiceImpl implements IPhoneService {

    /**
     * 根据id查找手机
     *
     * @param id
     * @return
     */
    @Override
    public Phone findById (Long id) {
        Phone phone = new Phone();
        phone.setId(id);
        phone.setName("iphonex");
        phone.setPrice(BigDecimal.valueOf(8848.88));
        return phone;
    }
}