package likelion2025_deploy.likelion2025;

import io.swagger.v3.oas.annotations.media.Schema;

public class MemberResponse {

    @Schema(title = "이름", type = "string", example = "신민경")
    private final String name;

    public MemberResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
