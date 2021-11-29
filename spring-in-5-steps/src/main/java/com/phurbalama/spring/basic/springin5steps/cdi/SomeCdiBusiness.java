package com.phurbalama.spring.basic.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO somecdidao;
	
	
	public SomeCdiDAO getSomecdidao() {
		return somecdidao;
	}

	public void setSomecdidao(SomeCdiDAO somecdidao) {
		this.somecdidao = somecdidao;
	}
	
	

}
