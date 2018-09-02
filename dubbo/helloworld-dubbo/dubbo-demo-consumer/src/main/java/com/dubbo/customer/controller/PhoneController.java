package com.dubbo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.api.model.Phone;
import com.dubbo.api.service.IPhoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Reference
    private IPhoneService phoneService;

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    public Phone findByID(@RequestParam(value = "id", required = false) Long id) {

        if (phoneService == null) {
            System.out.println("==========================");
        }

        return phoneService.findById(id);
    }

}
