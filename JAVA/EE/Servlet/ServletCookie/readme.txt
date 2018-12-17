Cookie��client-serverͨ���о���ʹ�õģ��������ض���Java�Ķ�����

Cookie��һЩ�����÷��ǣ�
Some of the common usage of cookies are:

1. ʹ��Cookies���лỰ��֤(Session authentication)��������Servlet Session Tutorial���˽⵽��
HttpSessionʹ�á�JSESSIONID��cookie�������û��Ự��

2. ���ݿͻ���ƫ�öԿͻ����и��Ի���Ӧ���������ǿ����ڿͻ���������н�������ɫ����Ϊcookie��
Ȼ��ʹ�������Զ�����Ӧ������ɫ��ͼ��ȡ�

Cookies in Java Servlet

Cookie��server���͵�client���ı����ݣ�����������client���ؼ�����ϡ� ��client��server��������ʱ��
���Ὣ�������洢��cookie���ݸ�����ͷ��������ʾ��

Cookie	Test="Test Cookie5"

�ͻ��˿�������������Ͷ��cookie�����˼�ֵ��֮�⣬������������Ӧͷ����ͻ��˷���һЩ�������ݣ�
��������������ʾ:

Set-Cookie	Counter=7;
Version=1;
Comment="SetCookie Counter";
Domain="localhost";
Max-Age=86400;
Expires=Thu, 15-Aug-2013 20:19:19 GMT;
Path=/cookie/SetCookie

Set-Cookie	Test="Test Cookie7";
Version=1;
Comment="Test Cookie"

��ע�⣬��������Ϊcookie����һЩ������Ϣ������ comment, domain, maximum time before cookie expires.
(cookie����ǰ���ʱ��),�Լ�Path where browser should send the cookie back in request.
���ǵ�client�����������cookieʱ����ֻ�ᷢ��cookie��name��value��

Servlet APIͨ��ʵ��Serializable��Cloneable�ӿڵ�javax.servlet.http.Cookie���ṩcookie֧�֡�

HttpServletRequest getCookies()������Ϊ�˴�request�л�ȡCookie���飬��Ϊû�б�Ҫ��Cookie��ӵ�request�У�
û�з����������û����cookie��request��

�ṩ��HttpServletResponse addCookie��Cookie c������������Ӧͷ�и���cookie��
û������cookie��getter����.

Cookie����һ������name��value�Ĺ��캯������Ϊ������cookie�ı�����������������������ǿ�ѡ�ġ�

Some important methods of Cookie class are:

getComment���� - ����������cookie��;��ע�ͣ��ڿͻ���ʹ�á���ע�⣬���ͻ����������ͷ�з���cookieʱ��
�����������յ�����Ϣ�����ǿ���ʹ��setComment���������ڷ�����������cookie������

getDomain���� - ����cookie�����������ǿ���ʹ��setDomain������������cookie��������
�����������������cookie�������͸����ض�������

getMaxAge���� - ����Ϊ��λ����������䡣���ǿ���ʹ��setMaxAge����������cookie�ĵ���ʱ�䡣

getName���� - ����cookie�����ƣ�������������ͷ�������ʹ�á�����û��setter������ֻ��ͨ�����캯������һ�����ơ�

getPath���� - ������������ش�cookie�ķ������ϵ�·�������ǽ���������ʾ��������cookie�������͵��ض���Դ��
���ǿ���ʹ��setPath������ָʾ���������cookie���͵��ض���Դ��

getSecure���� - ����������ͨ����ȫЭ�鷢��cookie���򷵻�true;������������ʹ���κ�Э�鷢��cookie��
�򷵻�false�����ǿ���ʹ��setSecure��������ָʾ�������ͨ����ȫЭ�鷢��cookie��

getValue���� - ��String����ʽ����cookie��ֵ������setValue��������������cookie��ֵ��

getVersion���� - ���ش�cookie���ϵ�Э��汾������һ���汾��setter������

isHttpOnly���� - ����Cookie�Ƿ��ѱ��ΪHttpOnly������һ��setter���������ǿ���ʹ������ָʾ�ͻ��˽���������HTTP��

Java Servlet Cookie Example


