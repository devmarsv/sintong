package notice.model.service;

import static common.JDBCTemplate.*;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import notice.model.dao.NoticeDao;
import notice.model.vo.Notice;

public class NoticeService {

	public int getListCount() {
		Connection con = getConnection();
		int listCount = new NoticeDao().getListCount(con);
		close(con);
		return listCount;
	}

	public ArrayList<Notice> selectList(int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<Notice> list = new NoticeDao().selectList(con, currentPage, limit);
		close(con);
		return list;
	}

	public void addReadCount(int noticeNo) {
		Connection con = getConnection();
		int result = new NoticeDao().addReadCount(con, noticeNo);
		if(result > 0)
			commit(con);
		else
			rollback(con);
		close(con);
		return;		
	}

	
	public Notice selectNotice(int noticeNo) {
		Connection con = getConnection();
		Notice n = new NoticeDao().selectNotice(con, noticeNo);
		close(con);
		return n;
	}

	public ArrayList<Notice> selectSearchTitle(String search, int currentPage, int limit) {
		Connection con = getConnection();
		ArrayList<Notice> list = new NoticeDao().selectSearchTitle(con, search, currentPage, limit);
		close(con);
		return list;
	}

	public int getSearchListCount(String search) {
		Connection con = getConnection();
		int listCount = new NoticeDao().getSearchListCount(con, search);
		close(con);
		return listCount;
	}

	public ArrayList<Notice> selectSearchTitle(String search) {
		Connection con = getConnection();
		ArrayList<Notice> list = new NoticeDao().selectSearchTitle(con, search);
		close(con);
		
		return list;
	}

	
}
