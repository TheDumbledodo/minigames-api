package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesProxyAPI {

	@Getter @Setter
	private static IMinigamesProxy instance;

	public static void instance(IMinigamesProxy instance) {
		if (MinigamesProxyAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the velocity-api instance after it was initialized.");
        }
		MinigamesProxyAPI.setInstance(instance);
	}
}