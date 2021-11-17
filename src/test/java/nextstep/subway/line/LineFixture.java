package nextstep.subway.line;

import nextstep.subway.line.dto.LineRequest;
import nextstep.subway.line.dto.LineUpdateRequest;

public class LineFixture {
	public static final Long UNKNOWN_LINE_ID = Long.MAX_VALUE;

	public static LineRequest 노선_2호선_생성_요청값(Long upStationId, Long downStationId, int distance) {
		return new LineRequest("2호선", "green lighten-1", upStationId, downStationId, distance);
	}

	public static LineRequest 노선_4호선_생성_요청값(Long upStationId, Long downStationId, int distance) {
		return new LineRequest("4호선", "blue lighten-1", upStationId, downStationId, distance);
	}

	public static LineUpdateRequest 노선_수정_요청값() {
		return new LineUpdateRequest("100호선", "pink lighten-1");
	}
}
