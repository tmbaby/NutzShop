package cn.wizzer.app.shop.modules.models;

import cn.wizzer.framework.base.model.BaseModel;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;

/**
 * 商城配置表
 * Created by wizzer on 2016/9/27.
 */
@Table("shop_config")
public class Shop_config extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column
    @Name
    @Comment("ID")
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String id;

    @Column
    @Comment("库存预警")
    @ColDefine(type = ColType.INT)
    private int shop_stock;

    @Column
    @Comment("积分比率")
    @ColDefine(type = ColType.INT)
    private int point_rate;

    @Column
    @Comment("发票")
    @ColDefine(type = ColType.BOOLEAN)
    private boolean tax_disabled;

    @Column
    @Comment("开票金额")
    @ColDefine(type = ColType.INT)
    private int tax_price;

    @Column
    @Comment("物流跟踪")
    @ColDefine(type = ColType.BOOLEAN)
    private boolean logistics_open;

    @Column
    @Comment("物流跟踪配置")
    @ColDefine(type = ColType.TEXT)
    private String logistics_info;

    @Column
    @Comment("第三方登录")
    @ColDefine(type = ColType.BOOLEAN)
    private boolean oauth_open;

    @Column
    @Comment("微信登录")
    @ColDefine(type = ColType.BOOLEAN)
    private boolean oauth_wechat;

    @Column
    @Comment("微信登录配置")
    @ColDefine(type = ColType.TEXT)
    private String oauth_wechat_info;

    @Column
    @Comment("QQ登录")
    @ColDefine(type = ColType.BOOLEAN)
    private boolean oauth_qq;

    @Column
    @Comment("QQ登录配置")
    @ColDefine(type = ColType.TEXT)
    private String oauth_qq_info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getShop_stock() {
        return shop_stock;
    }

    public void setShop_stock(int shop_stock) {
        this.shop_stock = shop_stock;
    }

    public int getPoint_rate() {
        return point_rate;
    }

    public void setPoint_rate(int point_rate) {
        this.point_rate = point_rate;
    }

    public boolean isTax_disabled() {
        return tax_disabled;
    }

    public void setTax_disabled(boolean tax_disabled) {
        this.tax_disabled = tax_disabled;
    }

    public int getTax_price() {
        return tax_price;
    }

    public void setTax_price(int tax_price) {
        this.tax_price = tax_price;
    }

    public boolean isLogistics_open() {
        return logistics_open;
    }

    public void setLogistics_open(boolean logistics_open) {
        this.logistics_open = logistics_open;
    }

    public String getLogistics_info() {
        return logistics_info;
    }

    public void setLogistics_info(String logistics_info) {
        this.logistics_info = logistics_info;
    }

    public boolean isOauth_open() {
        return oauth_open;
    }

    public void setOauth_open(boolean oauth_open) {
        this.oauth_open = oauth_open;
    }

    public boolean isOauth_wechat() {
        return oauth_wechat;
    }

    public void setOauth_wechat(boolean oauth_wechat) {
        this.oauth_wechat = oauth_wechat;
    }

    public String getOauth_wechat_info() {
        return oauth_wechat_info;
    }

    public void setOauth_wechat_info(String oauth_wechat_info) {
        this.oauth_wechat_info = oauth_wechat_info;
    }

    public boolean isOauth_qq() {
        return oauth_qq;
    }

    public void setOauth_qq(boolean oauth_qq) {
        this.oauth_qq = oauth_qq;
    }

    public String getOauth_qq_info() {
        return oauth_qq_info;
    }

    public void setOauth_qq_info(String oauth_qq_info) {
        this.oauth_qq_info = oauth_qq_info;
    }
}
