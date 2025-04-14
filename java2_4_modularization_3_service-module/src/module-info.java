module api.service.provider {
	/* Even after adding the module-path, Consumer APIs will not get access to all the modules
	 * except the modules exported here to be accessed:
	 * 
	 */
	exports Api.Service.Sorting.Util;
	
	/* This way we can prevent the consumers from accessing BubbleSort class directly.
	 * But i we want to expose, we can export it as well
	 */
	
	exports Api.Service.Sorting.Algorithm;
}