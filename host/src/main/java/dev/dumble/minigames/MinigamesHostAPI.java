package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesHostAPI {

	@Getter @Setter
	private static IMinigamesHost instance;

	public static void instance(IMinigamesHost instance) {
		if (MinigamesHostAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the host-api instance after it was initialized.");
        }
		MinigamesHostAPI.setInstance(instance);
	}
}