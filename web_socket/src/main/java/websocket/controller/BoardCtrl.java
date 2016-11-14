package websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("BoardCtrl")
public class BoardCtrl {

  @RequestMapping("/pages/test")
  public void test(String text) throws Exception {
    System.out.println(text);
  }
  
}
