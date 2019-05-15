# SpringBoot 2.x + OAuth2 sample

- oauth2-client
  - OAuth2 Client
- oauth2-resource-server
  - OAuth2 Resource Server
- oauth2-gateway
  - Spring Cloud Gateway + OAuth2 Client


### SpringBoot 2.x 버전에서 OAuth2 개발시
  - EnableOAuth2SSO, EnableResourceServer 등 사용하지 말것
  - SpringBoot 2.0.x 버전 이하에서 개발 -> SringBoot 2.x 버전으로 업그레이드 할 때
    - https://docs.spring.io/spring-security-oauth2-boot/docs/current/reference/htmlsingle 가이드 참고


### Spring Cloud Gateway
https://cloud.spring.io/spring-cloud-gateway/single/spring-cloud-gateway.html
- 비동기 지원
- spring-boot-starter-webflux 사용. spring-boot-starter-web과 호환되지 않음
- Spring Cloud Netflix Zuul과 유사한 기능을 제공
  - embedded reverse proxy
  - OAuth2 access token downstream to the service
  

### Spring Cloud Greenchwich.RELEASE
https://spring.io/blog/2019/01/23/spring-cloud-greenwich-release-is-now-available
- SpringBoot 2.x 버전부터 지원
- Spring Cloud Netflix 패키지에서 maintenence mode로 전환된 라이브러리가 많기 때문에 대체 라이브러리 사용을 권장함
  - maintenence mode : 더이상 새로운 feature가 없음을 말함
  - 대체 라이브러리는 위 링크 페이지에서 확인
  - Zuul
    - Netflix에서 비동기를 지원하기 위해 Zuul1 -> Zuul2로 업그레이드함
    - 업그레이드하면서 하위 호환성 지원 안함. 자기네꺼만 고침
    - 그래서 Zuul은 Spring Eco 시스템 취지에 더이상 맞지 않음
    - Spring cloud Gateway는 Zuul2를 사용하지 않고 새로 만듬
