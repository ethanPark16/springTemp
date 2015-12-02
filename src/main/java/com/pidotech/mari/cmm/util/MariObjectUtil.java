package com.pidotech.mari.cmm.util;

import java.lang.reflect.Constructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MariObjectUtil.java
 * ��ü �ε��� �����ϴ� ��ƿ
 *
 * @author ethan
 * @since 2015. 11. 25.
 * @etc 
 *
 */
public class MariObjectUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(MariObjectUtil.class);
	
	/**
     * Ŭ���������� ��ü�� �ε��Ѵ�.
     * 
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws Exception
     */
	public static Class<?> loadClass(String className) throws ClassNotFoundException, Exception {

		Class<?> clazz = Thread.currentThread().getContextClassLoader().loadClass(className);

		if (clazz == null) {
			clazz = Class.forName(className);
		}

		return clazz;
	}

    /**
     * Ŭ���������� ��ü�� �ε��� �� �ν��Ͻ�ȭ �Ѵ�.
     * 
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws Exception
     */
	public static Object instantiate(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
		Class<?> clazz;

		try {
			clazz = loadClass(className);
			return clazz.newInstance();
		} catch (ClassNotFoundException e) {
			LOGGER.error("{} : Class is can not instantialized.", className);
			throw new ClassNotFoundException();
		} catch (InstantiationException e) {
			LOGGER.error("{} : Class is can not instantialized.", className);
			throw new InstantiationException();
		} catch (IllegalAccessException e) {
			LOGGER.error("{} : Class is not accessed.", className);
			throw new IllegalAccessException();
		} catch (Exception e) {
			LOGGER.error("{} : Class is not accessed.", className);
			throw new Exception(e);
		}
	}

    /**
     * Ŭ���������� �Ķ���Ͱ� �ִ� Ŭ������ �����ڸ� �ν��Ͻ�ȭ �Ѵ�.
     * ��) Class <?> clazz = EgovObjectUtil.loadClass(this.mapClass);
     * Constructor <?> constructor = clazz.getConstructor(new Class[]{DataSource.class, String.class});
     * Object [] params = new Object [] {
     *     getDataSource(), getUsersByUsernameQuery()
     *  };
     * this.usersByUsernameMapping = (EgovUsersByUsernameMapping)constructor.newInstance(params);
     * 
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws Exception
     */
	public static Object instantiate(String className, String[] types, Object[] values) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
		Class<?> clazz;
		Class<?>[] classParams = new Class[values.length];
		Object[] objectParams = new Object[values.length];

		try {
			clazz = loadClass(className);

			for (int i = 0; i < values.length; i++) {
				classParams[i] = loadClass(types[i]);
				objectParams[i] = values[i];
			}

			Constructor<?> constructor = clazz.getConstructor(classParams);
			return constructor.newInstance(values);

		} catch (ClassNotFoundException e) {
			LOGGER.error("{} : Class is can not instantialized.", className);
			throw new ClassNotFoundException();
		} catch (InstantiationException e) {
			LOGGER.error("{} : Class is can not instantialized.", className);
			throw new InstantiationException();
		} catch (IllegalAccessException e) {
			LOGGER.error("{} : Class is not accessed.", className);
			throw new IllegalAccessException();
		} catch (Exception e) {
			LOGGER.error("{} : Class is not accessed.", className);
			throw new Exception(e);
		}
	}

    /**
     * ��ü�� Null ���� Ȯ���Ѵ�.
     * 
     * @param object
     * @return Null�ΰ�� true / Null�� �ƴѰ�� false
     */
    public static boolean isNull(Object object) {
        return ((object == null) || object.equals(null));
    }
}
