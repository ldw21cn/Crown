package org.crown.model.entity;

import java.time.LocalDateTime;

import org.crown.common.framework.model.convert.Convert;
import org.crown.emuns.UserStatusEnum;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author Caratacus
 * @since 2018-10-25
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class User extends Convert {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer id;

    /**
     * 登陆名
     */
    private String loginName;
    /**
     * 登陆名
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String phone;
    /**
     * IP地址
     */
    private String ip;

    /**
     * 状态 0：禁用 1：正常
     */
    private UserStatusEnum status;

    /**
     * 创建者ID
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer createUid;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    public static final String UID = "uid";

    public static final String LOGIN_NAME = "login_name";

    public static final String PASSWORD = "password";

    public static final String NICKNAME = "nickname";

    public static final String EMAIL = "email";

    public static final String PHONE = "phone";

    public static final String STATUS = "status";

    public static final String CREATE_UID = "create_uid";

    public static final String UPDATE_UID = "update_uid";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

}
