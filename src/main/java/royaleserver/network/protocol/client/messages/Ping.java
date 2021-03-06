package royaleserver.network.protocol.client.messages;

import royaleserver.network.protocol.client.ClientMessage;
import royaleserver.network.protocol.client.ClientMessageHandler;
import royaleserver.network.protocol.Messages;
import royaleserver.utils.DataStream;

public final class Ping extends ClientMessage {
	public static final short ID = Messages.PING;

	public Ping() {
		super(ID);
	}

	@Override
	public ClientMessage create() {
		return new Ping();
	}

	@Override
	public boolean handle(ClientMessageHandler handler) throws Throwable {
		return handler.handlePing(this);
	}

	@Override
	public void decode(DataStream stream) {
	}
}
