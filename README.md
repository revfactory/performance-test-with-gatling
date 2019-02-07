# API performance 테스트
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Frevfactory%2Fperformance-test-with-gatling.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Frevfactory%2Fperformance-test-with-gatling?ref=badge_shield)


## Gatling
- https://gatling.io/
- LOAD & PERFORMANCE TESTING

## Setting
- IntelliJ
  - Scala PlugIn 추가
  - Scala SDK 설치
  
## Testing
- BootLoadSimulation.scala 에 Simulation 코드 작성
- ``./gradlew loadTest -D SIM_USER=5000``
- /build/reports/gatling/bootloadsimulation-xxx 에서 결과 확인

## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Frevfactory%2Fperformance-test-with-gatling.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Frevfactory%2Fperformance-test-with-gatling?ref=badge_large)