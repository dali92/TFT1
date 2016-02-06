package com.esprit.firstEjb;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class calculette
 */
@Stateless
public class calculette implements calculetteRemote, calculetteLocal {

    /**
     * Default constructor. 
     */
    public calculette() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public float somme(float a, float b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
