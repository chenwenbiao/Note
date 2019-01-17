package org.java.core.base.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter{

	/**
	 * true if the log record should be published.
	 */
	@Override
	public boolean isLoggable(LogRecord record) {
		// don't log CONFIG logs in file
		// �������ΪLevel.CONFIG,��ô�Ͳ�����
		if (record.getLevel() == Level.CONFIG) return false;
		return true;
	}

}
