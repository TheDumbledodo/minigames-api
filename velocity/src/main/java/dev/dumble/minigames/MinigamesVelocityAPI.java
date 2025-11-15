package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesVelocityAPI {

	@Getter @Setter
	private static IMinigamesVelocity instance;

	public static void instance(IMinigamesVelocity instance) {
		if (MinigamesVelocityAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the velocity-api instance after it was initialized.");
        }
		MinigamesVelocityAPI.setInstance(instance);
	}
}