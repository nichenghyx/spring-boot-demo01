package com.heyx.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每个属性的值映射到这个组件中
 * 全局配置文件
 * @ConfigurationProperties
 * prefix 前缀person
 * 支持松散语法绑定 \
 * 支持JSR303校验等 加上@Validated   如：在值里加入@
 * 支持复杂类型封装
 *
 * @Component 只有容器中的组件才提供@ConfigurationProperties 功能
 *
 * @Value 支持SpEL 如： @Value("#{11*2}")
 * 不支持复杂类型封装，如maps
 *
 *
 *
 * @PropertySource(value = {"classpath:person.properties"})
 * 加载指定配置文件
 *
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

	/**
	 * <bean class="Person">
	 *  <property name= "lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></propert>
	 * </bean>
	 */
	//@Email
	//@Value("${person.last-name}")
	private String lastName;

	//@Value("#{11*2}")

	private Integer age;

	//@Value("true")
	private Boolean boss;

	//@Value("${person.birth}")
	private Date birth;
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;

	@Override
	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", age=" + age +
				", boss=" + boss +
				", birth=" + birth +
				", maps=" + maps +
				", lists=" + lists +
				", dog=" + dog +
				'}';
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getBoss() {
		return boss;
	}

	public void setBoss(Boolean boss) {
		this.boss = boss;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
