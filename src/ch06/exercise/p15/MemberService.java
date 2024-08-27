package ch06.exercise.p15;

public class MemberService {
    // 메소드 작성
    public boolean login(String id, String password) {

        return id.equals("hong") && password.equals("12345");
    }

    public void logout(String id) {
        System.out.println(STR."\{id}님이 로그아웃 되었습니다.");
    }
}
