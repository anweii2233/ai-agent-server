package com.ruoyi.web.controller.market;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.MarketPhone;
import com.ruoyi.system.service.IMarketPhoneService;

/**
 * 二手手机商城公开查询接口。
 */
@Anonymous
@RestController
@RequestMapping("/market/phones")
public class MarketPhoneController extends BaseController
{
    @Autowired
    private IMarketPhoneService phoneService;

    @GetMapping
    public TableDataInfo list(MarketPhone phone,
                              @RequestParam(required = false) String keyword,
                              @RequestParam(required = false) Integer minPrice,
                              @RequestParam(required = false) Integer maxPrice,
                              @RequestParam(required = false) String sort)
    {
        phone.setName(keyword);
        phone.getParams().put("minPrice", minPrice);
        phone.getParams().put("maxPrice", maxPrice);
        phone.getParams().put("sort", sort);
        startPage();
        List<MarketPhone> list = phoneService.selectMarketPhoneList(phone);
        return getDataTable(list);
    }
}
