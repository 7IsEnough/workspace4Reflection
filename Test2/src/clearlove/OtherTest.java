package clearlove;

import Promise.Person;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.junit.Test;

public class OtherTest {

  /*
    获取构造器结构
  */
  @Test
  public void test1() {
    Class clazz = Person.class;
    //getConstructors()：当前运行时类中声明为public的构造器
    Constructor[] constructors = clazz.getConstructors();

    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }
    System.out.println();

    //getDeclaredConstructors()：获取当前运行时类中声明的所有的构造器
    Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
    for (Constructor declaredConstructor : declaredConstructors) {
      System.out.println(declaredConstructor);
    }
  }

  //获取运行时类的父类
  @Test
  public void test2() {
    Class clazz = Person.class;
    Class superclass = clazz.getSuperclass();
    System.out.println(superclass);
  }

  //获取运行时类的带泛型的父类
  @Test
  public void test3() {
    Class clazz = Person.class;
    Type superclass = clazz.getGenericSuperclass();
    System.out.println(superclass);
  }

  //获取运行时类的带泛型的父类的泛型
  @Test
  public void test4() {
    Class clazz = Person.class;
    Type superclass = clazz.getGenericSuperclass();
    ParameterizedType paramType = (ParameterizedType) superclass;
    //获取泛型类型
    Type[] actualTypeArguments = paramType.getActualTypeArguments();
    System.out.println(actualTypeArguments[0].getTypeName());
  }

  //获取运行时类实现的接口
  @Test
  public void test5() {
    Class clazz = Person.class;
    Class[] interfaces = clazz.getInterfaces();
    for (Class c : interfaces) {
      System.out.println(c);
    }
    System.out.println();

    //获取运行时类的父类实现的接口
    Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
    for (Class c : interfaces1) {
      System.out.println(c);
    }

  }

  //获取运行时类所在的包
  @Test
  public void test6() {
    Class clazz = Person.class;
    Package pack = clazz.getPackage();
    System.out.println(pack);
  }

  //获取运行时类声明的注解
  @Test
  public void test7() {
    Class clazz = Person.class;
    Annotation[] annotations = clazz.getAnnotations();
    for (Annotation annotation : annotations) {
      System.out.println(annotation);
    }

  }
}
