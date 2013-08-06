package br.uniriotec.xcute.busines.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.busines.service.IRecomendationService;

@Service
public class RecomendationService implements IRecomendationService {

	private List<ColaborationInfo> colaborationInfos;
	
	@Override
	public List<ColaborationInfo> getCollaborationInfo(Integer id) {
		return null;
	}

	@Override
	public List<GroupwareRecomendation> getRecomendation() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
