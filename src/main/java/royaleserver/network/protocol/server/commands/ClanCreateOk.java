package royaleserver.network.protocol.server.commands;

import royaleserver.network.protocol.Commands;
import royaleserver.network.protocol.server.ServerCommand;
import royaleserver.utils.DataStream;
import royaleserver.utils.SCID;

public final class ClanCreateOk extends ServerCommand {
	public static final short ID = Commands.CLAN_CREATE_OK;

	public long clanId;
	public String name;
	public SCID badge;
	public byte unknown_3;
	public byte accepted;

	public ClanCreateOk() {
		super(ID);
	}

	@Override
	public ServerCommand create() {
		return new ClanCreateOk();
	}

	@Override
	public void encode(DataStream stream) {
		stream.putBLong(clanId);
		stream.putString(name);
		stream.putSCID(badge);
		stream.putByte(unknown_3);
		stream.putByte(accepted);
	}
}
