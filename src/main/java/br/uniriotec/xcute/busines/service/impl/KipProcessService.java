package br.uniriotec.xcute.busines.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return kipProcessDAO.getByKey(id);
	}

	public IKipProcessDAO getKipProcessDAO() {
		return kipProcessDAO;
	}

	public void setKipProcessDAO(IKipProcessDAO kipProcessDAO) {
		this.kipProcessDAO = kipProcessDAO;
	}


}
