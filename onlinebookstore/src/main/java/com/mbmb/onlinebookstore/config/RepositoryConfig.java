package com.mbmb.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.mbmb.onlinebookstore.entity.Book;
import com.mbmb.onlinebookstore.entity.BookCategory;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	
	//deusiemme facons d'exposer l'identfiant d'une classe au niveau de rest (automatique pour tous les classes de l'application)
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
	
		//config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
		
		//premiere facons d'exposer l'identfiant d'une classe au niveau de rest (Manuelle)
		config.exposeIdsFor(Book.class);
		//config.exposeIdsFor(BookCategory.class);
	}
}
