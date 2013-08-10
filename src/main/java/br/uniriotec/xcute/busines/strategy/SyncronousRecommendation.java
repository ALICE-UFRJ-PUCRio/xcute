package br.uniriotec.xcute.busines.strategy;

import br.uniriotec.xcute.util.Cardinality;

public class SyncronousRecommendation extends CommunicationStrategy {

	public SyncronousRecommendation(RecommendationHelper helper) {
		super(helper);
	}

	public void run() {
		if(helper.getCommunicationCardinality().isIn(Cardinality.MUITOS_MUITOS, Cardinality.UM_MUITOS))
			//neste ponto a comunicacao Ž sincrona
			//e Ž de muitos para muitos
			//entao a recomendacao Ž conferencia
			
			;
	}

	
	
}
