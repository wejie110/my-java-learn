package com.example.user.lwjuser.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lwj
 * @since 2020-08-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ShopStk extends Model<ShopStk> {

    private static final long serialVersionUID = 1L;

    private String shopCode;

    private String pluId;

    private String pluCode;

    private String barCode;

    private String exPluCode;

    private BigDecimal stkCount;

    private LocalDateTime snapTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return this.shopCode;
    }

}
