package websocket.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketCtrl extends TextWebSocketHandler implements InitializingBean {

  @Override
  public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
    
    
  }
  
  @Override
  public void afterPropertiesSet() throws Exception {
    
  }

}
