package websocket.service;

import java.util.List;

import websocket.domain.Worship;

public interface WorshipService {
	Worship selectByPrimaryKey(int no);

	List<Worship> selectList();
}
