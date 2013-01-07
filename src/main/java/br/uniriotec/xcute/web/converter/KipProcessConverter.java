package br.uniriotec.xcute.web.converter;

import org.springframework.core.convert.converter.Converter;

import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;

public class KipProcessConverter implements
		Converter<String, KnowledgeIntensiveProcess> {

	public KipProcessConverter() {
	}

	@Override
	public KnowledgeIntensiveProcess convert(String key) {
		return new KnowledgeIntensiveProcess();
	}

}
