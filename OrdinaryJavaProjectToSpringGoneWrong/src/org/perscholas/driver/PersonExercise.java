/**
 * 
 */
package org.perscholas.driver;

import org.perscholas.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author CTStudent
 *
 */
public class PersonExercise {
	private Person person;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonExercise pe = new PersonExercise();
		pe.run();

	}
	private void run() {
		ApplicationContext context = new FileSystemXmlApplicationContext("applicationContext.xml");
		person = (Person)context.getBean("Fred");
		System.out.println(person);
	}

}
