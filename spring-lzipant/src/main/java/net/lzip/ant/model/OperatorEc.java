package net.lzip.ant.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@TableName("operator_ec")
public class OperatorEc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 运营商集团客户主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 运营商主键id
     */
    private Integer operatorId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 状态0删除 1正使用
     */
    private Integer status;

    /**
     * 密钥类型 1广东移动  2中移物联网
     */
    private Integer secretType;

    /**
     * 运营商接入地
     */
    private String location;

    /**
     * 运营商集团编码
     */
    private String code;

    /**
     * 批量接口访问间隔时间
     */
    private Integer oecInterval;

    private Double operatorDiscount;

    /**
     * 定时任务数据更新开关 0-关闭 1-开启
     */
    private Integer crontabPullSwitch;

    /**
     * 是否更新月账单 0-否 1-是
     */
    private Integer ecbillMonthSwitch;

    /**
     * 是否开通了实时定位套餐
     */
    private Integer locationStatus;

    private Integer inRemunerateEcId;


}
