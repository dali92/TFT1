package com.esprit.firstEjb;

import javax.ejb.Remote;

@Remote
public interface calculetteRemote {
	
	float somme(float a,float b);

}
