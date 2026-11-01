# Smart Farm

**작물 선택부터 환경 표시와 제어 시뮬레이션까지 연결한 웹/PWA 프로토타입**

[화면 체험](https://seung-gwan.github.io/smart-farm/) · [소스 코드](https://github.com/seung-gwan/smart-farm) · [포트폴리오로 돌아가기](../README.md)

## 결과물

작물과 품종을 선택하면 온도, 습도, 토양수분, CO₂, pH, 광량 정보를 대시보드로 확인할 수 있습니다.
장치를 수동으로 조작하거나 자동 조절을 켜서 목표 범위에 따라 값과 장치 상태가 변하는 흐름을 체험합니다.

1. 작물과 품종을 선택합니다.
2. 대시보드에서 현재값과 권장 범위를 확인합니다.
3. 시험 모드에서 장치를 조작하고 환경 변화를 비교합니다.
4. 자동 조절과 시험 날씨를 바꾸며 환기·냉난방 판단을 확인합니다.

## 공부한 내용

| 주제 | 코드와 화면에 나타나는 내용 |
| --- | --- |
| 데이터와 화면 연결 | 작물·품종 데이터를 읽어 선택 화면과 대시보드 구성 |
| 상태 관리 | 선택한 작물, 센서값, 목표값, 장치 상태를 화면에 반영 |
| 제어 로직 | 범위를 벗어났을 때 보정하고 목표에 도달하면 장치를 끄는 흐름 |
| 외부 데이터 활용 | Open-Meteo 날씨를 활용한 환기 판단 |
| PWA | manifest와 service worker를 통한 설치·캐시 구성 |
| 기능 검증 | 목표값·운전 모드·외기 우선 제어 등을 다루는 테스트 파일 |

## 주요 파일

- [`app.js`](https://github.com/seung-gwan/smart-farm/blob/main/app.js): 대시보드 상태와 UI 동작
- [`ventilation.js`](https://github.com/seung-gwan/smart-farm/blob/main/ventilation.js): 환기 판단
- [`simulation.js`](https://github.com/seung-gwan/smart-farm/blob/main/simulation.js): 모의 환경 변화
- [`crop-database.json`](https://github.com/seung-gwan/smart-farm/blob/main/crop-database.json): 작물 데이터
- [`README.md`](https://github.com/seung-gwan/smart-farm/blob/main/README.md): 상세 실행 방법과 제어 기준

## 실행과 현재 범위

공개 데모에서 웹 화면과 시뮬레이션을 체험할 수 있습니다.
실제 센서 모드는 수신값을 조회하는 구조이며, 저장소 설명 기준 실제 장비는 아직 연결되지 않았습니다.
사진 진단은 로컬 연결기를 사용하는 기능으로, 공개 데모에서 이용하려면 별도 로컬 실행이 필요합니다.

이 포트폴리오 정리에서는 기존 소스와 설명을 확인했습니다. 장치 연동과 전체 기능 테스트를 새로 수행한 결과는 포함하지 않습니다.

## 다음 개선점

- 사용자가 목표값을 바꿨을 때의 장치 상태를 화면으로 기록하기
- 실제 센서의 미연결·지연·오류 응답을 비교하는 시연 추가하기
- 대시보드 UI와 제어 로직의 책임을 나누어 읽기 쉽게 정리하기

근거: [프로젝트 README](https://github.com/seung-gwan/smart-farm/blob/main/README.md), [대시보드 코드](https://github.com/seung-gwan/smart-farm/blob/main/app.js), [환기 코드](https://github.com/seung-gwan/smart-farm/blob/main/ventilation.js).
