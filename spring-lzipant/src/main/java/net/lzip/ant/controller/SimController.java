package net.lzip.ant.controller;

import net.lzip.ant.model.Sim;
import net.lzip.ant.service.ISimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
@RestController
@RequestMapping("/sim")
public class SimController {

	@Autowired
	private ISimService simService;

	@GetMapping("/listByEcId/{ecId}")
	public List<Sim> listByEcId(@PathVariable int ecId) {
		return simService.listByEcId(ecId);
	}

}
