JSON�㷺����WebӦ�ó�����������Ӧ����Ϊ����XML�������Ҹ����ա� JSON�������ڶ�д�������������֧��JSON���� 
�����Java Web�����е�JSON�ǳ��ܻ�ӭ��ԭ��

JSON API�ṩ������JSON����ʽ��

����ģ��API - ��������DOM Parser��������С����
Streaming API - ����StaX Parser���ƣ�����������ϣ�����������������ڴ��еĴ��Ͷ���

JSON API provides two ways for JSON processing:

1. Object Model API �C It��s similar to DOM Parser 
and good for small objects.
2. Streaming API �C It��s similar to StaX Parser 
and good for large objects where you don��t want to keep whole object in memory.

Java JSON API��һЩ��Ҫ�ӿ��ǣ�

javax.json.JsonReader�����ǿ���ʹ��������JSON����������ȡ��JsonObject�� ���ǿ��Դ�Json���JsonReaderFactory��ȡJsonReader��
javax.json.JsonWriter�����ǿ���ʹ��������JSON����д���������
javax.json.stream.JsonParser���������Ϊ������������Ϊ��ȡJSON�����ṩ��֧�֡�
javax.json.stream.JsonGenerator�����ǿ���ʹ������������ʽ��JSON����д�����Դ��
javax.json.Json���������ڴ���JSON�������Ĺ����ࡣ �����ṩ�˴�����Щ��������Ӧ��������÷����� �������ṩ�˴�����Щ����ĸ��ַ�����
javax.json.JsonObject��JsonObject��ʾ���ɱ��JSON����ֵ��

