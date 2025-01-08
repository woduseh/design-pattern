# 프록시 패턴
#### A.K.A Proxy

---
### 도입 의도
- 프록시는 다른 객체에 대한 대체 또는 자리표시자를 제공할 수 있는 구조 디자인 패턴이다.
- 프록시는 원래 객체에 대한 접근을 제어하므로, 당신의 요청이 원래 객체에 전달되기 전 또는 후에 무언가를 수행할 수 있도록 한다.

### 문제
- 필요할 때가 있기는 하지만, 항상 필요한 것은 아닌 방대한 양의 시스템 자원을 소비하는 거대한 객체가 있다고 가정
- 실제로 필요할 때만 이 객체를 만들어서 지연된 초기화를 구현할 수 있지만, 그러면 객체의 모든 클라이언트들은 어떤 지연된 초기화 코드를 실행해야 하는데, 불행히도 이것은 아마도 많은 코드 중복을 초래할 것이다.

### 해결 방안
- 프록시 패턴은 원래 서비스 객체와 같은 인터페이스로 새 프록시 클래스를 생성한다.
- 클라이언트로부터 요청을 받으면 이 프록시는 실제 서비스 객체를 생성하고 모든 작업을 이 객체에 위임한다.
- 클래스의 메인 로직 이전이나 이후에 무언가를 실행해야 하는 경우 프록시는 해당 클래스를 변경하지 않고도 이 무언가를 수행할 수 있도록 한다.

### 구현방법
- 기존 서비스 인터페이스가 없는 경우, 서비스 인터페이스를 하나 생성하여 프록시와 서비스 객체 간의 상호 교환을 가능하게 한다.
- 프록시 클래스를 만든다.
  - 이 클래스에는 서비스에 대한 참조를 저장하기 위한 필드가 있어야 한다.
  - 일반적으로 프록시들은 서비스들의 전체 수명 주기를 생성하고 관리한다.
- 목적에 따라 프록시 메서드들을 구현한다.
  - 예를 들어, 프록시가 지연된 초기화를 구현하는 경우 앱이 시작될 때 객체를 생성하는 대신, 객체 초기화를 실제로 초기화가 필요한 시점까지 지연할 수 있다.
- 클라이언트가 프록시를 받을지 실제 서비스를 받을지를 결정하는 생성 메서드를 도입하는 것을 고려한다.
  - 이 메서드는 프록시 클래스의 간단한 정적 메서드이거나 완전한 팩토리 메서드일 수도 있다.

### 장단점
- 장점
  - 클라이언트들이 알지 못하는 상태에서 서비스 객체를 제어할 수 있다.
  - 클라이언트들이 신경 쓰지 않을 때 서비스 객체의 수명 주기를 관리할 수 있다.
  - 프록시는 서비스 객체가 준비되지 않았거나 사용할 수 없는 경우에도 작동한다.
  - 서비스나 클라이언트들을 변경하지 않고도 새 프록시들을 도입할 수 있어 개방 폐쇄 원칙을 준수할 수 있다.
- 단점
  - 새로운 클래스들을 많이 도입해야 하므로 코드가 복잡해질 수 있다.
  -  서비스의 응답이 늦어질 수 있다.

### 다른 패턴들과의 관계