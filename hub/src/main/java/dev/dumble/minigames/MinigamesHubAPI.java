package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesHubAPI {

	@Getter @Setter
	private static IMinigamesHub instance;

	public static void instance(IMinigamesHub instance) {
		if (MinigamesHubAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the hub-api instance after it was initialized.");
        }
		MinigamesHubAPI.setInstance(instance);
	}
}