package mr.huntlab;

import org.apache.logging.log4j.*;
public class MainLog4j2 {
	static Logger logger = LogManager.getLogger(MainLog4j2.class);
	public static void main(String[] args) {
		
		
		logger.debug("MainLog4j2 main class debug message.");
		logger.error("MainLog4j2 main class error message.");
		logger.info("MainLog4j2 main class info message.");
		logger.fatal("MainLog4j2 main class fatal message.");
		logger.trace("MainLog4j2 main class trace message.");
		logger.warn("MainLog4j2 main class warn message.");
		
	}

}
