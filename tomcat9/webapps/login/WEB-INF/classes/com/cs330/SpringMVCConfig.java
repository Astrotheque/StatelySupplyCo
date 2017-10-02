@EnableWebMvc
@Configuration
public class ClientWebConfig extends WebMvcConfigurerAdapter {
   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      super.addViewControllers(registry);
      registry.addViewController("/sample.html");
   }
   @Bean
   public ViewResolver viewResolver() {
      InternalResourceViewResolver bean = new InternalResourceViewResolver();
      bean.setViewClass(JstlView.class);
      bean.setPrefix("/WEB-INF/view/");
      bean.setSuffix(".jsp");
 
      return bean;
   }
}