package net.lzip.ant.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
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
public class Sim implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联卡主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 运营商接入客户主键Id
     */
    private Integer operatorecId;

    /**
     * 关联的客户id
     */
    private Integer ecId;

    /**
     * 运营商id（1移动 2联通 3电信）
     */
    private Integer operatorId;

    private Integer simNtypeId;

    private Integer simCtypeId;

    /**
     * 卡号
     */
    private String msisdn;

    /**
     * iccid号
     */
    private String iccid;

    /**
     * 实名认证状态，0未认证  1企业认证  2普通用户认证
     */
    private Integer certifyStatus;

    /**
     * 开卡时间
     */
    private LocalDate openTime;

    /**
     * 激活时间
     */
    private LocalDateTime activateTime;

    /**
     * 结束时间
     */
    private LocalDate expireTime;

    /**
     * 设备号
     */
    private String equipmentCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 1-正常卡 2-异常卡
     */
    private Integer cardStatus;

    /**
     * 销户时间
     */
    private LocalDateTime closeTime;

    /**
     * 运营商折扣
     */
    private Float operatorDiscount;

    /**
     * 是否到期停，0否 1是
     */
    private Integer expireControl;

    /**
     * 到期时间计算类型，1按照开卡时间计算  2按照激活时间计算
     */
    private Integer expireType;

    private String imei;

    /**
     * 长周期套餐到期时间
     */
    private LocalDate phugoidTime;

    /**
     * 出账类型(账务模式)  1费用直缴移动 2费用代缴（月结） 3费用预存  4无需系统结算
     */
    private Integer settleType;

    /**
     * 实名校验码
     */
    private String verifyCode;

    private Integer isBinding;

    private Integer isInDatapool;

    /**
     * 流量池编号
     */
    private String poolCode;


}
