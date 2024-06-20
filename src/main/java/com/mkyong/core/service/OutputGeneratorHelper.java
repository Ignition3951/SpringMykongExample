package com.mkyong.core.service;

public class OutputGeneratorHelper {
	
	private OutputGenerator outputGenerator;

	public OutputGenerator getOutputGenerator() {
		return outputGenerator;
	}

	public void setOutputGenerator(OutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
	
	public void generateOutput() {
		outputGenerator.generateOutput();
	}

}
