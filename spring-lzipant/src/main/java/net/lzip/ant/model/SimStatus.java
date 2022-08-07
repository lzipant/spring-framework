package net.lzip.ant.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("sim_status")
public class SimStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联卡状态信息表主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    // private Integer simId;
	private Sim sim;

    /**
     * 生命周期状态，0待初始化 1测试期  2沉默期  3正使用 4停机  5预约销户 6销户 7过户 8休眠  9库存期 10已失效  11已清除  12已更换 13freezing
     */
    private Integer lifecycle;

    /**
     * 物联卡功能状态，1待激活  2正使用 3停机 4预约销户 5销户 6过户 7休眠
     */
    private Integer status;

    /**
     * 剩余流量
     */
    private Float residueData;

    /**
     * 套餐流量
     */
    private Float planData;

    /**
     * 余额
     */
    private Integer balance;

    /**
     * 已使用流量
     */
    private Float usedData;

    private String imsi;

    /**
     * 流量功能状态，1开通  2未开通
     */
    private Integer flowStatus;

    /**
     * 短信功能状态，1开通  2未开通
     */
    private Integer smsStatus;

    /**
     * 语音功能状态，1开通  2未开通
     */
    private Integer voiceStatus;

    /**
     * 流量数据更新时间
     */
    private LocalDateTime flowUtime;

    /**
     * 码号数据更新时间
     */
    private LocalDateTime iccidUtime;

    /**
     * 生命周期数据更新时间
     */
    private LocalDateTime lifecycleUtime;

    /**
     * 套餐数据更新时间
     */
    private LocalDateTime pkgUtime;

    /**
     * 功能状态数据更新时间
     */
    private LocalDateTime functUtime;

    /**
     * 激活时间数据更新时间
     */
    private LocalDateTime activateUtime;

    /**
     * 物联卡订购套餐字符
     */
    private String productsStr;

    /**
     * 额外流量额度
     */
    private Integer extraDataAmount;

    /**
     * 额外流量额度有效截止期
     */
    private LocalDate dataAmountExpiryDate;

    /**
     * 旧生命周期状态，用于判断生命周期是否有变更
     */
    private Integer lifecyclePre;

    /**
     * 号码最后流量发生时间
     */
    private LocalDateTime lastFlowTime;

    /**
     * 上一次更新剩余流量值，用于与实时数据比较为预警提供判断
     */
    private Float residueDataPre;

    /**
     * 上一次更新已使用流量值，用于与实时数据比较为预警提供判断
     */
    private Float usedDataPre;

    private Integer stockStatus;

    /**
     * 库存状态更新时间
     */
    private LocalDateTime stockStatusUtime;

    /**
     * 出库部门/项目名称
     */
    private String department;

    /**
     * 出库部门或项目的负责人
     */
    private String personInCharge;

    /**
     * 已使用语音数据量
     */
    private Float useVoice;

    /**
     * 流量额度限制(MB)
     */
    private Float dataLimit;

    /**
     * 生命周期数据更新时间
     */
    private LocalDateTime lifecycleDataUtime;


}
