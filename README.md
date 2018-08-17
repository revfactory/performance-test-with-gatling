# API performance 테스트

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