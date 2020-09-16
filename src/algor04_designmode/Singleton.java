package algor04_designmode;

/*
 * 1. labor，勤劳的，即饿汉式
 * 2. lazy01，懒惰的，即懒汉式-非线程安全
 * 3. lazy02，懒惰的，即懒汉式-线程安全
 * 4. doublelock，即双重校验锁-线程安全
 */


public class Singleton {
	public String id;
	public String secret;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tmpid = Singleton_labor.getInstance().id;
		String tmpsecret = Singleton_labor.getInstance().secret;
		System.out.println(tmpid + "  " + tmpsecret);
	}
}

class Singleton_labor extends Singleton{
	private  static Singleton_labor instance = new Singleton_labor();  // 饿体现在这里，直接返回了类的实例
    private  Singleton_labor(){		
        instance.id = "140426";
        instance.secret = "123456";
    }
    public static Singleton_labor getInstance(){
    	return instance;	
    }
}

class Singleton_lazy{
	private  static Singleton_lazy instance = null;	// 懒体现在这里，初始默认为null,运行时才创建
    private  Singleton_lazy(){
        // 类的初始化代码
    }
    public static Singleton_lazy getInstance(){
    	if(instance == null){
            instance = new Singleton_lazy();
        }
        return instance;
    }
}


class Singleton_labor2{
	
}

class Singleton_doublelock{
	
}