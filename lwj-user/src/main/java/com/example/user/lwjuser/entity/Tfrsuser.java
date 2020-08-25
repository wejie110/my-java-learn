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
    private String UserID;

    @TableField("UserCode")
    private String UserCode;

    @TableField("UserName")
    private String UserName;

    @TableField("UserType")
    private String UserType;

    @TableField("LoginCheckType")
    private String LoginCheckType;

    @TableField("Passwd")
    private String Passwd;

    @TableField("IsEnable")
    private String IsEnable;

    @TableField("BgnDate")
    private LocalDateTime BgnDate;

    @TableField("EndDate")
    private LocalDateTime EndDate;

    @TableField("RightCtrlOrgCode")
    private String RightCtrlOrgCode;

    @TableField("ActiveDay")
    private BigDecimal ActiveDay;

    @TableField("Language")
    private String Language;

    @TableField("NumFormat")
    private String NumFormat;

    @TableField("DateFormat")
    private String DateFormat;

    @TableField("TimeZone")
    private String TimeZone;

    @TableField("IsLimited")
    private String IsLimited;

    @TableField("LogonCount")
    private BigDecimal LogonCount;

    @TableField("EmpCode")
    private String EmpCode;

    @TableField("IsPreset")
    private String IsPreset;

    @TableField("IsDeveloper")
    private String IsDeveloper;

    @TableField("CrtUserID")
    private String CrtUserID;

    @TableField("CrtTime")
    private LocalDateTime CrtTime;

    @TableField("IsActivation")
    private String IsActivation;

    @TableField("EmpId")
    private String EmpId;

    @TableField("RightCtrlOrgID")
    private String RightCtrlOrgID;

    @TableField("UserMail")
    private String UserMail;

    @TableField("PasswdUdp")
    private String PasswdUdp;

    @TableField("UpdateTime")
    private LocalDateTime UpdateTime;

    @TableField("IsBindToken")
    private String IsBindToken;

    @TableField("IsUseToken")
    private String IsUseToken;

    @TableField("TokenCode")
    private String TokenCode;


    @Override
    protected Serializable pkVal() {
        return this.UserID;
    }

}
