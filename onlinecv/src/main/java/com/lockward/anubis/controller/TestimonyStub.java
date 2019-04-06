package com.lockward.anubis.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lockward.anubis.model.Testimony;

public class TestimonyStub {
	private static Map<Long, Testimony> testimonies = new HashMap<>();
	private static Long idIndex = 3L;

	static {
		Testimony t1 = new Testimony(1L, "Anubis Lockward", "Java Developer", new Date(), new Date(),
				"This dude is a fraud!");
		testimonies.put(t1.getId(), t1);
		Testimony t2 = new Testimony(2L, "Natasha Lockward", "Interior Designer", new Date(), new Date(),
				"Wish I never hired him!");
		testimonies.put(t2.getId(), t2);
		Testimony t3 = new Testimony(3L, "John Doe", "Professional Corpse", new Date(), new Date(),
				"He's the reason I keep getting murdered!");
		testimonies.put(t3.getId(), t3);
	}

	public static List<Testimony> findAll() {
		return new ArrayList<Testimony>(testimonies.values());
	}

	public static Testimony save(Testimony testimony) {
		idIndex += idIndex;
		testimony.setId(idIndex);
		testimonies.put(idIndex, testimony);
		return testimony;
	}
	
	public static Testimony findById(Long id) {
		return testimonies.get(id);
	}
	
	public static Testimony udpate(Long id, Testimony testimony) {
		testimonies.put(id, testimony);
		return testimony;
	}
	
	public static void delete(Long id) {
		testimonies.remove(id);
	}
}
