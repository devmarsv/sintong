package admin.notice.model.service;

import java.sql.Connection;

import admin.notice.model.dao.NoticeDao;
import static common.JDBCTemplate.*;

public class NoticeService {
	
	private NoticeDao ndao = new NoticeDao();

	public int selectNoticeCount() {
		
		Connection conn = getConnection();
		int nCount = ndao.selectNoticeCount(conn);
		close(conn);
		
		return nCount;
	}
	
}
