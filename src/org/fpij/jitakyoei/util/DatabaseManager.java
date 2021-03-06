package org.fpij.jitakyoei.util;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ext.ExtObjectContainer;

public class DatabaseManager {
	public static final String DATABASE_LOCATION = "fpijDB";
	private static ExtObjectContainer db;
	

	public static ExtObjectContainer getConnection() {
		return db;
	}
	
	static {
		ObjectContainer objectContainer = Db4o.openFile(DATABASE_LOCATION);
		db = objectContainer.ext();
	}

	public static void close() {
		if (!db.isClosed())
			db.close();
	}
}
