package royaleserver.protocol.messages.client;

import royaleserver.protocol.messages.MessageHandler;
import royaleserver.protocol.Info;
import royaleserver.network.protocol.Message;
import royaleserver.utils.DataStream;

public class ClientCapabilities extends Message {
	public static final short ID = Info.CLIENT_CAPABILITIES;

	public int ping;
	public String connectionInterface;

	public ClientCapabilities() {
		super(ID);

		ping = 0;
		connectionInterface = "";
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);

		stream.putRrsInt32(ping);
		stream.putString(connectionInterface);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);

		ping = stream.getRrsInt32();
		connectionInterface = stream.getString();
	}

	public boolean handle(MessageHandler handler) throws Throwable {
		return handler.handleClientCapabilities(this);
	}
}
