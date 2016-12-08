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
    TextMessage jsonData = new TextMessage(message.getPayload());
//    String data = jsonData.getPayload();
//    Position position = new Position();
//    Gson gson = new Gson();
//    position = gson.fromJson(data, Position.class);
    
    for (WebSocketSession webSocketSession : webSocketSessionList)
    {
      if (!session.equals(webSocketSession) && webSocketSession.isOpen())
        webSocketSession.sendMessage(jsonData);
    }
  }
//  
//  @Override
//  public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
//    String jsonData = (String)message.getPayload();
//    Gson gson = new Gson();
//    Map<?, ?> map = gson.fromJson(jsonData, HashMap.class);
//    
//    for (WebSocketSession webSocketSession : webSocketSessionList) {
//      if (!session.equals(webSocketSession) && webSocketSession.isOpen())
//        webSocketSession.sendMessage((WebSocketMessage<?>) message.getPayload());
//    }
//  }

  @Override
  public void afterConnectionEstablished(WebSocketSession session) throws Exception {
    System.out.println("startConnect : " + session);
    webSocketSessionList.add(session);
  }
  
  @Override
  public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
    System.out.println("endConnect : " + session + status);
  }
  
}
