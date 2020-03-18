package pers.antion.ewish.shop.domain.shop.entity;

import lombok.Data;
import pers.antion.ewish.shop.domain.shop.valobj.Address;

import java.util.Date;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/18
 * @描述
 **/
@Data
public class Shop {

    private Integer id;

    private String shopName;

    private String status;

    private Address address;

    private String createTime;

    private Date updateTime;

    public void createShop() {

    }

    public void updateShop() {

    }

    public void deleteShop() {

    }
}
