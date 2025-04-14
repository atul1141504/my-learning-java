module api.consumer {
	
	/* To get access to the required modules, add modules to the module path
	 * 
	 * Here, we will define the dependent modules for which this consumer has dependency.
	 * for example: api.service.provider module present in module-info.java file of 
	 * 				project: "java2_4_modularization_3_service-module"
	 * 
	 * Once module path is added, error will get resolved.
	 * 
	 * Also the required packages will be exported from the module-info.java file of 
	 * 				project: "java2_4_modularization_3_service-module" using "export" command
	 * 
	 * This will help in managing the metadata & provides better "ENCAPSULATION"
	 * 
	 */
	
	requires api.service.provider;
	requires java.logging;
	
	
}