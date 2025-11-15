package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesAPI {

	@Getter @Setter
	private static IMinigames instance;

	public static void instance(IMinigames instance) {
		if (MinigamesAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the api instance after it was initialized.");
        }
		MinigamesAPI.setInstance(instance);
	}
}