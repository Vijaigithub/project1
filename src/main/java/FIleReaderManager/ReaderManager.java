package FIleReaderManager;

import propertyReaderConfi.ReaderAmazonValue;

public class ReaderManager {

	private ReaderManager(){
		
	}
	
	
	public static ReaderManager Readerinsta(){
		ReaderManager r =new ReaderManager();
		return r;
	}
	
	public ReaderAmazonValue ReaderAmazon() throws Exception {
		ReaderAmazonValue rav=new ReaderAmazonValue();
		return rav;
		}
}
