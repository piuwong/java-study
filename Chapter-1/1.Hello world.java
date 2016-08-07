
public class Hello{
	public static void main(String args[]){
		System.out.println("Hello World!") ;
		System.out.println("Hello World!") ;
		}

}

#public class 类名称{}：文件名称必须与类名称保持一致，一个*。java文件里面只能有一个public class名称
#class 类名称：文件名称可以和类名称不一致，但是生成的*.class是根据文件中的定义的class名称一致的，在一个*。javaa文件
              里面可以定义有多个class，但是编译后会分别形成不同的*。class文件
#总结：严格来讲，在以后的编写开发之中，每一个*。java文件里面都只会出现一个public class 定义，但是在讲课志宏为了方便
#讲解代码，会在一个*。java文件里面出现多个类。
主方法：所有的程序都是由主方法开始执行的：
# public static void main（String args[]）{
	要编写的代码
}
#为了以后方便讲解，会把主方法所在的类使用public class定义，同时这个类我们将其称为主类，


屏幕输出：
 ·输出之后增加换行：System。out。println（内容）；
 ·输出之后不增加换行：System.out.print（内容）；    ln是啥意思，就是line换行的意思print+line=println
范例：public class Hello {
	public static void main(String args[]){
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.print("Hello World!");
		System.out.print("Hello World!");
		System.out.printl("干特么的一群傻吊");
	}
}

现阶段对于数据的输出都依靠System.out.println()完成，这个语法也是比较长，并且以后也会进行解释

格式：
#public class 类名称{
	public static void main（String args[]）{
		所编写的所有代码语句；
			}
}
class 类 {} class 类{} class 类{}

总结：
1.必须可以灵活便携第一个程序；
2.要清楚public class和class声明类的区别
3。千万要记住，主方法的定义结构。

public class hello{
	public static void main(String args[]){
		System.out.println("Hello world!");
	}
}
