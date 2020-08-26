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
public class NetOrd extends Model<NetOrd> {

    private static final long serialVersionUID = 1L;

    private String ordNo;

    private String planNo;

    private String groupNo;

    private BigDecimal groupNum;

    private String isAllJoin;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime deliverTime;

    private String appType;

    private String ordType;

    private String shopCode;

    private String shopName;

    private String shopMobile;

    private String openTime;

    private String closeTime;

    private String longitude;

    private String latitude;

    private String shopAddress;

    private String whCode;

    private String openId;

    private String mobile;

    private String vipFaceno;

    private String ordStatus;

    private String disStatus;

    private BigDecimal totalPlu;

    private BigDecimal total;

    private BigDecimal packageFee;

    private BigDecimal logisFee;

    private BigDecimal totalPaid;

    private BigDecimal totalRecv;

    private BigDecimal totalDscMch;

    private BigDecimal totalDscPt;

    private BigDecimal serviceFee;

    private String logisType;

    private String logisCode;

    private String logisName;

    private String logisBillNo;

    private String fetchCode;

    private String custName;

    private String custPhone;

    private String custAddress;

    private BigDecimal custLongitude;

    private BigDecimal custLatitude;

    private String shipperName;

    private String shipperPhone;

    private String invoiceTitle;

    private String taxIdNo;

    private String clkCode;

    private String clkName;

    private String cshCode;

    private String cshName;

    private String custRemark;

    private String remark;

    private String deliverSelDate;

    private String deliverSelTime;

    private String uuid;


    @Override
    protected Serializable pkVal() {
        return this.ordNo;
    }

}
