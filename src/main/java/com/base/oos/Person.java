package com.base.oos;

import java.io.Serializable;
import java.util.List;

/**
 * �������ڲ��Զ������Ķ�д
 * 
 * ������Ҫ��ObjectOut��ͨStream��writeObject����д���Ķ���
 * ����Ҫʵ�ֿ����л��ӿڣ�Serializable
 * ������д��ʱ���׳��쳣
 */                            //���кŽӿ�
public class Person implements Serializable{

	/**
	 * ��һ����ʵ�������л��ӿں󣬶�Ӧ��ִ��ά������ĳ������汾��
	 * ��Ϊ�ð汾�ž�����һ�������Ƿ��ܹ��ɹ��Ľ��з����л�
	 * ����ʵ�����л��ӿڵ��඼���а汾�ţ�������û����ʾ�Ķ�������
	 * ������Ҳ��Ϊ�䰴�յ�ǰ��Ľṹ����һ���汾�ţ�
	 * ����ÿ�θ���Ľṹ�����ı䣬�汾�Ŷ���ı䣬���Խ������ж��岢ά����
	 * 
	 * �����л�ʱOIS����Ҫ�����л���ʵ�������Ӧ����ĵ�ǰ�汾���Ƿ�һ�£�
	 * ��һ�£�����Խ��з����л���ԭ���󣬵����ڹ����������ֵ�ǰ��Ľṹ
	 * ��Ҫ�����л��Ľṹ��ͬʱ�������ü���ģʽ���������е����Ի�ԭ���Ѿ�û�е����������
	 * �����ǰ汾�Ų�һ�£���ֱ���׳��쳣�������л�ʧ��
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private int age;
		private String gender;
		private transient List<String> otherInfo;
		//transient ���л�ʱ���Ե����ݡ�������������������������
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
