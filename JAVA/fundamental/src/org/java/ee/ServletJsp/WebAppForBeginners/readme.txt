Content Type �C text, html, image, pdf etc. Also known as MIME type
Content Type - �ı���html��ͼ��pdf�ȡ�Ҳ��ΪMIME type

Some of the mostly used mime types are text/html, 
text/xml, application/xml etc.

�˿ں�0��1023��������֪�ķ���ı����˿ڣ�����80��ʾHTTP��443��ʾHTTPS��21��ʾFTP�ȡ�

JSP ia also server side technology ������HTMLһ����������������Ҫ
�ĵط���Ӷ�̬���ݵĸ��ӹ��ܡ�
JSP���ʺ��ڱ�ʾ����Ϊ�������ױ�д����Ϊ������HTMLһ����


���ǽ����Ժ�������и���ϸ���о�Servlet��JSP�����ڽ�������֮ǰ��
����Ӧ�úܺõ����Java WebӦ�ó����һЩ����:

Web Container

Tomcat��һ��Web����������Client��Web��������������ʱ,
Web�����������󴫵ݸ�Web������Ȼ��Web�����������ҵ������������ȷ��Դ��servlet��JSP),
Ȼ����Щ��ԴJSP���ṩ��Web��������Ȼ��Web����������Ӧ���ͻؿͻ��ˡ�

��Web�������ܵ�Web���������������󣬷��ִ����������Դ��Servletʱ��
������������������HTTPServletRequest��HTTPServletResponse�� 
Ȼ��������URL�ҵ���ȷ��servlet����Ϊ���󴴽�һ���̡߳�Ȼ��������servlet service����������
Ȼ�����HTTP������service������������doGet������doPost����������
 Servlet�������ɶ�̬ҳ�沢����д����Ӧ�� servlet�߳���ɺ������Ὣ��Ӧת��ΪHTTP��Ӧ�����䷢�ͻؿͻ��ˡ�

 
Some of the important work done by web container are:
Web������ɵ�һЩ��Ҫ�����ǣ�

Communication Support(ͨ��֧��) - Web�����ṩWeb��������servlet��JSP֮��ļ�ͨ�ŷ�ʽ��
�������������ǲ���Ҫ�����������׽���������(we don't need to build a server socket to listen for
any request from web server, parse the request and generate response.
)����Web���������κ����󣬽�������������Ӧ��
������Щ��Ҫ�Ҹ��ӵ���������������ɵģ�������Ҫ��ע��������Ӧ�ó����ҵ���߼���

Lifecycle and Resource Management (�������ں���Դ����) - Container�������(take care of managing the
life cycle of servlet.)servlet���������ڡ� 
Container����servlet���ص��ڴ��У���ʼ��servlet������servlet�������������ǡ�
 Container���ṩJNDI��ʵ�ó���������Դ�غ͹���

Multithreading Support (���߳�֧�� ) - ����Ϊÿ��servlet���󴴽����̣߳���ÿ�����������ʱ���߳�dies.
��ˣ�servlet�������ÿ��������г�ʼ�����Ӷ���ʡ��ʱ����ڴ档

JSP֧�� - JSP������������ͨ��java�࣬Web�����ṩ��JSP��֧�֡�Ӧ�ó����е�ÿ��JSP��������
���벢ת��ΪServlet��Ȼ������������servletһ���������ǡ�
Every JSP in the application is compiled by container and converted to 
Servlet and then container manages them like other servlets.

��������Miscellaneous Task  - Web����������Դ�أ�ִ���ڴ��Ż������������ռ������ṩ��ȫ���ã�֧�ֶ��Ӧ�ó���
�Ȳ����Լ����������������������ʹ���ǵ���������ɡ�

Java Web Applications are packaged as Web Archive (WAR--Web ARchive) and it has a defined structure.
 You can export above dynamic web project as WAR file and unzip it to check the 
 hierarchy. It will be something like below image.
 
 					Web Archive Root Directory
 					
 	Static(optional)		META-INF				WEB-INF
 	Contains JSPs,HTMLs      MANIFEST.MF         
 	Images and static files	  
 										   classes				lib						web.xml
 										   Contains Servlet		Contains jars			Deployment descriptor
 										   
 
Deployment Descriptor
web.xml file is the deployment descriptor of the web application and contains mapping 
for servlets (prior to 3.0---3.0֮ǰ), welcome pages, security configurations, session timeout settings etc.										  
 										   Java Classes
