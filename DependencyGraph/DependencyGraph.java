package com.tgt.qa.tests.csrportal.DependencyGraph;

import java.util.List;
 
public class DependencyGraph
{
	public void DependencyResolve(List<Node> buildAssemblyList, List<Node> resolveDependencySequence, List<Node> visitedAssembly)
    {
		for(Node node : buildAssemblyList)
        {
            if (!resolveDependencySequence.contains(node))
            {
                if (visitedAssembly.contains(node))
                   return;

                DependencyResolve(node, resolveDependencySequence, visitedAssembly);
                
            }
        }
    }
 
        
	public static void DependencyResolve(Node node, List<Node> resolveDependencyNodes, List<Node> visitedAssembly)
	{

		System.out.println("Visited Node Assembly Name :" + node.assemblyName);
        
		visitedAssembly.add(node);
 
        
		if (node.dependencyNodes == null)
			return;
 
            
		for (Node dependencyNode : node.dependencyNodes)
		{
			if (!resolveDependencyNodes.contains(dependencyNode))
			{
				if (visitedAssembly.contains(dependencyNode))
					return;
                
				DependencyResolve(dependencyNode, resolveDependencyNodes, visitedAssembly);
				resolveDependencyNodes.add(dependencyNode);

			}
            
		}
        
	}
}
