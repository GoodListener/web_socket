package websocket.handler;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {
  
  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    TextMessage echoMessage = new TextMessage("ECHO :" + message.getPayload());
    session.sendMessage(echoMessage);
  }

  @Override
  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
  }
  
  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
  }
  
}
