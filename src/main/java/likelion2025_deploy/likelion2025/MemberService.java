package likelion2025_deploy.likelion2025;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    private final Map<String, String> memberList = Map.ofEntries(
            Map.entry("신지환", "대표"), Map.entry("유민주", "부대표"), Map.entry("류다인", "기획 파트장"),
            Map.entry("박지효", "디자인 파트장"), Map.entry("신민경", "백엔드 파트장"), Map.entry("백승현", "프론트 파트장"),
            Map.entry("이시온", "총무"), Map.entry("김선정", "교내운영팀장"), Map.entry("공윤호", "대외협력팀장"),
            Map.entry("고영명", "기획팀장"), Map.entry("김하연", "디자인팀장"), Map.entry("유승빈", "기획부장")
    );

    /**
     * 회원 목록을 조회하는 메서드입니다.
     * @return 회원 이름으로 구성된 List 인스턴스
     */
    public List<String> getMemberList() {
        // 여기에 원래는 데이터베이스 조회하는 코드가 있어야겠죠?
        return memberList.keySet().stream().toList();
    }

    /**
     * 주어진 이름을 가진 회원의 직위를 조회하는 메서드입니다.
     * @param name 회원 이름
     * @return 회원 직위
     * @throws IllegalArgumentException 주어진 이름을 가진 회원이 없는 경우에 발생
     */
    public String getMemberPosition(String name) {
        // 여기에 원래는 데이터베이스 조회하는 코드가 있어야겠죠?
        String position = memberList.get(name);
        if (position == null) {
            throw new IllegalArgumentException("The member %s not found.".formatted(name));
        }
        return position;
    }
}
