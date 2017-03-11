package websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/*")
public class StatisticCtrl {

	@RequestMapping("sample")
	public Object showStatistic(Model model) {
		
		
		System.out.println("잘되어간다.");
		
		return "pages/sample";
	}
	
	@RequestMapping("praise")
	public Object showPraise() {
		
		
		return "pages/praise";
	}
	
}
