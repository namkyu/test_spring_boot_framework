* @SpringBootTest
    * to create appliation context
* @ContextConfiguration
    * Don't start full application context
* @EnableConfigurationProperties
    * @ConfiguratonProperties 사용을 지원한다.
    * spring 프로젝트에서는 자동으로 등록된다.
    * 만약 @ConfigurationProperties unit 테스트를 하기 위해서는 @EnableConfigurationProperties 애노테이션을 추가해야 한다.