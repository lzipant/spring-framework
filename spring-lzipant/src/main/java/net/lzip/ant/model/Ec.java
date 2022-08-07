package net.lzip.ant.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
@Getter
@Setter
public class Ec implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级id
     */
    private Integer parentId;

    /**
     * 公司名称
     */
    private String ecName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 联系人姓名
     */
    private String ecLinkman;

    /**
     * 联系人电话
     */
    private String ecLinkphone;

    /**
     * 客户类型
     */
    private String ecType;

    /**
     * 客户状态 0已删除  1有效
     */
    private Integer status;

    /**
     * 微信用户的最大关联数
     */
    private Integer maxWxuserNum;

    /**
     * 是否由上级客户代付：0否  1是
     */
    private Integer advancePayment;

    /**
     * 折扣 0.1 ~ 10（折）
     */
    private Double discount;

    /**
     * 跟进人姓名
     */
    private String followPerson;

    /**
     * 客户的跟进人邮箱
     */
    private String followPersonEmail;

    /**
     * 线上产品图标
     */
    private String productLogoUrl;

    /**
     * 0时为平台主动注册的客户
     */
    private Integer isRegister;


}
