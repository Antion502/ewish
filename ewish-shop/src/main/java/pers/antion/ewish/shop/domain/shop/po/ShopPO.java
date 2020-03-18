package pers.antion.ewish.shop.domain.shop.po;

import lombok.Data;

import java.util.Date;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/18
 * @描述
 **/
@Data
public class ShopPO {

    private Integer id;

    private String shopName;

    private String status;

    private String createTime;

    private Date updateTime;
}
