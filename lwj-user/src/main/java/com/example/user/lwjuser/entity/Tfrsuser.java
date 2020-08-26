package com.example.user.lwjuser.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2020-08-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Tfrsuser extends Model<Tfrsuser> {

    private static final long serialVersionUID = 1L;

    @TableId("UserID")
    private String userID;

    @TableField("UserCode")
    private String userCode;

    @TableField("UserName")
    private String userName;

    @TableField("UserType")
    private String userType;

    @TableField("LoginCheckType")
    private String loginCheckType;

    @TableField("Passwd")
    private String passwd;

    @TableField("IsEnable")
    private String isEnable;

    @TableField("BgnDate")
    private LocalDateTime bgnDate;

    @TableField("EndDate")
    private LocalDateTime endDate;

    @TableField("RightCtrlOrgCode")
    private String rightCtrlOrgCode;

    @TableField("ActiveDay")
    private BigDecimal activeDay;

    @TableField("Language")
    private String language;

    @TableField("NumFormat")
    private String numFormat;

    @TableField("DateFormat")
    private String dateFormat;

    @TableField("TimeZone")
    private String timeZone;

    @TableField("IsLimited")
    private String isLimited;

    @TableField("LogonCount")
    private BigDecimal logonCount;

    @TableField("EmpCode")
    private String empCode;

    @TableField("IsPreset")
    private String isPreset;

    @TableField("IsDeveloper")
    private String isDeveloper;

    @TableField("CrtUserID")
    private String crtUserID;

    @TableField("CrtTime")
    private LocalDateTime crtTime;

    @TableField("IsActivation")
    private String isActivation;

    @TableField("EmpId")
    private String empId;

    @TableField("RightCtrlOrgID")
    private String rightCtrlOrgID;

    @TableField("UserMail")
    private String userMail;

    @TableField("PasswdUdp")
    private String passwdUdp;

    @TableField("UpdateTime")
    private LocalDateTime updateTime;

    @TableField("IsBindToken")
    private String isBindToken;

    @TableField("IsUseToken")
    private String isUseToken;

    @TableField("TokenCode")
    private String tokenCode;


    @Override
    protected Serializable pkVal() {
        return this.userID;
    }

}
