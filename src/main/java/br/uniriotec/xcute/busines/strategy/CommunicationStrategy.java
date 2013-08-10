package br.uniriotec.xcute.busines.strategy;

import java.util.ArrayList;
import java.util.List;

import br.uniriotec.xcute.busines.entity.GroupwareRecomendation;
import br.uniriotec.xcute.util.Cardinality;

public abstract class CommunicationStrategy {
	
	protected  RecommendationHelper helper;
	protected  List<GroupwareRecomendation> list;

	public CommunicationStrategy(RecommendationHelper helper) {
		this.helper = helper;
		list = new ArrayList<GroupwareRecomendation>();
	}
 
	public abstract void run();
	
	public List<GroupwareRecomendation>  recomend(){
		
		
		//ROTEIRO para recomendar baseado nas regras
		
		//Premissa este kia tem que ser colaborativo
		//    esta regra estah atendida porque somente 
		//    faz as consultas que se seguirao para 
		//    atividades colaborativas
		
		
		// <d+>
		//Descobrir a quantidade de interlocutores
		//Descobrir qual o tipo de mesnsagem 
		// <c+>
		
		//<cx>
		//sincrono y
		//sincrono n
		//<dx>
		
 		String messageType = helper.getMessageType();
 		System.out.println("Message type " + messageType ); 
 		Cardinality result = helper.getCommunicationCardinality();
 		System.out.println("Cardinality: "+ result);
 		
 		//identifica comunicao
		//identifica cooperacao
		//identifica coordenaçao
		
		return list;
	}
	
	public  static CommunicationStrategy getCommunicationStrategy(RecommendationHelper helper){
		if(helper.isCollaborationSyncronous())
			return new SyncronousRecommendation(helper);
		else
			return new AsyncronousRecommendation(helper);
	}
	
	
}
