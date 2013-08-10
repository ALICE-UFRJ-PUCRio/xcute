package br.uniriotec.xcute.busines.persistence.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;
import br.uniriotec.xcute.busines.persistence.IKipProcessDAO;
import br.uniriotec.xcute.busines.persistence.IKIPMapper;

@Repository
public class KipProcessDAO implements IKipProcessDAO {
  
	private SqlSession session;
	
	public KipProcessDAO() {
		session = MyBatisConnectionFactory.getSession();
	}
	
	
	@Override
	public List<KnowledgeIntensiveProcess> list() {
		return session.getMapper(IKIPMapper.class).list();
	}

	@Override
	public KnowledgeIntensiveProcess getByKey(Integer id) {
		return session.getMapper(IKIPMapper.class).getById(id);
	}


	@Override
	public KnowledgeIntensiveActivity getKiaByKey(Integer id) {
		return session.getMapper(IKIPMapper.class).selectKIA(id);
	}
	
	public boolean isCollaborativeActivity(Integer id){
		return session.getMapper(IKIPMapper.class).isCollaborativeActivity(id)
			   || isSocialization(id)
			   || isCollaborativeSession(id);
	}


	@Override
	public boolean isSocialization(Integer id) {
		return session.getMapper(IKIPMapper.class).isSocialization(id);
	}


	@Override
	public List<ComunicationInfo> getCardinality(Integer id) {
		return session.getMapper(IKIPMapper.class).getCardinality(id); 
	}


	@Override
	public boolean isCollaborativeSession(Integer id) {
		return session.getMapper(IKIPMapper.class).isCollaborativeSession(id);
	}

}
