package assign.asttomodel.impl;

import ru.ifmo.rain.astrans.asttomodel.ITransformationContextFactory;
import assign.asttomodel.IAssignastToAssignResolver;
import assign.asttomodel.IAssignastToAssignTrace;


public class AssignTransformationContextFactory implements ITransformationContextFactory<IAssignastToAssignResolver, IAssignastToAssignTrace> {

	private final AssignTrace trace = new AssignTrace();
	private final IAssignastToAssignResolver resolver = new AssignResolver(trace);
	
	public IAssignastToAssignResolver createResolver() {
		return resolver;
	}

	public IAssignastToAssignTrace createTrace() {
		return trace;
	}

}
