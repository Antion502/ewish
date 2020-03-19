package pers.antion.ewish.shop.domain.order.valobj;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/19
 * @描述 订单状态
 **/
public enum OrderStatus {

    /** 已下单 */
    CREATED,
    /** 已支付 */
    PAID,
    /** 已发送 */
    SENT,
    /** 已送达 */
    DELIVERED,
    /** 已取消 */
    CANCELED
}
