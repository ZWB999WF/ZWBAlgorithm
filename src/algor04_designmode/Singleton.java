package algor04_designmode;

/*
 * 1. labor�����͵ģ�������ʽ
 * 2. lazy01������ģ�������ʽ-���̰߳�ȫ
 * 3. lazy02������ģ�������ʽ-�̰߳�ȫ
 * 4. doublelock����˫��У����-�̰߳�ȫ
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
	private  static Singleton_labor instance = new Singleton_labor();  // �����������ֱ�ӷ��������ʵ��
    private  Singleton_labor(){		
        instance.id = "140426";
        instance.secret = "123456";
    }
    public static Singleton_labor getInstance(){
    	return instance;	
    }
}

class Singleton_lazy{
	private  static Singleton_lazy instance = null;	// �������������ʼĬ��Ϊnull,����ʱ�Ŵ���
    private  Singleton_lazy(){
        // ��ĳ�ʼ������
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