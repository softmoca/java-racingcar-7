package racingcar.global.message;

public enum ViewMessage {
    CAR_NAME_INPUT_PROMPT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_COUNT_INPUT_PROMPT("시도할 횟수는 몇 회인가요?"),
    RACE_RESULT_HEADER("\n실행 결과"),
    FINAL_WINNER("최종 우승자 : ");

    private final String message;

    ViewMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

