package com.china.center.oa.product.bean;

import java.io.Serializable;

import com.china.center.jdbc.annotation.Entity;
import com.china.center.jdbc.annotation.FK;
import com.china.center.jdbc.annotation.Id;
import com.china.center.jdbc.annotation.Join;
import com.china.center.jdbc.annotation.Table;
import com.china.center.jdbc.annotation.enums.JoinType;

@SuppressWarnings("serial")
@Entity(name = "中信产品对应赠品")
@Table(name = "T_CENTER_VS_GIFT")
public class ProductVSGiftBean implements Serializable
{
	@Id(autoIncrement = true)
	private String id = "";
	
	@FK
	@Join(tagClass = ProductBean.class, type = JoinType.LEFT, alias = "P1")
	private String productId = "";
	
	@Join(tagClass = ProductBean.class, type = JoinType.LEFT, alias = "P2")
	private String giftProductId = "";
	
	private int amount = 0;

    /**
     * 活动描述
     */
    private String activity = "";

    /**
     * 开始日期
     */
    private String beginDate = "";

    /**
     * 结束日期
     */
    private String endDate = "";

    /**
     * 备注
     */
    private String description = "";

	public ProductVSGiftBean()
	{
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getProductId()
	{
		return productId;
	}

	public void setProductId(String productId)
	{
		this.productId = productId;
	}

	public String getGiftProductId()
	{
		return giftProductId;
	}

	public void setGiftProductId(String giftProductId)
	{
		this.giftProductId = giftProductId;
	}

	public int getAmount()
	{
		return amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
