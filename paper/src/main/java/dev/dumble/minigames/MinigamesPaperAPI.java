package dev.dumble.minigames;

import lombok.Getter;
import lombok.Setter;

public abstract class MinigamesPaperAPI {

	@Getter @Setter
	private static IMinigamesPaper instance;

	public static void instance(IMinigamesPaper instance) {
		if (MinigamesPaperAPI.getInstance() != null) {
            throw new UnsupportedOperationException("You cannot initialize the paper-api instance after it was initialized.");
        }
		MinigamesPaperAPI.setInstance(instance);
	}
}