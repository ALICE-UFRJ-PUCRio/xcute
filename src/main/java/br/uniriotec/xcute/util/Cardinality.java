package br.uniriotec.xcute.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;

public enum Cardinality {
	UM("Um"),
	MUITOS("Muitos"),
	UM_MUITOS("Um para muitos"),
	UM_UM("Um para um"),
	MUITOS_MUITOS("Muito para muitos"),
	EMPTY("N‹o dispon’vel");
	
	private String value;
	private static List<Cardinality> list = new ArrayList<Cardinality>();
	private static Map<String, Cardinality> map = new HashMap<String, Cardinality>();
	
	static{
		for(Cardinality c: Cardinality.values()){
			map.put(c.value, c);
		}
	}
	
	private Cardinality(String value) {
		this.value = value;
	}

	public boolean isIn(Cardinality...values){
		for (Cardinality cardinality : values) {
			if(cardinality.equals(this))
				return true;
		}
		return false;
	}
	
	public static void addInteraction(String card){
		list.add(map.get(card));
	}
	
	public static Cardinality getCardinalityResult(){
		if(CollectionUtils.isEmpty(list)) return EMPTY;
		
		if(list.contains(UM) && !list.contains(MUITOS) && list.size() < 4) 
			return UM_UM;

		if(list.contains(MUITOS) && !list.contains(UM) && list.size() > 1) 
			return MUITOS_MUITOS;
		
		if(list.contains(UM) && list.contains(MUITOS) && list.size() == 2) 
			return UM_MUITOS;

		if(list.indexOf(MUITOS) > 1) 
			return MUITOS_MUITOS;
		
		return null;
	}
	
	public String toString(){
		return value;
	}
	
	public static void clear(){
		list = new ArrayList<Cardinality>();
	}
	
}
