package com.phurbalama.spring.basic.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.phurbalama.spring.basic.springin5steps.scope.JdbcConnection;


public class XmlPersonDAO {
	
	
	XmlJdbcConnection xmljdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmljdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.xmljdbcConnection = jdbcConnection;
	}

}
