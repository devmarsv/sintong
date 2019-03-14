package qna.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import qna.model.vo.QNA;

public class QNADao {

	public int getListCount(Connection con) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from qna";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return listCount;
	}

	public ArrayList<QNA> selectList(Connection con, int currentPage, int limit) {
		ArrayList<QNA> list = new ArrayList<QNA>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, substr(qna_no,4), qna_title, qna_date, qna_qcontent, qna_ans_yn, qna_acontent, qna_qid, qna_aid, qna_readcount " + 
				"from (select * from qna order by to_number(substr(qna_no,4)) desc)) " + 
				"where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				QNA q = new QNA();
				q.setQnaNo(rset.getString("substr(qna_no,4)"));
				q.setQnaTitle(rset.getString("qna_title"));
				q.setQnaDate(rset.getDate("qna_date"));
				q.setQnaQcontent(rset.getString("qna_qcontent"));
				q.setQnaAnsYN(rset.getString("qna_ans_yn"));
				q.setQnaAcontent(rset.getString("qna_acontent"));
				q.setQnaQid(rset.getString("qna_qid"));
				q.setQnaAid(rset.getString("qna_aid"));
				q.setQnaReadCount(rset.getInt("qna_readcount"));
				
				list.add(q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
		
	}

	public int addReadCount(Connection con, int qnaNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update qna set qna_readcount = qna_readcount + 1 where substr(qna_no,4) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, qnaNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public QNA selectQNA(Connection con, int qnaNo) {
		QNA qna = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from qna where substr(qna_no,4) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, qnaNo);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				qna = new QNA();
				
				qna.setQnaNo(Integer.toString(qnaNo));
				qna.setQnaTitle(rset.getString("qna_title"));
				qna.setQnaDate(rset.getDate("qna_date"));
				qna.setQnaQcontent(rset.getString("qna_qcontent"));
				qna.setQnaAnsYN(rset.getString("qna_ans_yn"));
				qna.setQnaAcontent(rset.getString("qna_acontent"));
				qna.setQnaQid(rset.getString("qna_qid"));
				qna.setQnaAid(rset.getString("qna_aid"));
				qna.setQnaReadCount(rset.getInt("qna_readcount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return qna;
	}

	public int getSearchListCount(Connection con, String search) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from qna where qna_title like '%" + search + "%'";
		
		try {
			stmt = con.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		return listCount;
	}

	public ArrayList<QNA> selectSearchTitle(Connection con, String search, int currentPage, int limit) {
		ArrayList<QNA> list = new ArrayList<QNA>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, substr(qna_no,4), qna_title, qna_date, qna_qcontent, qna_ans_yn, qna_acontent, qna_qid, qna_aid, qna_readcount " + 
				"from (select * from qna where qna_title like ? order by to_number(substr(qna_no,4)) desc)) " + 
				"where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "%" + search + "%");
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				QNA q = new QNA();
				q.setQnaNo(rset.getString("substr(qna_no,4)"));
				q.setQnaTitle(rset.getString("qna_title"));
				q.setQnaDate(rset.getDate("qna_date"));
				q.setQnaQcontent(rset.getString("qna_qcontent"));
				q.setQnaAnsYN(rset.getString("qna_ans_yn"));
				q.setQnaAcontent(rset.getString("qna_acontent"));
				q.setQnaQid(rset.getString("qna_qid"));
				q.setQnaAid(rset.getString("qna_aid"));
				q.setQnaReadCount(rset.getInt("qna_readcount"));
				
				list.add(q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

}
