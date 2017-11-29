package com.tutorial.webservice.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.tutorial.webservice.messenger.model.Message;
import com.tutorial.webservice.messenger.model.Profile;

public class DatabaseClass {

	// not thread safe
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
}
