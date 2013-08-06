package br.uniriotec.xcute.busines.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;
import br.uniriotec.xcute.busines.persistence.IKipProcessDAO;
import br.uniriotec.xcute.busines.service.IKipProcessService;


@Service
public class KipProcessService implements IKipProcessService {

	@Autowired
	private IKipProcessDAO kipProcessDAO;
	
	@Override
	public List<KnowledgeIntensiveProcess> findAll() {
		List<KnowledgeIntensiveProcess> list = kipProcessDAO.list();
		return list;
	}

	@Override
	public KnowledgeIntensiveProcess get(Integer id) {
		KnowledgeIntensiveProcess byKey = null;
		byKey = kipProcessDAO.getByKey(id);
		for(KnowledgeIntensiveActivity kia : byKey.getKnowledgeIntensiveActivities()){ 
			kia.setColaborative(this.kipProcessDAO.isCollaborativeActivity(kia.getId()));
		}
		
		return byKey;
	}

	public IKipProcessDAO getKipProcessDAO() {
		return kipProcessDAO;
	}

	public void setKipProcessDAO(IKipProcessDAO kipProcessDAO) {
		this.kipProcessDAO = kipProcessDAO;
	}

	@Override
	public KnowledgeIntensiveActivity getKia(Integer id) {
		return this.kipProcessDAO.getKiaByKey(id); 
	}

	@Override
	public List<ComunicationInfo> getCardinality(Integer id) {
		return this.kipProcessDAO.getCardinality(id);
	}

}
