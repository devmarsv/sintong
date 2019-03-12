package FAQ.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import FAQ.model.vo.FAQ;

public class FAQDao {
	public FAQDao() {}
	
	public int getListCount(Connection con) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "select count(*) from FAQ";
		
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

	public ArrayList<FAQ> selectList(Connection con, int currentPage, int limit) {
		ArrayList<FAQ> list = new ArrayList<FAQ>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * " + 
				"from (select rownum rnum, substr(faq_no, 2), faq_title, faq_date, faq_content, faq_reply_content, faq_readcount, mem_userid" + 
				"      from (select * from faq order by to_number(substr(faq_no, 2)) desc))" + 
				"where rnum >=? and rnum <= ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				FAQ f = new FAQ();
				f.setFaqNo(rset.getString("substr(faq_no,2)"));
				f.setFaqTitle(rset.getString("faq_title"));
				f.setFaqDate(rset.getDate("faq_date"));
				f.setFaqContent(rset.getString("faq_content"));
				f.setFaqReplyContent(rset.getString("faq_reply_content"));
				f.setFaqReadCount(rset.getInt("faq_readcount"));
				f.setMemUserid(rset.getString("mem_userid"));
				
				list.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}

	public int addReadCount(Connection con, int faqNo) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String query = "update faq set faq_readcount = faq_readcount + 1 where substr(faq_no, 2) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, faqNo);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public FAQ selectFaq(Connection con, int faqNo) {
		FAQ faq = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select * from faq where substr(faq_no, 2) = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, faqNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				faq = new FAQ();
				
				faq.setFaqNo(Integer.toString(faqNo));
				faq.setFaqTitle(rset.getString("faq_title"));
				faq.setFaqDate(rset.getDate("faq_date"));
				faq.setFaqContent(rset.getString("faq_content"));
				faq.setFaqReplyContent(rset.getString("faq_reply_content"));
				faq.setFaqReadCount(rset.getInt("faq_readcount"));
				faq.setMemUserid(rset.getString("mem_userid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		return faq;
	}

}
