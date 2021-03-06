package royaleserver.network.protocol.server.messages;

import royaleserver.network.protocol.server.ServerMessage;
import royaleserver.network.protocol.Messages;
import royaleserver.utils.DataStream;

public final class LoginOk extends ServerMessage {
	public static final short ID = Messages.LOGIN_OK;

	public long userId;
	public long homeId;
	public String userToken;
	public String gameCenterId;
	public String facebookId;
	public int serverMajorVersion;
	public int serverBuild;
	public int contentVersion;
	public String environment;
	public int sessionCount;
	public int playTimeSeconds;
	public int daysSinceStartedPlaying;
	public String facebookAppId;
	public String serverTime;
	public String accountCreatedDate;
	public int unknown_16;
	public String googleServiceId;
	public String unknown_18;
	public String unknown_19;
	public String region;
	public String contentURL;
	public String eventAssetsURL;
	public byte unknown_23;

	public LoginOk() {
		super(ID);
	}

	@Override
	public ServerMessage create() {
		return new LoginOk();
	}

	@Override
	public void encode(DataStream stream) {
		stream.putBLong(userId);
		stream.putBLong(homeId);
		stream.putString(userToken);
		stream.putString(gameCenterId);
		stream.putString(facebookId);
		stream.putRrsInt32(serverMajorVersion);
		stream.putRrsInt32(serverBuild);
		stream.putRrsInt32(serverBuild);
		stream.putRrsInt32(contentVersion);
		stream.putString(environment);
		stream.putRrsInt32(sessionCount);
		stream.putRrsInt32(playTimeSeconds);
		stream.putRrsInt32(daysSinceStartedPlaying);
		stream.putString(facebookAppId);
		stream.putString(serverTime);
		stream.putString(accountCreatedDate);
		stream.putRrsInt32(unknown_16);
		stream.putString(googleServiceId);
		stream.putString(unknown_18);
		stream.putString(unknown_19);
		stream.putString(region);
		stream.putString(contentURL);
		stream.putString(eventAssetsURL);
		stream.putByte(unknown_23);
	}
}
