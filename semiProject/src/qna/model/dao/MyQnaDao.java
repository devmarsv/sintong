package qna.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import qna.model.vo.MyQna;

public class MyQnaDao {

	public int getListCount(Connection conn, String userId) {
		int listCount = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from qna where qna_qid = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return listCount;
	}

	public ArrayList<MyQna> myQnaSelect(Connection conn, int currentPage, int limit, String userId) {
		ArrayList<MyQna> list = new ArrayList<MyQna>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from "
				+ "(select rownum rnum, "
				+ "qna_no, qna_title, qna_date, "
				+ "qna_qcontent, qna_ans_yn, qna_acontent, "
				+ "qna_qid, qna_aid "
				+ "from (select * from qna "
				+ "order by (substr(qna_no, 4) * 1) desc) where qna_qid = ?) "
				+ "where rnum >= ? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				MyQna myqna = new MyQna();
				myqna.setmQnaNo(rset.getString("qna_no"));
				myqna.setmQnaTitle(rset.getString("qna_title"));
				myqna.setmQnaDate(rset.getDate("qna_date"));
				myqna.setQnaQContent(rset.getString("qna_qcontent"));
				myqna.setQnaAnsYn(rset.getString("qna_ans_yn"));
				myqna.setQnaAContent(rset.getString("qna_acontent"));
				myqna.setQnaQid(userId);
				myqna.setQnaAid(rset.getString("qna_aid"));
				
				list.add(myqna);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public MyQna myQnaSelect(Connection conn, String qnaNum) {
		MyQna mqview = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from qna where qna_no = ?";
	
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, qnaNum);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				mqview = new MyQna();
				
				mqview.setmQnaNo(rset.getString("qna_no"));
				mqview.setmQnaTitle(rset.getString("qna_title"));
				mqview.setmQnaDate(rset.getDate("qna_date"));
				mqview.setQnaQContent(rset.getString("qna_qcontent"));
				mqview.setQnaAnsYn(rset.getString("qna_ans_yn"));
				mqview.setQnaAContent(rset.getString("qna_acontent"));
				mqview.setQnaQid(rset.getString("qna_qid"));
				mqview.setQnaAid(rset.getString("qna_aid"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return mqview;
	}

	public int modifyQna(Connection conn, MyQna mqview) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update qna set "
				+ "qna_title = ?, "
				+ "qna_date = ?, "
				+ "qna_qcontent = ?, "
				+ "qna_ans_yn = ?, "
				+ "qna_acontent = ?, "
				+ "qna_qid = ?, "
				+ "qna_aid = ?"
				+ "where qna_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, mqview.getmQnaTitle());
			pstmt.setDate(2, mqview.getmQnaDate());
			pstmt.setString(3, mqview.getQnaQContent());
			pstmt.setString(4, mqview.getQnaAnsYn());
			pstmt.setString(5, mqview.getQnaAContent());
			pstmt.setString(6, mqview.getQnaQid());
			pstmt.setString(7, mqview.getQnaAid());
			pstmt.setString(8, mqview.getmQnaNo());
			
//			mqview.setmQnaNo(rset.getString("qna_no"));
//			mqview.setmQnaTitle(rset.getString("qna_title"));
//			mqview.setmQnaDate(rset.getDate("qna_date"));
//			mqview.setQnaQContent(rset.getString("qna_qcontent"));
//			mqview.setQnaAnsYn(rset.getString("qna_ans_yn"));
//			mqview.setQnaAContent(rset.getString("qna_acontent"));
//			mqview.setQnaQid(rset.getString("qna_qid"));
//			mqview.setQnaAid(rset.getString("qna_aid"));
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int deleteQna(Connection conn, String qnaNum) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "delete from qna where qna_no = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, qnaNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}
