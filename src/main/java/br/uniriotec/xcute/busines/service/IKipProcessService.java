package br.uniriotec.xcute.busines.service;

import java.util.List;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public interface IKipProcessService {

	List<KnowledgeIntensiveProcess> findAll();

	KnowledgeIntensiveProcess get(Integer id);  

}
