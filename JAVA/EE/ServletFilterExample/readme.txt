Java Servlet Filter������������(intercept request)������һЩԤ����(pre-process)��
������������Ӧintercept response���ڷ��͵��ͻ���֮ǰ���к���(post-process). 

���ǽ��о�servlet filter�ĸ����÷���������δ�����������ͨ���򵥵�WebӦ�ó����˽������÷���

Why do we have Servlet Filter?

����һƪ�����У�����ѧϰ�������WebӦ�ó����й���Ự��we learnd how we can manage session in web application.
���������ȷ��ֻ�����û�session is validʱ���ܷ�����Դ�����ǿ���ʹ��servlet session������ʵ��,
��������ܼ򵥣�����������кܶ�servlet��jsps����ô����������룬�����������ά����
�������ϣ������������Щsession���Ե�name��
���ǽ����ò��������ǽ��лỰ�����֤(session authentication)������λ�á�

�����Ϊʲô������servlet�������� 
Servlet�������ǿɲ����Java��������ǿ���ʹ������request�����͵�servlet֮ǰ���غʹ�������
����servlet�������֮�����������Ӧ���ͻؿͻ���֮ǰ���ж���Ӧ������

���ǿ���ʹ��servlet������ִ�е�һЩ���������ǣ�

�����������¼����־�ļ���
��Դ����������֤���Զ�����
�ڽ�request body or header���͵�servlet֮ǰ��ʽ����
ѹ�����͸��ͻ��˵���Ӧ���ݡ�
ͨ�����һЩcookie��������Ϣ�����ı���Ӧ��

������ǰ���ᵽ�ģ�servlet�������ǿɲ���ģ����� deployment descriptor (web.xml) file�����ã�
 Servlet��filter�˴˶���û����ʶ�ģ����ǿ���ͨ���༭web.xml����ӻ�ɾ��servlet��������

���ǿ���Ϊ������Դ�ṩ��������������ǿ�����web.xml��Ϊ������Դ����һϵ�й������� 
���ǿ���ͨ��ʵ��javax.servlet.Filter�ӿ�������Servlet��������

Servlet Filter interface

Servlet Filter�ӿ�������Servlet�ӿڣ�������Ҫʵ���������������Լ���servlet��������
 Servlet Filter�ӿڰ���Filter���������ڷ���������servlet��������

public interface Filter {

	/**
	* ��������ʼ��Filterʱ��������������á��˷����ڹ�����������������ֻ����һ�Σ�this method is called only once in the lifecycle of filter.
	����Ӧ���ڴ˷����г�ʼ���κ���Դ������ʹ��FilterConfig��Filter�ṩinit������servlet�����Ķ���
	���ǿ���������������׳�ServletException��
	*/
	void init(FilterConfig paramFilterConfig) 

	/**
	*   �������ÿ���������ڱ��뽫������Ӧ������Դʱ���á� Container�ṩ�������Ӧ�������ø���������Ϊ������ 
	* FilterChain���ڵ������е���һ��������������������ģʽ��һ���ܺõ����ӡ�
	*/
	doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse, FilterChain paramFilterChain)
	
	/**
	* ������ж��Filterʵ��ʱ���������destroy��������,�������ǿ��Թرչ������򿪵��κ���Դ�ķ����� �˷����ڹ����������������н�����һ�Ρ�
	*/
	void destroy() 
}

Servlet WebFilterע��

��Servlet 3.0��������javax.servlet.annotation.WebFilter��
���ǿ���ʹ�����ע������һ��servlet�������� 
���ǿ���ʹ�ô���ע������init���������������ƺ�������servlet��url patterns and dispatcher types to apply the filter.
���Ƶ�����Ĺ��������ã����ʹ��web.xml��
��Ϊ�ⲻ��Ҫ�����±���������ࡣ
If you make frequent changes to the filter configurations, its better to use web.xml 
because that will not require you to recompile the filter class.

�����Java�е�Servlet������,����J2EE WebӦ�ó����һ����Ҫ���ԣ�����Ӧ�ý������ڸ���servletִ�еĳ�������.

Struts 2ʹ��Servlet Filter���ؿͻ������󲢽�����ת�����ʵ��Ķ����࣬��Щ�������ΪStruts 2 Interceptor�� 
