package likelion2025_deploy.likelion2025;

import io.swagger.v3.oas.annotations.media.Schema;

public class MemberDetailResponse {

    @Schema(title = "이름", type = "string", example = "신민경")
    private final String name;

    @Schema(title = "직위", type = "string", example = "백엔드 파트장")
    private final String position;

    public MemberDetailResponse(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
