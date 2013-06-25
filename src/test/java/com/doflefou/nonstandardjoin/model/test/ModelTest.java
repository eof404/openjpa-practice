package com.doflefou.nonstandardjoin.model.test;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.doflefou.nonstandardjoin.model.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/context.xml" })
public class ModelTest {

	private static final Class<?> PERSISTENCE_ENHANCED = org.apache.openjpa.enhance.PersistenceCapable.class;

	@PersistenceContext(unitName="openjpa-non-standard-joins")
	private EntityManager em;

	@Test
	public void testEnhancement() {
		Assert.assertTrue(ArrayUtils.contains(
				com.doflefou.nonstandardjoin.model.User.class
						.getInterfaces(), PERSISTENCE_ENHANCED));
		Assert.assertTrue(ArrayUtils.contains(
				com.doflefou.nonstandardjoin.model.Person.class
						.getInterfaces(), PERSISTENCE_ENHANCED));
	}

	@Test
	public void testJoin() {

		Person person = em.find(Person.class, 1);
		assertNotNull("Person doesn't exist", person);
		System.out.println(person.getUser());

	}

}
