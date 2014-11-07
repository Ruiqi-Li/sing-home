package com.ruiqi.product.singhome;

public class Config {
	
    // Is this an internal dogfood build?
    public static final boolean IS_DOGFOOD_BUILD = false;
    
    // Hard-coded conference dates. This is hardcoded here instead of extracted from the conference
    // data to avoid the Schedule UI breaking if some session is incorrectly set to a wrong date.
    public static final int CONFERENCE_YEAR = 2014;

}
