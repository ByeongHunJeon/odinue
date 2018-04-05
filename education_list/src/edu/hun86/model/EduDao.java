package edu.hun86.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import edu.hun86.config.SqlMapConfig;
import edu.hun86.dto.EduDto;

public class EduDao extends SqlMapConfig{
	
	public EduDao() {
		super();
	}
	
	String namespace="edu.hun86.model.";
	

	public List<EduDto> allList(EduDto dto){
		List<EduDto> list=new ArrayList<>();
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			list=sqlSession.selectList(namespace+"allList",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return list;
	}
	

	public int pageCount(){
		int count=0;
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			count=sqlSession.selectOne(namespace+"pageCount");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return count;
	}
	
	
	public EduDto detailBoard(int seq){
		EduDto dto=new EduDto();
		
		SqlSession sqlSession=null;
		
		EduDto inDto=new EduDto();
		inDto.setSeq(seq);
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			dto=sqlSession.selectOne(namespace+"detailBoard",inDto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return dto;
	}
	
	

	public boolean insertBoard(EduDto dto){
		int count=0;
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			count=sqlSession.insert(namespace+"insertBoard", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return count>0?true:false;
	}
	

	public boolean updateBoard(EduDto dto){
		int count=0;
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			count=sqlSession.update(namespace+"updateBoard", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return count>0?true:false;
	}
	

	public boolean chkBoard(int seq){
		int count=0;
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			count=sqlSession.update(namespace+"chkBoard", seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return count>0?true:false;
	}
	

	public boolean deleteBoard(int seq){
		int count=0;
		
		SqlSession sqlSession=null;
		
		try {
			sqlSession=getSqlSessionFactory().openSession(true);
			count=sqlSession.delete(namespace+"deleteBoard", seq);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		return count>0?true:false;
	}
	
	
	
	
	
}
