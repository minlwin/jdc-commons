package com.jdc.commons.utils;

public class StringsUtils {

	public static boolean isEmpty(String str) {
		return null == str || str.isEmpty();
	}

	public static boolean someIsEmpty(String ... array) {
		
		for(String str : array) {
			if(isEmpty(str)) {
				return true;
			}
		}
		
		return false;
	}
}
