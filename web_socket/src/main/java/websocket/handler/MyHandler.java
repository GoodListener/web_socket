package websocket.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {
  
  List<WebSocketSession> webSocketSessionList = new ArrayList<>();
  
  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    System.out.println(message);
    TextMessage echoMessage = new TextMessage(message.getPayload());
    for (WebSocketSession webSocketSession : webSocketSessionList)
    {
      if (!session.equals(webSocketSession) && webSocketSession.isOpen())
        webSocketSession.sendMessage(echoMessage);
    }
  }

  @Override
  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    System.out.println(session);
    webSocketSessionList.add(session);
  }
  
  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    System.out.println(session);
    System.out.println(status);
  }
  
}
