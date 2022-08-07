package net.lzip.ant.service;

import net.lzip.ant.model.Sim;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
public interface ISimService extends IService<Sim> {

    List<Sim> listByEcId(int ecId);
}
