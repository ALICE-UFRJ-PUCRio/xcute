package br.uniriotec.xcute.busines.persistence.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.entity.ServiceCategory;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleDAO;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleMapper;

@Repository
public class CollaborationRuleDAO implements ICollaborationRuleDAO {

	private SqlSession session;
	
	public CollaborationRuleDAO() {
		session = MyBatisConnectionFactory.getSession();
	}

	@Override
	public List<ComunicationInfo> getCardinality(Integer id) {
		return getMapper().getCardinality(id);
	}

	@Override
	public List<ColaborationInfo> getColaborativeSessionInfo(Integer id) {
		return getMapper().getColaborativeSessionInfo(id);
	}

	@Override
	public List<ColaborationInfo> getResourceParticipation(Integer id) {
		return getMapper().getResourceParticipation(id);
	}

	@Override
	public List<ColaborationInfo> getAgentsInComunication(Integer id) {
		return getMapper().getAgentsInComunication(id);
	}

	@Override
	public List<ColaborationInfo> getSocializationInfo(Integer id) {
		return getMapper().getSocializationInfo(id);
	}

	@Override
	public List<ColaborationInfo> getDecisionInfo(Integer id) {
		return getMapper().getDecisionInfo(id);
	}
 
	private ICollaborationRuleMapper getMapper(){
		return session.getMapper(ICollaborationRuleMapper.class);
	}

	@Override
	public List<GroupwareRecomendation> getServiceByCategory(
			HashMap<String, String> map) {
		return getMapper().getServiceByCategory(map); 
	}

	@Override
	public List<ServiceCategory> getCategoryChildren(Integer id) {
		return getMapper().getCategoryChildren(id); 
	}
	
}
