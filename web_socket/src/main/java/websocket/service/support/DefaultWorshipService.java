package websocket.service.support;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import websocket.dao.WorshipDao;
import websocket.domain.Worship;
import websocket.service.WorshipService;

@Service
public class DefaultWorshipService implements WorshipService {

	@Autowired 
	WorshipDao worshipDao;
	
	@Override
	public Worship selectByPrimaryKey(int no) {
		
		return worshipDao.selectByPrimaryKey(no);
	}

	@Override
	public List<Worship> selectList() {
		
		return worshipDao.selectList();
	}
	
}
