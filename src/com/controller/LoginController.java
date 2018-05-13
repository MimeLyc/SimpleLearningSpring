package com.controller;

import com.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by QQQ on 2018/5/13.
 */
//@Controller 注释表明这个类作为MVC架构中的Controller（需要在servlet.xml注册扫描）
@Controller
public class LoginController {

//	RequestMapping注释用于映射URL到整个类或一个特定的处理方法，即当请求为value的值时映射到此方法/类，若类指定了该属性，则该类的value属性作为该类方法的父目录
//	具体见https://blog.csdn.net/J080624/article/details/55193269
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView user(){
//		ModelAndeView设置返回的视图（第一个参数） 和模型/数据（二三个参数：Key-Vlue）
		return new ModelAndView("loginPage","command",new User());
	}


//	@ModelAttribute从页面获取模型数据或传递数据给页面，如下所示
/**
 * @param user 第一个参数的注释表明从页面获得的模型的key值为inputUser(可以在form中制定modelAttribute?)
 * @param model 表明设置传递给下一个页面的模型的Key为myUser，在下一个页面可以通过myUser.name、myUser.password获得设置的模型值
 * 关于前台向后台传值的方法，详见https://blog.csdn.net/flymoringbird/article/details/53126505
 *     其中path标签大概相当于一般form的name属性
 *
 */
	@RequestMapping(value = "/comfirmUser",method = RequestMethod.GET)
	public String login(@ModelAttribute("inputUser")User user, @ModelAttribute("myUser") ModelMap model){
		if (user.getName().equals("lyc")&&user.getPassword().equals("111")){
			model.addAttribute("name","李煜超");
			model.addAttribute("password",user.getPassword());
			return "mainPage";
		}else{
//			重定向到静态页面，注意静态页面名称须写完整
			return "redirect:/pages/loginFailed.html";
		}

	}


}
