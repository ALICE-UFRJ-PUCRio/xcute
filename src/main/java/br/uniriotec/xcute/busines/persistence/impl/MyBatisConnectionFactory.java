package br.uniriotec.xcute.busines.persistence.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import br.uniriotec.xcute.busines.persistence.ICollaborationRuleMapper;
import br.uniriotec.xcute.busines.persistence.IKIPMapper;

/**
 * MyBatis Connection Factory, which reads the configuration data from a XML file.
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class MyBatisConnectionFactory {

	private static SqlSessionFactory sqlSessionFactory;

	static {

		try {
			String resource = "SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);

			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				sqlSessionFactory.getConfiguration().addMapper(IKIPMapper.class);
				sqlSessionFactory.getConfiguration().addMapper(ICollaborationRuleMapper.class);
			}
		}

		catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		}
		catch (IOException iOException) {
			iOException.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	public static SqlSession getSession(){
		return getSqlSessionFactory().openSession();
	}

}