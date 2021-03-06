package model.defect;


public enum Status {
	/**
	 * Defect not yet fixed;
	 */
	NEW,
	/**
	 * Defect is fixed, but must be confirmed by QA;
	 */
	FIXED_TO_CONFIRM,
	/**
	 * Defect is fixed;
	 */
	CONFIRMED_AS_FIXED,
	
	/**
	 * Defect was not successfully fixed;
	 */
	REOPENED, 
	/**
	 * Defect will not be fixed;
	 */
	WILL_NOT_FIX,
	/**
	 * Defect is not a bug;
	 */
	NOT_A_BUG;
}
