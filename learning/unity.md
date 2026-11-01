# Unity · C# — 팀 프로젝트와 게임 학습

**입력한 값을 이동으로 연결하고, 게임 상태를 화면에 표시하는 과정을 실습했습니다.**

학교 프로젝트 설정에 기록된 Unity 버전은 `6000.0.69f1`입니다.
자동차 실습의 핵심 스크립트와 함께 [게임 개발 저장소](https://github.com/seung-gwan/game-dev-studies/tree/main/unity)에 6개 프로젝트의 C# 코드·장면·프리팹과 설정을 보관했습니다.

## 팀 프로젝트 — 손오공

떨어지는 물체를 공격·방어·회피하며 점수를 얻는 2D 액션 게임입니다.
이동·점프, 낙하물 생성·판정, 경고 UI, 체력·점수와 게임오버 흐름을 구현했습니다.

**공동 기획 / 게임 구현 전반: 유승관 / 이미지 디자인: 이승훈**

[제작 과정과 코드](https://github.com/seung-gwan/game-dev-studies/tree/main/unity/project_New) · [최종 시연](https://github.com/seung-gwan/game-dev-studies/releases/download/showcase-2026-06/unity-final-gameplay.mp4)

제공된 영상의 플레이 장면을 확인했으며, 현재 공개본의 에디터 실행·새 빌드는 별도로 수행하지 않았습니다.

## 추가 실습

[Car_Game, Cat, ClimbCloud, 룰렛, C# 기초 실습 목록](https://github.com/seung-gwan/game-dev-studies/blob/main/unity/README.md)

## 1. 자동차 조작과 거리 표시

[`CarController.cs`](../examples/unity/CarController.cs) · [`GameDirector.cs`](../examples/unity/GameDirector.cs)

| 구성 | 실습 내용 |
| --- | --- |
| 입력 | 마우스를 누른 위치와 뗀 위치의 X 좌표 차이 계산 |
| 이동 | 좌표 차이를 이동량에 반영하고 매 프레임 감쇠 적용 |
| UI | 자동차와 깃발의 X 좌표 차이를 TextMeshPro로 표시 |
| 상태 표시 | 깃발 위치를 지나면 `Game Over` 문구 표시 |

원래 프로젝트에서 `car`, `flag`, `Distance` 오브젝트를 사용하며, `Distance`에는 `TextMeshProUGUI`가 필요합니다.
원래 `Car_Game` 프로젝트의 `Game_Scene`에서 오브젝트와 컴포넌트를 연결하여 실행하는 구성입니다.

다음 개선점:

- `Time.deltaTime`을 활용해 프레임 수에 따른 이동량 차이 줄이기
- UI 컴포넌트 참조를 저장하여 매 프레임 조회 줄이기
- 문자열 이름으로 찾는 오브젝트 참조를 Inspector에서 연결하기
- 종료 문구 표시와 실제 이동 정지를 게임 상태로 연결하기

## 2. 점프와 카메라 실습

학교 `ClimbCloud` 프로젝트의 스크립트에서는 다음 내용을 다뤘습니다.

- Space 입력과 `Rigidbody2D.AddForce`를 통한 점프
- Shift 키 입력과 수평 힘 적용
- 플레이어의 Y 좌표를 따라가는 카메라
- 트리거와 클릭 입력에 따른 장면 전환

이 기록에서는 코드와 장면 파일의 존재를 확인했습니다. Unity 에디터에서 실행하거나 빌드한 결과는 새로 검증하지 않았습니다.
플레이 영상과 빌드 파일을 추가하고, 스크립트 파일명·클래스명과 컴포넌트 연결 상태를 점검하는 것을 다음 과제로 남깁니다.

자료: 학교 Unity 프로젝트의 `Assets/Scripts`, 장면 목록, `ProjectSettings/ProjectVersion.txt`.

[학습 목록](README.md)
