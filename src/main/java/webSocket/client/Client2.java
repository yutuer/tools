package webSocket.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.log4j.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import util.MyUtil;

import com.google.protobuf.ByteString;
import com.pureland.common.protocal.BaseReqProtocal.BaseReq;
import com.pureland.common.protocal.GMReqProtocal.GMReq;
import com.pureland.common.protocal.GMSaveFormationProtocal.GMSaveFormation;
import com.pureland.common.protocal.ReqWrapperProtocal.ReqWrapper;

public class Client2 {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) throws URISyntaxException, InterruptedException {
		WebSocketClient wc = new WebSocketClient(new URI("ws://192.168.1.99:9090/apis/reqWrapper"),
				new Draft_17()) {
			@Override
			public void onOpen(ServerHandshake handshakedata) {
				log("onOpen , handshakedata:%s", handshakedata.getHttpStatusMessage());
			}

			@Override
			public void onMessage(String message) {
				log("onMessage , message:%s", message);
			}

			@Override
			public void onError(Exception ex) {
				log("onError , error:%s", MyUtil.getStackMessage(ex));
			}

			@Override
			public void onClose(int code, String reason, boolean remote) {
				log("onClose , reason:%s", reason);
			}
		};
		wc.connect();
		Thread.sleep(2000L);

		BaseReq.Builder baseReqBuilder = BaseReq.newBuilder();
		ReqWrapper.Builder reqWrapBuilder = ReqWrapper.newBuilder();
		reqWrapBuilder
				.setRequestType(com.pureland.common.protocal.ReqWrapperProtocal.ReqWrapper.RequestType.GM);
		GMReq.Builder gmBuilder = GMReq.newBuilder();
		GMSaveFormation.Builder gmsaveFormationBuilder = GMSaveFormation.newBuilder();
		gmsaveFormationBuilder.setPngData(ByteString.copyFrom(new byte[512 * 512]));
		gmBuilder.setGmSaveFormation(gmsaveFormationBuilder.build());
		reqWrapBuilder.setGmReq(gmBuilder.build());
		baseReqBuilder.setReqWrapper(reqWrapBuilder.build());
		wc.send(baseReqBuilder.build().toByteArray());
	}

	private static void log(String str, Object... objs) {
		log.info(String.format(str + "\n", objs));
	}

}