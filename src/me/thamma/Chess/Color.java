package me.thamma.Chess;

import com.sun.xml.internal.ws.util.StringUtils;

public enum Color {

	WHITE, BLACK;


	@Override
	public String toString() {
		return StringUtils.capitalize(this.name());
	}
}
