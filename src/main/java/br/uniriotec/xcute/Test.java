package br.uniriotec.xcute;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import br.uniriotec.xcute.busines.entity.ColaborationInfo;
import br.uniriotec.xcute.busines.entity.ComunicationInfo;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveActivity;
import br.uniriotec.xcute.busines.entity.KnowledgeIntensiveProcess;
import br.uniriotec.xcute.busines.persistence.ICollaborationRuleMapper;
import br.uniriotec.xcute.busines.persistence.IKIPMapper;
import br.uniriotec.xcute.busines.persistence.impl.MyBatisConnectionFactory;

public class Test {

	
	public static void main(String[] args) {
		
		SqlSessionFactory sql = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sql.openSession();
		try {
			ICollaborationRuleMapper crm = session.getMapper(ICollaborationRuleMapper.class);
			List<ColaborationInfo> list = crm.getDecisionInfo(1);
			for (ColaborationInfo colaborationInfo : list) {
				System.out.println("soci: "+ colaborationInfo);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testCardinality(SqlSession session) {
		ICollaborationRuleMapper crm = session.getMapper(ICollaborationRuleMapper.class);
		List<ComunicationInfo> list = crm.getCardinality(5);
		for (ComunicationInfo colaborationInfo : list) {
			System.out.println(colaborationInfo); 
		}
	}

	private static void testKIPMapper(SqlSession session) {
		IKIPMapper mapper  = session.getMapper(IKIPMapper.class);
		
		System.out.println("before");
		mapper  = session.getMapper(IKIPMapper.class);
		mapper.list().size();
		System.out.println("after size list");
		System.out.println(mapper.list().size());
		System.out.println(mapper.selectKIA(3).getName());
		System.out.println("fim");
		System.out.println(mapper.isSocialization(1));
		System.out.println((mapper.getCardinality(1).size() == 2 )+ " infact there is two");
	}

	private static void printList(IKIPMapper mapper) {
		for(KnowledgeIntensiveProcess c : mapper.list()){
			System.out.print(c.getProcess() + " ");
			System.out.println(c.getId());
			for(KnowledgeIntensiveActivity x :c.getKnowledgeIntensiveActivities()){
				System.out.println("actitiv: "+ x.getName() + " " + x.getId()+ " "+ x.isColaborative());
			}
			
		}
	}
	
}
