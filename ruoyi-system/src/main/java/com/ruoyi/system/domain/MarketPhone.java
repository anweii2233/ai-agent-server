package com.ruoyi.system.domain;

import java.math.BigDecimal;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 二手手机商品 market_phone
 */
public class MarketPhone extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Long phoneId;
    private String name;
    private String brand;
    private String model;
    private String category;
    private String conditionLevel;
    private Integer batteryHealth;
    private BigDecimal price;
    private String imageUrl;
    private String color;
    private String storage;
    private String networkType;
    private String memorySize;
    private String warrantyStatus;
    private Integer salesCount;
    private String inspectionTags;
    private String status;

    public Long getPhoneId() { return phoneId; }
    public void setPhoneId(Long phoneId) { this.phoneId = phoneId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getConditionLevel() { return conditionLevel; }
    public void setConditionLevel(String conditionLevel) { this.conditionLevel = conditionLevel; }
    public Integer getBatteryHealth() { return batteryHealth; }
    public void setBatteryHealth(Integer batteryHealth) { this.batteryHealth = batteryHealth; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getStorage() { return storage; }
    public void setStorage(String storage) { this.storage = storage; }
    public String getNetworkType() { return networkType; }
    public void setNetworkType(String networkType) { this.networkType = networkType; }
    public String getMemorySize() { return memorySize; }
    public void setMemorySize(String memorySize) { this.memorySize = memorySize; }
    public String getWarrantyStatus() { return warrantyStatus; }
    public void setWarrantyStatus(String warrantyStatus) { this.warrantyStatus = warrantyStatus; }
    public Integer getSalesCount() { return salesCount; }
    public void setSalesCount(Integer salesCount) { this.salesCount = salesCount; }
    public String getInspectionTags() { return inspectionTags; }
    public void setInspectionTags(String inspectionTags) { this.inspectionTags = inspectionTags; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
