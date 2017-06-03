package royaleserver.protocol.messages.server;

import royaleserver.protocol.Info;
import royaleserver.network.protocol.Message;
import royaleserver.utils.DataStream;

import royaleserver.protocol.messages.component.AllianceRankingEntry;

public class AllianceRankingList extends Message {
	public static final short ID = Info.ALLIANCE_RANKING_LIST;

	public AllianceRankingEntry[] entries;

	public AllianceRankingList() {
		super(ID);

		entries = new AllianceRankingEntry[0];
	}

	@Override
	public void encode(DataStream stream) {
		super.encode(stream);

		entries = new AllianceRankingEntry[stream.getRrsInt32()];
		for (int i = 0; i < entries.length; ++i) {
			entries[i].encode(stream);
		}
	}

	@Override
	public void decode(DataStream stream) {
		super.decode(stream);

		stream.putRrsInt32(entries.length);
		for (int i = 0; i < entries.length; ++i) {
			entries[i] = new AllianceRankingEntry();
			entries[i].decode(stream);
		}
	}
}
