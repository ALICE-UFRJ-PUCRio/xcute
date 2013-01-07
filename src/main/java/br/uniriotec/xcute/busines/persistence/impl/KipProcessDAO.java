package br.uniriotec.xcute.busines.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;
import br.uniriotec.xcute.busines.persistence.IKipProcessDAO;

@Repository
public class KipProcessDAO implements IKipProcessDAO {

	@Override
	public List<KnowledgeIntensiveProcess> list() {
		List<KnowledgeIntensiveProcess> list = new KipProcessDataBaseMock().listInMemory();
		return list;
	}

	@Override
	public KnowledgeIntensiveProcess getByKey(Integer id) {
		KipProcessDataBaseMock mock = new KipProcessDataBaseMock();
		for (KnowledgeIntensiveProcess kip : mock.listInMemory()) {
			if(id.equals(kip.getId()))
				return kip;
		}
		throw new RuntimeException("unable to find this kip");
	}

}
