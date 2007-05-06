package ru.ifmo.rain.astrans.asttomodel.bootstrap.impl;

import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.IAstransastToAstransResolver;
import ru.ifmo.rain.astrans.asttomodel.bootstrap.IAstransastToAstransTrace;

public class ContextFactoryImpl implements ITransformationContextFactory<IAstransastToAstransResolver, IAstransastToAstransTrace> {

	private final IAstransastToAstransResolver resolver;
	private final IAstransastToAstransTrace trace;
	
	public ContextFactoryImpl(String rootPath) {
		TraceImpl traceImpl = new TraceImpl();
		trace = traceImpl; 
		resolver = new ResolverImpl(traceImpl, new FileResolver(rootPath));
	}
	
	public IAstransastToAstransResolver createResolver() {
		return resolver;
	}

	public IAstransastToAstransTrace createTrace() {
		return trace;
	}

}
