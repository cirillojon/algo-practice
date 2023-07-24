# Define the graph as an adjacency list
graph = {
  'A' : ['B','C'],
  'B' : ['D'],
  'C' : ['E','F'],
  'D' : [],
  'E' : [],
  'F' : []
}

# List to keep track of nodes that we have visited
visitednode = []

# Function to perform depth-first search (DFS)
def dfs(visitednode, graph, node): 

    # Check if the node has not been visited
    if node not in visitednode:

        # Print the current node
        print (node)

        # Mark the node as visited by adding it to the visited list
        visitednode.append(node)

        # For each neighbor of the current node, perform a depth-first search
        for nn in graph[node]:
            dfs(visitednode, graph, nn)

# Call the DFS function starting from node '1'
dfs(visitednode, graph, 'A')
