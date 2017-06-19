package com.base.oos;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试对象流的读写
 * 
 * 所有需要被ObjectOut普通Stream的writeObject方法写出的对象，
 * 必须要实现可序列化接口，Serializable
 * 否则在写出时会抛出异常
 */                            //序列号接口
public class Person implements Serializable{

	/**
	 * 当一个类实现了序列化接口后，都应当执行维护下面的常量：版本号
	 * 因为该版本号决定着一个对象是否能够成功的进行反序列化
	 * 所有实现序列化接口的类都会有版本号，若我们没有显示的定义它，
	 * 编译器也会为其按照当前类的结构生成一个版本号，
	 * 但是每次该类的结构发生改变，版本号都会改变，所以建议自行定义并维护它
	 * 
	 * 反序列化时OIS会检查要反序列化的实例与其对应的类的当前版本号是否一致，
	 * 若一致，则可以进行反序列化还原对象，但是在过程中若发现当前类的结构
	 * 与要反序列化的结构不同时，则启用兼容模式，即：都有的属性还原，已经没有的属性则忽略
	 * ，若是版本号不一致，则直接抛出异常，但序列化失败
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private int age;
		private String gender;
		private transient List<String> otherInfo;
		//transient 序列化时忽略的内容————————即：不保存
		public Person(){}
		
		public Person(String name, int age, String gender,
				List<String> otherInfo) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.otherInfo = otherInfo;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public List<String> getOtherInfo() {
			return otherInfo;
		}
		public void setOtherInfo(List<String> otherInfo) {
			this.otherInfo = otherInfo;
		}
		
		public String toString(){
			return name+","+age+","+gender+","+otherInfo;
			
		}
		

}
