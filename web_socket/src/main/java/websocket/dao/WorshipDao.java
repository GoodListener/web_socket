package websocket.dao;

import java.util.List;

import websocket.domain.Worship;

public interface WorshipDao {
	
	List<Worship> 	selectList();
	
	Worship			selectByPrimaryKey(int no);
}
