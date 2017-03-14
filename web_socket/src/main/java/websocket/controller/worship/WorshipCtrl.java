package websocket.controller.worship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import websocket.service.WorshipService;

@Controller("WorshipCtrl")
public class WorshipCtrl {

	@Autowired 
	WorshipService worshipService;
	
	@RequestMapping("worship/add")
	public Object add() {
		
		
		return "pages/worship/insertWorship";
	}
	
	
	@RequestMapping("worship/month")
	public Object list(Model model) {
		
		model.addAttribute("worshipList", worshipService.selectList());
		
		return "pages/worship/monthWorship";
	}
}
