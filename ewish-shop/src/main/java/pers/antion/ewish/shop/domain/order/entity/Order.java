package pers.antion.ewish.shop.domain.order.entity;

import lombok.Data;
import pers.antion.ewish.shop.domain.order.valobj.OrderStatus;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/19
 * @描述
 **/
@Data
public class Order {

    private Integer id;

    private Integer customerId;

    private Integer shopId;

    private OrderStatus status;

    private String createTime;

    public void create() {

    }

    public void update() {

    }

    public void delete() {

    }
}
