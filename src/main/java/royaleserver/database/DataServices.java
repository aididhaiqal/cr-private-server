package royaleserver.database;

import royaleserver.database.service.AssetService;
import royaleserver.database.service.CardService;
import royaleserver.database.service.PlayerService;

/**
 * A class that contains all the services.
 */
public final class DataServices {
	public final AssetService assetService;
	public final CardService cardService;
	public final PlayerService playerService;

	public DataServices(AssetService assetService, CardService cardService, PlayerService playerService) {
		this.assetService = assetService;
		this.cardService = cardService;
		this.playerService = playerService;
	}
}
