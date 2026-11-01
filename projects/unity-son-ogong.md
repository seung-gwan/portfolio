# 손오공 — Unity 2D 액션 팀 프로젝트

![시연 영상의 게임 화면](https://raw.githubusercontent.com/seung-gwan/game-dev-studies/main/media/unity-final-gameplay.jpg)

떨어지는 물체를 공격·방어·회피하며 점수를 얻는 PC용 미니게임입니다.
컴퓨터게임기초 수업의 **화천인재** 2인 팀 프로젝트로, 발표 자료상 제작 기간은 3개월입니다.

| 작업 | 담당 |
| --- | --- |
| 기획 | 유승관 · 이승훈 공동 |
| 게임 구현 전반 | 유승관 |
| 이미지 디자인 | 이승훈 |

제가 맡은 구현은 3개 레인 이동과 점프, 공격·방어, 낙하물 판정, 경고 UI, 체력·점수, 게임오버와 장면 연결입니다.

## 공부한 내용과 결과

- 입력과 물리 상태를 연결하는 캐릭터 조작
- 코루틴과 충돌 범위를 활용한 공격·방어
- 점수에 따라 위험 낙하물과 경고가 등장하는 흐름
- PlayerPrefs로 최종 점수를 저장하고 게임오버 UI에 표시
- 시작 → 조작 안내 → 플레이 → 게임오버의 장면 연결

5월 7일 보고서에는 캐릭터가 지면을 통과하던 문제를 콜라이더 적용으로 해결한 과정이 남아 있습니다.
4월 30일 작업 화면, 5월 보고서와 6월 시연·발표를 [제작 과정](https://github.com/seung-gwan/game-dev-studies/tree/main/unity/project_New)에서 함께 볼 수 있습니다.

**[최종 시연 영상](https://github.com/seung-gwan/game-dev-studies/releases/download/showcase-2026-06/unity-final-gameplay.mp4)** · [C# 소스](https://github.com/seung-gwan/game-dev-studies/tree/main/unity/project_New/Assets/script) · [프로젝트 기록](https://github.com/seung-gwan/game-dev-studies/tree/main/unity/project_New)

공개본은 코드·장면을 선별한 자료이며, 원래 이미지 리소스 복원이 필요합니다. 새 빌드 검증은 수행하지 않았습니다.

[전체 포트폴리오](../README.md)
