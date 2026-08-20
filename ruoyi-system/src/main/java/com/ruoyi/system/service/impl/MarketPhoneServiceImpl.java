package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.MarketPhone;
import com.ruoyi.system.mapper.MarketPhoneMapper;
import com.ruoyi.system.service.IMarketPhoneService;

@Service
public class MarketPhoneServiceImpl implements IMarketPhoneService
{
    @Autowired
    private MarketPhoneMapper phoneMapper;

    @Override
    public List<MarketPhone> selectMarketPhoneList(MarketPhone phone)
    {
        return phoneMapper.selectMarketPhoneList(phone);
    }
}
