package br.uniriotec.xcute.busines.persistence;

import java.util.List;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public interface IKipProcessDAO {

	List<KnowledgeIntensiveProcess> list();

	KnowledgeIntensiveProcess getByKey(Integer id);  

}
