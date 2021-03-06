package com.geekbang.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    /**
     * 对于满减券，quota是减掉的钱数，单位是分
     * 对于打折券，quota是折扣(以100表示原价)，90就是打9折, 95就是95折
     * 对于随机立减券，quota是最高的随机立减额
     * 对于晚间特别优惠券，quota是日间优惠额，晚间优惠翻倍
     */
    private Long quota;

    /** 最低达到多少消费才能用 */
    private Long threshold;
}