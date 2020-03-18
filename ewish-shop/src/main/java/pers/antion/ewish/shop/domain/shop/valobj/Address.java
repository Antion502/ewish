package pers.antion.ewish.shop.domain.shop.valobj;

import lombok.Data;

/**
 * @创建人 yuxun.wu
 * @创建时间 2020/3/18
 * @描述
 **/
@Data
public class Address {

    private String province;

    private String city;

    private String district;

    public String getAddress() {
        return province + city + district;
    }
}
