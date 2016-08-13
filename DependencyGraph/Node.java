package com.tgt.qa.tests.csrportal.DependencyGraph;

import java.util.ArrayList;
import java.util.List;

public class Node 
{
    public String assemblyName;
    
    public List<Node> dependencyNodes = null;

    public Node(String assemblyName)
    {
    	this.assemblyName = assemblyName;
    }

    public void AddDependencyNode(Node node)
    {
        if (dependencyNodes == null)
        	dependencyNodes = new ArrayList<Node>();

        dependencyNodes.add(node);
    }
}
