package royaleserver.protocol.messages.client;

import royaleserver.protocol.messages.MessageHandler;
import royaleserver.protocol.Info;
import royaleserver.network.protocol.Message;
import royaleserver.utils.DataStream;

public class AskForAvatarStream extends Message {
	public static final short ID = Info.ASK_FOR_AVATAR_STREAM;

	public AskForAvatarStream() {
		super(ID);
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);
	}

	public boolean handle(MessageHandler handler) throws Throwable {
		return handler.handleAskForAvatarStream(this);
	}
}
