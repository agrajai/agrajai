package com.tgt.qa.tests.csrportal.DependencyGraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDependencyGraph 
{
    public static void main(String[] args)
    {
        final Node a = new Node("A");
        final Node b = new Node("B");
        final Node c = new Node("C");
        final Node d = new Node("D");
        final Node e = new Node("E");
        final Node f = new Node("F");

        a.AddDependencyNode(a);    // Node A depends on B
        a.AddDependencyNode(d);    // Node A depends on D
        b.AddDependencyNode(c);    // Node B depends on C
        b.AddDependencyNode(e);    // Node B depends on E
        c.AddDependencyNode(d);    // Node C depends on D
        c.AddDependencyNode(e);    // Node C depends on E
        f.AddDependencyNode(a);    // Node F depends on A

        List<Node> buildAssemblyList = new ArrayList<Node>(){
        {
            add(a);
            add(b);
            add(c);
            add(d);
            add(e);
            add(f);
        }};
        
        ArrayList<Node> resolveDependencySequence = new ArrayList<Node>();
        ArrayList<Node> visitedAssembly = new ArrayList<Node>();
            
        DependencyGraph dg = new DependencyGraph();
        
        dg.DependencyResolve(buildAssemblyList, resolveDependencySequence, visitedAssembly);
        
        // Union Resolved Dependency sequence and Visited Assembly sequence
        resolveDependencySequence.addAll(visitedAssembly);
        
        Iterator<Node> itr = resolveDependencySequence.iterator();

        while (itr.hasNext())
        {
            System.out.println("Build Assembly Node Name :" + itr.next().assemblyName);
        }
    }
}
