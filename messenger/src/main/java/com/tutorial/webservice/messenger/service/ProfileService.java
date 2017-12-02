package com.tutorial.webservice.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tutorial.webservice.messenger.database.DatabaseClass;
import com.tutorial.webservice.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("profile1", new Profile(1L,"profile1","Profile","1"));
		profiles.put("profile2", new Profile(2L,"profile2","Profile","2"));
	}

	public List<Profile> getAllProfiels() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
}
